package fr.diginamic.fichier;

public class Ville {
    private String nom;
    private final String codeDepartement; //Il y a la Corse

    private final String nomRegion;

    private final String populationTotale;

    public Ville(String nom, String codeDepartement, String nomRegion, String populationTotale) {
        this.nom = nom;
        this.codeDepartement = codeDepartement;
        this.nomRegion = nomRegion;
        this.populationTotale = populationTotale;
    }

    @Override
    public String toString() {
        return "Ville{" +
                "nom='" + nom + '\'' +
                ", codeDepartement='" + codeDepartement + '\'' +
                ", nomRegion='" + nomRegion + '\'' +
                ", populationTotale='" + populationTotale + '\'' +
                '}';
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCodeDepartement() {
        return codeDepartement;
    }


    public String getNomRegion() {
        return nomRegion;
    }

    public String getPopulationTotale() {
        return populationTotale;
    }
}
