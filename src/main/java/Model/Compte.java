package Model;

import java.util.Date;

public class Compte {
    private int idCompte;
    private double debit;
    private Date dateOuverture;
    private double tauxInteret;
    private int idUtilisateur;


    public Compte() {}

    public Compte(int idCompte, double debit, Date dateOuverture, double tauxInteret, int idUtilisateur) {
        this.idCompte = idCompte;
        this.debit = debit;
        this.dateOuverture = dateOuverture;
        this.tauxInteret = tauxInteret;
        this.idUtilisateur = idUtilisateur;
    }


    public int getIdCompte() {
        return idCompte;
    }

    public void setIdCompte(int idCompte) {
        this.idCompte = idCompte;
    }

    public double getDebit() {
        return debit;
    }

    public void setDebit(double debit) {
        this.debit = debit;
    }

    public Date getDateOuverture() {
        return dateOuverture;
    }

    public void setDateOuverture(Date dateOuverture) {
        this.dateOuverture = dateOuverture;
    }

    public double getTauxInteret() {
        return tauxInteret;
    }

    public void setTauxInteret(double tauxInteret) {
        this.tauxInteret = tauxInteret;
    }

    public int getIdUtilisateur() {
        return idUtilisateur;
    }

    public void setIdUtilisateur(int idUtilisateur) {
        this.idUtilisateur = idUtilisateur;
    }
}
