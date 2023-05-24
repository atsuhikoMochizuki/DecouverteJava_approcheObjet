package fr.diginamic.listes;

import mochizukiTools.Utils;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TestListeInt {
    public static void main(String[] args) {

        Utils.msgTitle("EXERCICE 3");

        int[] tableau = {-1, 5, 7, 3, -2, 4, 8, 5};

        ArrayList<Integer> list4 = new ArrayList<>();
        for (int i = 0; i < tableau.length; i++)
            list4.add(tableau[i]);

        Utils.msgResult("Affichage de la liste : ");
        Iterator<Integer> iterator1 = list4.iterator();
        while (iterator1.hasNext())
            System.out.println(iterator1.next());

        Utils.msgInfo("Recherche de l'éléments le plus grand : ");
        Integer biggieNbr = 0;
        iterator1 = list4.iterator();
        while (iterator1.hasNext()) {
            Integer number = iterator1.next();
            if (number > biggieNbr)
                biggieNbr = number;
        }
        String strForMsg = "Le nombre le plus grand dans la liste est :" + biggieNbr + "\n";
        Utils.msgResult(strForMsg);

        Utils.msgTitle("Suppression de l'élément le plus petit de la liste");
        iterator1 = list4.iterator();

        Integer minimum_number = 65535;
        while (iterator1.hasNext()) {
            Integer number = iterator1.next();
            if (number < minimum_number)
                minimum_number = number;
        }

        strForMsg = "Le nombre le plus petit dans la liste est :" + minimum_number;
        Utils.msgInfo(strForMsg);

        iterator1 = list4.iterator();
        while (iterator1.hasNext()) {
            Integer number = iterator1.next();
            if (number.equals(minimum_number)) {
                Utils.msgInfo("Suppression de l'élément...");
                iterator1.remove();
            }
        }
        Utils.msgInfo("Affichage de la nouvelle liste");
        iterator1 = list4.iterator();
        while (iterator1.hasNext()) {
            Integer number = iterator1.next();
            System.out.println(String.valueOf(number));
        }

        Utils.msgInfo("Transformation des éléments négatifs en éléments positifs:");

        ListIterator<Integer> listIt = list4.listIterator();
        while (listIt.hasNext()) {
            Integer number = listIt.next();
            if (number < 0) {
                listIt.set(Math.abs(number));
            }
        }

        Utils.msgResult("Affichage de la nouvelle liste : ");
        iterator1 = list4.iterator();
        while (iterator1.hasNext()) {
            Integer number = iterator1.next();
            System.out.printf("%d", number);
        }
    }
}