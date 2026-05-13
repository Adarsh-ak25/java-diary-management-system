package com.diary;

import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;

public class EntriesController {

    @FXML
    private DatePicker entryDatePicker;

    @FXML
    private TextArea entryTextArea;

    @FXML
    public void handleLoadEntry() {

        System.out.println("Load Entry Clicked");
    }

    @FXML
    public void handleUpdateEntry() {

        System.out.println("Update Entry Clicked");
    }

    @FXML
    public void handleBack() {

        System.out.println("Back Button Clicked");
    }
}