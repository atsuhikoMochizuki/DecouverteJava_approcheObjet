package fr.diginamic.entites;
import fr.diginamic.entites2.Personne;
import mochizukiTools.Utils;

public class TestPersonne {
    public static void run() {
        AdressePostale adrActeur1 = new AdressePostale(18, "chemin des palourdes", 65000, "Rambouiller");
        AdressePostale adrActeur2 = new AdressePostale(45, "Avenue de la Garenne", 28000, "Niort");

        Personne acteur1 = new Personne("Dujardin", "Jean", adrActeur1);
        Personne acteur2 = new Personne("Bronchard", "Ismaël", adrActeur2);

        Utils.msgInfo("Modification d'un utilisateur:");
        String strMsg = "Valeur actuelle : "+ acteur1;
        Utils.msgInfo(strMsg);

        acteur1.setFirstName("Zidane");
        acteur1.setLastName("Zinedine");
        acteur1.setAdress(adrActeur1,2058,"chemin des Alouettes",32000, "Roncevaux");
        strMsg = "Nouvelle valeur : "+ acteur1;
        Utils.msgInfo(strMsg);
    }
}
