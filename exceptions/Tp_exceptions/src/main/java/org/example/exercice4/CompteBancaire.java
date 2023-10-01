package org.example.exercice4;

class CompteBancaire {
    private double solde;

    public CompteBancaire(double soldeInitial) {
        this.solde = soldeInitial;
    }

    public void retirerArgent(double montant) throws SoldeInsuffisantException {
        if (montant > solde) {
            throw new SoldeInsuffisantException("Solde insuffisant pour effectuer le retrait.");
        } else {
            solde -= montant;
        }
    }

    public double getSolde() {
        return solde;
    }
}
