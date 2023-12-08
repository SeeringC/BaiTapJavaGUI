package com.example.delete;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.Pane;

import java.io.IOException;

public class MessengerChat implements UILayer {
    @FXML
    private Pane currentPane;
    @Override
    public void onInit() {

    }

    @Override
    public void onClose() {

    }

    @FXML
    private void switchToMessenger(ActionEvent event) throws IOException {
        UIManager.getIns(UIManager.class).openScene(currentPane, "MessengerChat.fxml");
    }
}
