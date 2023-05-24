package fr.diginamic.fichier;


import mochizukiTools.Utils;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;



public class LectureFichierAvecInstanciation {
    public static final String RECENSEMENT_CSV_UPPER_25000_FILTER = "./recensement_filter_popUpper25000.csv";
    public static void run() throws Exception {
        Utils.msgTitle("Exercice 3 : Lire fichier avec instanciation");

        Utils.msgTitle("Instanciation des 36 communes de France...");
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


//        Utils.msgDebug("Verification...");
//            while(iterVille.hasNext()){
//                System.out.println(iterVille.next().toString());
//            }
        Utils.msgResult("Instanciation OK");

        Utils.msgTitle("Exercice 4 : Générer Fichier");
        ListIterator<Ville> iterVille = villes.listIterator();
        iterVille = villes.listIterator();
        nbrLignes = false;
        Path pathCible = Paths.get(RECENSEMENT_CSV_UPPER_25000_FILTER);
        Utils.msgInfo("Ecriture des données dans le fichier "+RECENSEMENT_CSV_UPPER_25000_FILTER);
        while (iterVille.hasNext()) {
            if (!nbrLignes) {
                Files.writeString(pathCible, "Nom de la commune;Code département;Nom de la région;Population totale;\n");
                nbrLignes = true;
            } else {
                Ville ville = iterVille.next();
                /* Nota : Les milliers sont séparés par des espaces dans le fichier*/
                if (Long.parseLong(ville.getPopulationTotale().trim().replaceAll(" ","")) > 25000) {
                    String lineToWrite = ville.getNom()+";"+ville.getCodeDepartement()+";"+ville.getNomRegion()+";"+ville.getPopulationTotale()+";\n";
                    Files.writeString(pathCible, lineToWrite, StandardOpenOption.APPEND);
                }
            }
        }
        Utils.msgResult("Ecriture terminée");
    }
}

