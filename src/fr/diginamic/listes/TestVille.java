package fr.diginamic.listes;

import mochizukiTools.Utils;

import java.util.ArrayList;
import java.util.Collections;

public class TestVille {
    public static void run() {
        ArrayList<Ville> villes = new ArrayList<>();
        villes.add(new Ville("Nice", 343000));
        villes.add(new Ville("Carcassonne", 47800));
        villes.add(new Ville("Narbonne", 53400));
        villes.add(new Ville("Lyon", 484000));
        villes.add(new Ville("Foix", 9700));
        villes.add(new Ville("Pau", 77200));
        villes.add(new Ville("Marseille", 850700));
        villes.add(new Ville("Tarbes", 40600));

        // Collection représente le concept de Collection : ArrayList implémente Collection
        // Cela a pour effet qu'ArrayList a une liste de méthode imposée par Collection

        ComparatorHabitants cmp_hab = new ComparatorHabitants();

        Utils.msgTitle("Tri des villes par habitants :");
        Utils.msgInfo("Affichage liste actuelle : ");
        for (Ville ville : villes) {
            System.out.println(ville);
        }
        Utils.msgInfo("Réagencement...");
        Collections.sort(villes, cmp_hab);
        Utils.msgInfo("Nouvelle liste: ");
        for (Ville v : villes) {
            System.out.println(v);
        }

        ComparatorNom cmp_nom = new ComparatorNom();

        Utils.msgTitle("Tri des villes par ordre alphabétique :");
        Utils.msgInfo("Affichage liste actuelle : ");
        for (Ville ville : villes) {
            System.out.println(ville);
        }
        Utils.msgInfo("Réagencement...");
        Collections.sort(villes, cmp_nom);
        Utils.msgInfo("Nouvelle liste: ");
        for (Ville v : villes) {
            System.out.println(v);
        }


//        Ville ville = Collections.min(villes, new VilleNomComparator());
//        System.out.println(ville);
//
//        System.out.println("-----------------------------");
//        for (Ville v: villes) {
//            System.out.println(v);
//        }

    }
}
