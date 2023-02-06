package com.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class PriceCountController {

    @FXML
    private TextField heihgt;

    @FXML
    private Text res;

    @FXML
    private TextField width;

    @FXML
    private TextField length;

    @FXML
    private TextField weight;



    public void play(ActionEvent actionEvent) {
        double we = Double.parseDouble(String.valueOf(weight.getText()));
        double wi = Double.parseDouble(String.valueOf(width.getText()));
        double he = Double.parseDouble(String.valueOf(heihgt.getText()));
        double le = Double.parseDouble(String.valueOf(length.getText()));
        double resault = (wi * le * he)*0.1 + 0.3*we;
        res.setText(String.valueOf(resault));
    }
}

