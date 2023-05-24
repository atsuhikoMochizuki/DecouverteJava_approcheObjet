package fr.diginamic.banque.entites;

public class CompteTaux extends Compte{
    private double tauxRemuneration;

    public CompteTaux(long ID, double solde, double tauxRemuneration) {
        super(ID, solde);
        this.tauxRemuneration = tauxRemuneration;
    }

    @Override
    public String toString() {
        return "CompteTaux = {ID:"+super.getID()+"; Solde:"+super.getSolde()+" ; TauxRemuneration: "+this.tauxRemuneration+"}";
    }
}
