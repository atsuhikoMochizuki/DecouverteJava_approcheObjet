package fr.diginamic.entites;

public class AdressePostale {
    int numeroDeRue;
    String libelleDeRue;
    int codePostal;
    String ville;

    public AdressePostale(int numeroDeRue, String libelleDeRue, int codePostal, String ville) {
        this.numeroDeRue = numeroDeRue;
        this.libelleDeRue = libelleDeRue;
        this.codePostal = codePostal;
        this.ville = ville;
    }

    public void setNumeroDeRue(int numeroDeRue) {
        this.numeroDeRue = numeroDeRue;
    }

    public void setLibelleDeRue(String libelleDeRue) {
        this.libelleDeRue = libelleDeRue;
    }

    public void setCodePostal(int codePostal) {
        this.codePostal = codePostal;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    @Override
    public String toString() {
        return "AdressePostale{" +
                "numeroDeRue=" + numeroDeRue +
                ", libelleDeRue='" + libelleDeRue + '\'' +
                ", codePostal=" + codePostal +
                ", ville='" + ville + '\'' +
                '}';
    }
}
