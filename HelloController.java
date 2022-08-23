package com.example.final3;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.shape.Circle;
public class HelloController {
    @FXML
    private Button leftButton;
    @FXML
    private Button upButton;
    @FXML
    private Button downButton;
    @FXML
    private Button rightButton;
    @FXML
    private Button searchButton;
    @FXML
    private Button attackButton;
    @FXML
    private Button sleepButton;
    @FXML
    private Button runButton;
    private double x;
    private double y;
    @FXML
    private Circle playerAvatar;
    @FXML
    private GridPane controllerGrid;

    @FXML
    public void upClicked(ActionEvent actionEvent) {

    }
    @FXML
    public void leftClicked(ActionEvent actionEvent) {
        playerAvatar.setCenterX(x-=10);
    }
    @FXML
    public void downClicked(ActionEvent actionEvent) {
        playerAvatar.setCenterY(y+=10);
    }
    @FXML
    public void rightClicked(ActionEvent actionEvent) {
        playerAvatar.setCenterX(x+=10);
    }
}
