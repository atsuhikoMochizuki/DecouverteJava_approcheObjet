package fr.diginamic.listes.tri;

import fr.diginamic.listes.ComparatorHabitants;
import fr.diginamic.listes.ComparatorNom;
import fr.diginamic.listes.TestVille;
import fr.diginamic.listes.Ville;
import mochizukiTools.Utils;

import java.util.ArrayList;
import java.util.Collections;


public class TriDeVille {
    public static void main(String[] args) {
        ArrayList<Ville> villes = new ArrayList<>();
        villes.add(new Ville("Nice", 343000));
        villes.add(new Ville("Carcassonne", 47800));
        villes.add(new Ville("Narbonne", 53400));
        villes.add(new Ville("Lyon", 484000));
        villes.add(new Ville("Foix", 9700));
        villes.add(new Ville("Pau", 77200));
        villes.add(new Ville("Marseille", 850700));
        villes.add(new Ville("Tarbes", 40600));

        Utils.msgTitle("Tri des villes par nbre d'habitants");
        Utils.msgInfo("Liste actuelle : ");
        for (Ville ville : villes)
            System.out.printf("%d ",ville.toString());
        ComparatorHabitants cmp_hab = new ComparatorHabitants();
        Collections.sort(villes,cmp_hab);
        Utils.msgInfo("Nouvelle liste : ");
        for (Ville ville : villes)
            System.out.printf("%d ",ville.toString());

        Utils.msgTitle("Tri des villes par ordre alphabétique");
        Utils.msgInfo("Liste actuelle : ");
        for (Ville ville : villes)
            System.out.printf("%d ",ville.toString());
        ComparatorNom cmp_nom = new ComparatorNom();
        Collections.sort(villes, cmp_nom);
        for (Ville ville : villes)
            System.out.println(ville.toString());
        Utils.msgInfo("Nouvelle liste : ");
        for (Ville ville : villes)
            System.out.printf("%d ",ville.toString());
    }
}

