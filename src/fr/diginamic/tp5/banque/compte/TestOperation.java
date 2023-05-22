package fr.diginamic.tp5.banque.compte;

import mochizukiTools.Utils;

public class TestOperation {
    public static void main(String[] args) {
        Operation[] operations = new Operation[8];
        operations[0] = new Credit("22/05/2023",450);
        operations[1] = new Credit("22/05/2023",200);
        operations[2] = new Credit("22/05/2023",150);
        operations[3] = new Credit("22/05/2023",1500);
        operations[4] = new Debit("22/05/2023",46);
        operations[5] = new Debit("22/05/2023",241);
        operations[6] = new Debit("22/05/2023",8);
        operations[7] = new Debit("22/05/2023",900);

        for (Operation op: operations)
            System.out.println(op.toString());

        Utils.msgInfo("Montant de global des opérations :");
        double montantGlobal = 0;
        for (Operation op: operations)
        {
            if(op.getType().equals("CREDIT"))
                montantGlobal +=op.montant;
            else
                montantGlobal -=op.montant;
        }
        String str2 = "Montant global des opérations: "+montantGlobal+" Euros";
        Utils.msgResult(str2);
    }
}
