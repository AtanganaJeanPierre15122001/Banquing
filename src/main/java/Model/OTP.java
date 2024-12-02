package Model;

public class OTP {
    private int id;
    private String genre;
    private int idUtilisateur;


    public OTP() {}

    public OTP(int id, String genre, int idUtilisateur) {
        this.id = id;
        this.genre = genre;
        this.idUtilisateur = idUtilisateur;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getIdUtilisateur() {
        return idUtilisateur;
    }

    public void setIdUtilisateur(int idUtilisateur) {
        this.idUtilisateur = idUtilisateur;
    }
}
