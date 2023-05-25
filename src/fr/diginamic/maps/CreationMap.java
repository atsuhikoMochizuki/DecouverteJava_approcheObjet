package fr.diginamic.maps;

import mochizukiTools.Utils;

import java.util.HashMap;

public class CreationMap {
    public static void run()
    {
        Utils.msgTitle("APPRENDRE A UTILISER MAP et HASHMAP");
        Utils.msgTitle("EXERCICE1");
        HashMap<Integer, String> mapSalaires = new HashMap<>();
        String msg = "taille de la map mapSalaires :"+mapSalaires.size();
        Utils.msgResult(msg);

    }
}
