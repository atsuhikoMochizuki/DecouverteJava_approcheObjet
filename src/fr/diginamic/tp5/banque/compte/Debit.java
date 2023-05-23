package fr.diginamic.tp5.banque.compte;

public class Debit extends Operation{
    public Debit(String operationDate, double montant) {
       super(operationDate, montant);

    }
    @Override
    public String toString()
    {
        String str = "Date opération: "+operationDate+"=="+getType()+"=> Montant: -"+montant+" Euros";
        return str;
    }

    public String getType()
    {
        return "DEBIT";
    }

}
