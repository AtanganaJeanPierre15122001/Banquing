package Model;

public class Admin {
    private int idAdmin;
    private int idUtilisateur;


    public Admin() {}

    public Admin(int idAdmin, int idUtilisateur) {
        this.idAdmin = idAdmin;
        this.idUtilisateur = idUtilisateur;
    }


    public int getIdAdmin() {
        return idAdmin;
    }

    public void setIdAdmin(int idAdmin) {
        this.idAdmin = idAdmin;
    }

    public int getIdUtilisateur() {
        return idUtilisateur;
    }

    public void setIdUtilisateur(int idUtilisateur) {
        this.idUtilisateur = idUtilisateur;
    }
}
