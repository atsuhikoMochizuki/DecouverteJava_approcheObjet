package fr.diginamic.tp5.banque.compte;

public class Compte {
    private long nbr;
    private float sold;

    public Compte(long nbr, float sold) {
        this.nbr = nbr;
        this.sold = sold;
    }

    @Override
    public String toString() {
        return "Compte{" +
                "nbr=" + nbr +
                ", sold=" + sold +
                '}';
    }

    public long getNbr() {
        return nbr;
    }

    public void setNbr(long nbr) {
        this.nbr = nbr;
    }

    public float getSold() {
        return sold;
    }

    public void setSold(float sold) {
        this.sold = sold;
    }
}
