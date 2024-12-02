package Model;

public class BankCard {
    private int idCarte;
    private String typeCarte;
    private int idClient;


    public BankCard() {}

    public BankCard(int idCarte, String typeCarte, int idClient) {
        this.idCarte = idCarte;
        this.typeCarte = typeCarte;
        this.idClient = idClient;
    }

    // Getters et Setters
    public int getIdCarte() {
        return idCarte;
    }

    public void setIdCarte(int idCarte) {
        this.idCarte = idCarte;
    }

    public String getTypeCarte() {
        return typeCarte;
    }

    public void setTypeCarte(String typeCarte) {
        this.typeCarte = typeCarte;
    }

    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }
}
