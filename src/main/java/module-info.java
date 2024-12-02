module com.example.banquing {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;
    requires java.sql;

    opens com.example.banquing to javafx.fxml;
    exports com.example.banquing;
}