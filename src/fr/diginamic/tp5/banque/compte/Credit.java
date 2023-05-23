package fr.diginamic.tp5.banque.compte;

public class Credit extends Operation{
    public Credit(String operationDate, double montant) {
        super(operationDate, montant);
    }

    public String toString()
    {
        String str = "Date opération: "+operationDate+"=="+getType()+"=> Montant: +"+montant+" Euros";
        return str;
    }
@Override
    public String getType()
    {
        return "CREDIT";
    }
}
