module com.example.correctionpoint {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.correctionpoint to javafx.fxml;
    exports com.example.correctionpoint;
}