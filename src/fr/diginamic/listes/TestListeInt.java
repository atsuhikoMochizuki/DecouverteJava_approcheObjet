package fr.diginamic.listes;

import mochizukiTools.Utils;

import java.util.ArrayList;
import java.util.Iterator;

public class TestListeInt {
    public static void main(String[] args) {
        int [] tableau = {-1, 5, 7, 3, -2, 4, 8, 5};
        ArrayList <Integer> list4 = new ArrayList<>();

        for(int i = 0; i< tableau.length;i++)
            list4.add(tableau[i]);

        Iterator<Integer> iterator1 = list4.iterator();
        while(iterator1.hasNext())
            System.out.println(iterator1.next());

        Utils.msgInfo("Recherche de l'éléments le plus grand : ");
        Integer biggieNbr = 0;
        iterator1= list4.iterator();

        while(iterator1.hasNext())
        {
            Integer number = iterator1.next();
            if(number>biggieNbr)
                biggieNbr = number;
        }
        String strForMsg = "Le nombre le plus grand dans la liste est :"+biggieNbr;
        Utils.msgResult(strForMsg);
     }
}
