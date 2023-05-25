package fr.diginamic.maps;

import mochizukiTools.Utils;

import java.util.HashMap;
import java.util.Iterator;

public class CreationEtManipulationMap {
    public static void run() {
        HashMap<Integer, String> mapVilles = new HashMap<>();
        mapVilles.put(13, "Marseille");
        mapVilles.put(34, "Montpellier");
        mapVilles.put(44, "Nantes");
        mapVilles.put(75, "Paris");
        mapVilles.put(31, "Toulouse");
        mapVilles.put(59, "Lille");
        mapVilles.put(69, "Lyon");
        mapVilles.put(33, "Bordeaux");

        Iterator<Integer> keysIte = mapVilles.keySet().iterator();
        Utils.msgResult("Liste des clés contenues dans la map:");
        while (keysIte.hasNext()) {
            Integer key = keysIte.next();
            System.out.println("->" + key);
        }


        Utils.msgResult("Liste des valeurs contenues dans la map:");
        Iterator<String> valuesIte = mapVilles.values().iterator();
        while (valuesIte.hasNext()) {
            String ville = valuesIte.next();
            System.out.println("->" + ville);
        }

        String msg = "taille de la map mapVilles :"+mapVilles.size();
        Utils.msgResult(msg);
    }
}
