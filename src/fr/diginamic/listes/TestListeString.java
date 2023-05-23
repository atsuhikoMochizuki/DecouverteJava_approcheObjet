package fr.diginamic.listes;

import mochizukiTools.Utils;

import java.util.ArrayList;
import java.util.ListIterator;

public class TestListeString {
    public static void main(String[] args) {
        ArrayList<String> listeVilles = new ArrayList<>();
        String[] villes = {"Nice", "Carcassonne", "Narbonne", "Lyon", "Foix", "Pau", "Marseille", "Tarbes"};
        for(int i =0; i< villes.length;i++)
            listeVilles.add(villes[i]);

        String villeTest = "";
        ListIterator<String> it = listeVilles.listIterator();
        while(it.hasNext())
        {
            String str = it.next();
            int strLength = str.length();
            if(strLength > villeTest.length())
                villeTest = str;
        }
        String strForMsg = "Le nom de la ville la plus grande est "+villeTest;
        Utils.msgResult(strForMsg);

        Utils.msgTitle("On passe en majuscules tous les noms de ville");
        it = listeVilles.listIterator();
        while(it.hasNext())
        {
            String str = it.next();
            it.set(str.toUpperCase());
        }

        Utils.msgInfo("Rafraichissement de la liste...");
        it = listeVilles.listIterator();
        while(it.hasNext())
        {
            String str = it.next();
            System.out.printf("%s\n",str);
        }

        Utils.msgTitle("Suppression de toutes les villes dont le nom commence par la lettre N...");
        it = listeVilles.listIterator();
        while(it.hasNext())
        {
            String str = it.next();
            if(str.substring(0,1).equals("N"))
                it.remove();
        }
        Utils.msgInfo("Rafraichissement de la liste...");
        it = listeVilles.listIterator();
        while(it.hasNext())
        {
            String str = it.next();
            System.out.printf("%s\n",str);
        }
    }
}
