package fr.diginamic.listes;

import fr.diginamic.tp5.banque.compte.Operation;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

public class CreationListe {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 1; i<=100 ; i++)
            list.add(i);

        Iterator<Integer> iterator = list.iterator();

        while (iterator.hasNext()) {
            Integer number = iterator.next();

            System.out.println(number);
        }

        System.out.println("La taille de l'ArrayList : "+list.size());

    }
}
