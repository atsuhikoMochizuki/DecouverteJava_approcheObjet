package fr.diginamic.tp1.entites;
import fr.diginamic.tp1.entites2.Personne;
import mochizukiTools.Utils;

public class TestPersonne {
    public static void run(){
        AdressePostale adrActeur1 = new AdressePostale(18, "chemin des palourdes", 65000, "Rambouiller");
        Personne acteur1 = new Personne("Dujardin", "Jean", adrActeur1);
        acteur1.showFirstAndLastName();
        acteur1.setFirstName("Zidane");
        acteur1.setLastName("Zinedine");
        acteur1.showFirstAndLastName();
        String nameActeur1 = acteur1.getName();



       /* AdressePostale adrActeur2 = new AdressePostale(25, "place Mozart", 15000, "Cahors");
        Personne acteur2 = new Personne("Cornillac", "Clovis", adrActeur2);

        System.out.printf("=> Personne1 : %s\n", acteur1.toString());
        System.out.printf("=> Personne2 : %s\n", acteur2.toString());*/
    }
}
