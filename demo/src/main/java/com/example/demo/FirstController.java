package com.example.demo;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class FirstController {

    @FXML
    private VBox vBoxPane;

    @FXML
    private Button button;

    @FXML
    private Button calculate;

    Stage mainStage;

//    @FXML
//    void 8d8d8d(ActionEvent event) {
//    }

    @FXML
    void priceCount(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Price_count.fxml"));
        Stage stage = new Stage();

        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        stage.setTitle("Post");
        stage.setScene(scene);
        stage.show();
    }

    public void Sup(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Support.fxml"));
        Stage stage = new Stage();

        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        stage.setTitle("Post support");
        stage.setScene(scene);
        stage.show();
    }

    public void whereis(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Search_post_office.fxml"));
        Stage stage = new Stage();

        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        stage.setTitle("Searching");
        stage.setScene(scene);
        stage.show();
    }
}
