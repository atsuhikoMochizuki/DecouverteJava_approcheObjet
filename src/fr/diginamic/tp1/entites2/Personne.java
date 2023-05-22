package fr.diginamic.tp1.entites2;

import fr.diginamic.tp1.entites.*;

public class Personne {
    public String name;
    public String prenom;
    public AdressePostale addresse;


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


    @Override
    public String toString() {
        return "Personne{" + "name='" + name + '\'' + ", prenom='" + prenom + '\'' + ", addresse=" + addresse + '}';
    }
}
