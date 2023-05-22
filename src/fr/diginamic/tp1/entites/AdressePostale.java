package fr.diginamic.tp1.entites;

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
