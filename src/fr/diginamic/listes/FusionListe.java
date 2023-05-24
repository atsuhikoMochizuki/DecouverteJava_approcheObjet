package fr.diginamic.listes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FusionListe {
    public static void main(String[] args) {
        List<String> liste1 = new ArrayList<String>();
        liste1.add("Rouge");
        liste1.add("Vert");
        liste1.add("Orange");

        List<String> liste2 = new ArrayList<String>();
        liste2.add("Blanc");
        liste2.add("Bleu");
        liste2.add("Orange");

        ArrayList<String> liste3 = new ArrayList<>();

        Iterator<String> iterator1 = liste1.iterator();
        Iterator<String> iterator2 = liste2.iterator();

        while (iterator1.hasNext()) {
            liste3.add(iterator1.next());
        }
        while (iterator2.hasNext()) {
            liste3.add(iterator2.next());
        }

        Iterator<String> interator3 = liste3.iterator();
        System.out.println("Eléments de la liste3:");
        Iterator<String> interator4 = liste3.iterator();
        while (interator4.hasNext()) {
            String str = interator4.next();
            System.out.println(" -"+str);
        }





    }
}
