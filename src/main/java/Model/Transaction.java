package Model;

public class Transaction {

    private int idTransaction;
    private String libelle;
    private double frais;
    private String devise;
    private int idUtilisateur;


    public Transaction() {}

    public Transaction(int idTransaction, String libelle, double frais, String devise, int idUtilisateur) {
        this.idTransaction = idTransaction;
        this.libelle = libelle;
        this.frais = frais;
        this.devise = devise;
        this.idUtilisateur = idUtilisateur;
    }


    public int getIdTransaction() {
        return idTransaction;
    }

    public void setIdTransaction(int idTransaction) {
        this.idTransaction = idTransaction;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public double getFrais() {
        return frais;
    }

    public void setFrais(double frais) {
        this.frais = frais;
    }

    public String getDevise() {
        return devise;
    }

    public void setDevise(String devise) {
        this.devise = devise;
    }

    public int getIdUtilisateur() {
        return idUtilisateur;
    }

    public void setIdUtilisateur(int idUtilisateur) {
        this.idUtilisateur = idUtilisateur;
    }
}
