package com.example.tipcalc;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
        import javafx.scene.control.Button;
        import javafx.scene.control.Slider;
        import javafx.scene.control.TextField;

import java.math.BigDecimal;

public class tipCalcController {

    @FXML
    private void calculateButtonPressed(ActionEvent event){


    }

    @FXML
    private TextField amountTextField;

    @FXML
    private Button calculateButton;

    @FXML
    private Label tipPercentageLabel;

    @FXML
    private Slider tipPercentageSlider;

    @FXML
    private TextField tipTextField;

    @FXML
    private TextField totalTextField;
}
