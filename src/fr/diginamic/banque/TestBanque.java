package fr.diginamic.banque;

import fr.diginamic.banque.entites.*;
import mochizukiTools.Utils;

public class TestBanque {
    public static void run()
    {
        Compte[] comptes = new Compte[2];

        comptes[0] = new Compte(12587,15524.45);
        comptes[1] = new CompteTaux(4567,45124.78,0.4);

        for(Compte cpt: comptes)
        {
            String strMsg = cpt.toString();
            Utils.msgResult(strMsg);
        }
    }
}
