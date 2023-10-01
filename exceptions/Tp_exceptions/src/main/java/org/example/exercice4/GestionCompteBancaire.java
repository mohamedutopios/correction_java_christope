package org.example.exercice4;

public class GestionCompteBancaire {
    public static void main(String[] args) {
        CompteBancaire compte = new CompteBancaire(1000);

        try {
            compte.retirerArgent(1500);
        } catch (SoldeInsuffisantException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Solde actuel : " + compte.getSolde());
    }
}
