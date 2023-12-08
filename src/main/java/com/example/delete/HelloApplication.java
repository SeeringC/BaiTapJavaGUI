package com.example.delete;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class HelloApplication extends Application {

    @Override
    public void start(Stage primaryStage) {
        Group root = new Group();

        Text strikethroughText = new Text(50, 50, "Gạch Ngang");
        strikethroughText.setStrikethrough(true);
        root.getChildren().add(strikethroughText);

        Text underlineText = new Text(50, 100, "Gạch Chân");
        underlineText.setUnderline(true);
        root.getChildren().add(underlineText);

        Scene scene = new Scene(root, 400, 200);

        primaryStage.setTitle("Hello World!");

        primaryStage.setScene(scene);

        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
