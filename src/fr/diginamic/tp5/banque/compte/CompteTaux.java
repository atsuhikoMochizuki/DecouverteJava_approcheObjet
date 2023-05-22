package fr.diginamic.tp5.banque.compte;

public class CompteTaux extends Compte{
    private double tauxRemuneration;
    public CompteTaux(long nbr, float sold,double remuneration) {
        super(nbr,sold);
        this.tauxRemuneration = remuneration;
    }

    public double getTauxRemuneration() {
        return tauxRemuneration;
    }

    public void setTauxRemuneration(double tauxRemuneration) {
        this.tauxRemuneration = tauxRemuneration;
    }
    public String toString(){
        return super.toString()+" Taux=" + this.tauxRemuneration;
    }


}
