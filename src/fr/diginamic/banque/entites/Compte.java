package fr.diginamic.banque.entites;

public class Compte {
    private long ID;
    private double solde;

    public Compte(long ID, double solde) {
        this.ID = ID;
        this.solde = solde;
    }

    @Override
    public String toString() {
        return "Compte{" +
                "nbr=" + ID +
                ", sold=" + solde +
                '}';
    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }
}
