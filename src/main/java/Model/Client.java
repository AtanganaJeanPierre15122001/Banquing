package Model;

public class Client {
    private int idClient;
    private String profession;
    private int idUtilisateur;


    public Client() {}

    public Client(int idClient, String profession, int idUtilisateur) {
        this.idClient = idClient;
        this.profession = profession;
        this.idUtilisateur = idUtilisateur;
    }


    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public int getIdUtilisateur() {
        return idUtilisateur;
    }

    public void setIdUtilisateur(int idUtilisateur) {
        this.idUtilisateur = idUtilisateur;
    }
}
