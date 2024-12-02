package Model;

public class Bank {
    private int idBank;
    private String nom;
    private String type;

    // Constructeurs
    public Bank() {}

    public Bank(int idBank, String nom, String type) {
        this.idBank = idBank;
        this.nom = nom;
        this.type = type;
    }

    // Getters et Setters
    public int getIdBank() {
        return idBank;
    }

    public void setIdBank(int idBank) {
        this.idBank = idBank;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
