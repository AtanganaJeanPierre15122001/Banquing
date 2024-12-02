package repositories.Utilisateur;

import Model.Utilisateur;
import com.example.banquing.DatabaseConnection;

import java.sql.Connection;

public class UtilisateurRepositoryImpl implements UtilisateurRepository{


    private Connection connection;

    public UtilisateurRepositoryImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void saveUtilisateur(Utilisateur utilisateur) {
        Connection connection = DatabaseConnection.getConnection();

    }
}
