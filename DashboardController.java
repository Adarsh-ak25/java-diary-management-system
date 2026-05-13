package com.diary;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.event.ActionEvent;

import java.util.ArrayList;

public class DashboardController {

    @FXML
    private DatePicker datePicker;

    @FXML
    private TextArea diaryArea;

    @FXML
    private CheckBox importantCheckBox;

    @FXML
    private TextField searchField;

    private ArrayList<DiaryEntry> entries = new ArrayList<>();

    @FXML
    public void handleSave() {

        String date = datePicker.getValue().toString();

        String content = diaryArea.getText();

        boolean important = importantCheckBox.isSelected();

        DiaryEntry entry =
                new DiaryEntry(date, content, important);

        entries.add(entry);

        System.out.println("Entry Saved!");

        System.out.println("Date: " + entry.getDate());

        System.out.println("Content: " + entry.getContent());

        System.out.println("Important: " + entry.isImportant());
    }

    @FXML
    public void handleSearch() {

        String searchDate = searchField.getText();

        for (DiaryEntry entry : entries) {

            if (entry.getDate().equals(searchDate)) {

                diaryArea.setText(entry.getContent());

                System.out.println("Entry Found!");

                return;
            }
        }

        System.out.println("No Entry Found");
    }
    @FXML
public void handleViewEntries(ActionEvent event) {

    try {

        Parent root = FXMLLoader.load(
                getClass().getResource("/entries.fxml"));

        Stage stage = (Stage) ((Node) event.getSource())
                .getScene()
                .getWindow();

        stage.setScene(new Scene(root));

        stage.show();

    } catch (Exception e) {

        e.printStackTrace();
    }
}
}