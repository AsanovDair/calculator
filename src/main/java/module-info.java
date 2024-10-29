module com.example.gutif {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.gutif to javafx.fxml;
    exports com.example.gutif;
}