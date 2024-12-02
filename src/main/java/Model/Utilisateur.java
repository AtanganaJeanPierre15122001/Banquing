package Model;

public class Utilisateur {


    private String id_Utilisateur;
    private String nom;
    private String prenom;



    private String password;

    public String getId_Utilisateur() {
        return id_Utilisateur;
    }

    public void setId_Utilisateur(String id_Utilisateur) {
        this.id_Utilisateur = id_Utilisateur;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Utilisateur() {}

    public Utilisateur(String id_Utilisateur, String nom, String prenom, String password) {
        this.id_Utilisateur = id_Utilisateur;
        this.nom = nom;
        this.prenom = prenom;
        this.password = password;
    }
}
