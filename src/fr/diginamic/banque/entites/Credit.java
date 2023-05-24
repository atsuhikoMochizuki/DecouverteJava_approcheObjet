package fr.diginamic.banque.entites;

public class Credit extends Operation{
    public Credit(String operationDate, double montant) {
        super(operationDate, montant);
    }

    @Override
    public String toString() {
        return "Opération de "+getType()+" le :"+super.getOperationDate()+" de "+super.getMontant();
    }
}
