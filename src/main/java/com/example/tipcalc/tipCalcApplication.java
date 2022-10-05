package com.example.tipcalc;

import javafx.application.Application;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

//import java.io.IOException;


public class tipCalcApplication extends Application {
 @Override
 public void start(Stage stage) throws Exception {
         Parent root =
                 FXMLLoader.load(getClass().getResource("tipCalc.fxml"));

         Scene scene = new Scene(root);
         stage.setTitle("Tip Calculator");
         stage.setScene(scene);
         stage.show();
         }

         public static void main(String[] args) {

         launch(args);
         }
 }








