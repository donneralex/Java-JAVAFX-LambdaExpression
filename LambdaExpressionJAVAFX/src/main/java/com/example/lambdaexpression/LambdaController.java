package com.example.lambdaexpression;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

public class LambdaController {
    @FXML
    private Label welcomeText;

    @FXML
    private Button button;

    @FXML
    public void initialize(){
        button.addEventHandler(MouseEvent.MOUSE_CLICKED, i ->{welcomeText.setText("Clicked");});
    }
}