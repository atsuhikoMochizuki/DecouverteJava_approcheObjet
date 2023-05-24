package fr.diginamic.banque.entites;

public class Debit extends Operation{
    public Debit(String operationDate, double montant) {
        super(operationDate, montant);
    }

    @Override
    public String toString() {
        return "Opération de "+getType()+" le :"+super.getOperationDate()+" de "+super.getMontant();
    }

    public String getType()
    {
        return "DEBIT";
    }

}
