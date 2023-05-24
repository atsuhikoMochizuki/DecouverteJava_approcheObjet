package fr.diginamic.banque.entites;

public abstract class Operation {
    private String operationDate;
    private double montant;

    public Operation(String operationDate, double montant) {
        this.operationDate = operationDate;
        this.montant = montant;
    }

    public String getOperationDate() {
        return operationDate;
    }

    public void setOperationDate(String operationDate) {
        this.operationDate = operationDate;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }
    @Override
    public abstract String toString();

    public String getType()
    {
        return "CREDIT";
    }
}
