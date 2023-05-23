package fr.diginamic.tp5.banque.compte;

public abstract class Operation {
    String operationDate;
    double montant;

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

    public abstract String toString();
    public abstract String getType();
}
