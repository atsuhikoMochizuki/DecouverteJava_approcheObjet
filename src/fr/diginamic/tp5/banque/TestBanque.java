package fr.diginamic.tp5.banque;
import fr.diginamic.tp5.banque.compte.*;
import mochizukiTools.Utils;

public class TestBanque {
    public static void run()
    {
       Compte account = new Compte(12345,1505.42f);
       String str = ""+account;
        Utils.msgResult(str);
        System.out.println();
        Compte[] comptes = new Compte[2];
        comptes[0] = account;
        comptes[1] = new CompteTaux(123,456,466);

        for (Compte cpt: comptes)
        {
            System.out.println(cpt);
        }



    }
}
