package com.example.tipcalc;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class tipCalcApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(tipCalcApplication.class.getResource("tipCalc.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("tipCalc");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}