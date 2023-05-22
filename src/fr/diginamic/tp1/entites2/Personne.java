package fr.diginamic.tp1.entites2;

import fr.diginamic.tp1.entites.*;

public class Personne {
    private String name;
    private String prenom;
    private AdressePostale addresse;


    public Personne(String name, String prenom, AdressePostale addresse) {
        this.name = name;
        this.prenom = prenom;
        this.addresse = addresse;
    }

    public void showFirstAndLastName() {
        String nameWithFirstUpperCase = this.name.toUpperCase();
        System.out.println(nameWithFirstUpperCase + " " + this.prenom);
    }

    public void setFirstName(String i_firstName) {
        this.name = i_firstName;
    }

    public void setLastName(String i_lastName) {
        this.prenom = i_lastName;
    }


    //Modification de l'adresse
    public void setAdress(AdressePostale adress)
    {

    }

    public String getName()
    {
        return this.name;
    }

    public String getPrenom()
    {
        return this.prenom;
    }

    public AdressePostale getAdresse()
    {
        return this.addresse;
    }



    @Override
    public String toString() {
        return "Personne{" + "name='" + name + '\'' + ", prenom='" + prenom + '\'' + ", addresse=" + addresse + '}';
    }
}
