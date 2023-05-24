package fr.diginamic.utils;

import mochizukiTools.Utils;

public class TestMethodeStatic {
    public static void run() {
        String chaine = "12";
        int convertedString = Integer.parseInt(chaine);
        int a = 25, b = 426;
        chaine = "Le nombre le plus grand entre " + a + " et " + b + " est : " + b;
        Utils.msgResult(chaine);
    }
}
