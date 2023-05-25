package fr.diginamic.maps;

import fr.diginamic.fichier.LectureFichier;
import fr.diginamic.fichier.Ville;
import mochizukiTools.Utils;

import java.util.*;

public class MapVilles {
    public static void run() throws Exception {
        Utils.msgTitle("EXERCICE4");

        HashMap<String, Ville> mapVilles = new HashMap<>();
        Iterator<String> keysIte = mapVilles.keySet().iterator();
        while (keysIte.hasNext()) {
            String key = keysIte.next();
            Ville ville = mapVilles.get(key);
            System.out.println(ville.toString());
        }

        Utils.msgInfo("Instanciation de toutes les communes de France...");
        ArrayList<Ville> villes = new ArrayList<>();
        List<String> liste = LectureFichier.run();
        ListIterator<String> iter = liste.listIterator();
        boolean nbrLignes = false;
        while (iter.hasNext()) {
            if (!nbrLignes) {
                iter.next();
                nbrLignes = true;
            } else {
                String line = iter.next();
                String[] token = line.split(";");
                Ville villeToAdd = new Ville(token[6], token[2], token[1], token[9]);
                villes.add(villeToAdd);
            }
        }

        ListIterator<Ville> iterVille = villes.listIterator();
        while (iterVille.hasNext()) {
            Ville town = iterVille.next();
            Utils.msgInfo("Insertion de la ville " + town.getNom() + " dans la map");
            mapVilles.put(town.getNom(), town);
        }

        Utils.msgInfo("Recherche et suppression de la commune de France possédant le moins d'habitants:");
        Ville villeMinimale = null;
        boolean i = false;
        Iterator<String> keysIter = mapVilles.keySet().iterator();
        while (keysIter.hasNext()) {
            String key = keysIter.next();
            Ville ville = mapVilles.get(key);
            if (!i) {
                villeMinimale = ville;
                i = true;
            } else {
                Long convertedPop = Long.parseLong(ville.getPopulationTotale().trim().replaceAll(" ", ""));
                if (convertedPop < Long.parseLong(villeMinimale.getPopulationTotale().trim().replaceAll(" ", "")))
                    villeMinimale = ville;
            }
        }
        String msg = "La ville la moins peuplée est :" + villeMinimale.getNom() + " avec " + villeMinimale.getPopulationTotale() + " habitants.";
        Utils.msgResult(msg);
        Utils.msgInfo("Suppression de la ville...");
        mapVilles.remove(villeMinimale.getNom());
    }
}
