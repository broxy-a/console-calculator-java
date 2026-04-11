package javaFX;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import javafx.scene.control.Label;

import java.io.IOException;


public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("calculator.fxml"));
        stage.setTitle("Calculator");
        stage.setScene(new Scene(root, 600,400));
        stage.setResizable(false);
        stage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
