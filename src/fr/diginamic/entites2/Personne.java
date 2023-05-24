package fr.diginamic.entites2;

import fr.diginamic.entites.*;

public class Personne {
    private String nom;
    private String prenom;
    private AdressePostale adresse;

    public Personne(String nom, String prenom) {
        this.nom = nom.toUpperCase();
        this.prenom = prenom;
    }
    public Personne(String nom, String prenom, AdressePostale adresse) {
        this.nom = nom.toUpperCase();
        this.prenom = prenom;
        this.adresse = adresse;
    }


    public void showFirstAndLastName() {
        System.out.println(this.nom+ " " + this.prenom);
    }
    public void setFirstName(String i_firstName) {
        this.nom = i_firstName.toUpperCase();
    }

    public void setLastName(String i_lastName) {
        this.prenom = i_lastName;
    }

    //Modification de l'adresse
    public void setAdress(AdressePostale adress,int numRue,String voie,int codePostal,String ville)
    {
        adress.setNumeroDeRue(numRue);
        adress.setLibelleDeRue(voie);
        adress.setCodePostal(codePostal);
        adress.setVille(ville);
    }
    public String getNom()
    {
        return this.nom;
    }

    public String getPrenom()
    {
        return this.prenom;
    }

    public AdressePostale getAdresse()
    {
        return this.adresse;
    }

    @Override
    public String toString() {
        return "Personne{" + "name='" + nom + '\'' + ", prenom='" + prenom + '\'' + ", adresse=" + adresse + '}';
    }
}
