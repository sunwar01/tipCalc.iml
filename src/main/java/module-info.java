module com.example.tipcalc {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.tipcalc to javafx.fxml;
    exports com.example.tipcalc;
}