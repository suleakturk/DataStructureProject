module com.example.datastructureproject {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.datastructureproject to javafx.fxml;
    exports com.example.datastructureproject;
}