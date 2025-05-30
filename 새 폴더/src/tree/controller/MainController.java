package tree.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class MainController {

    @FXML private VBox taskContainer;
    @FXML private TextField taskInput;

    @FXML private ImageView plantImage;
    @FXML private CheckBox feedCheckBox;

    @FXML
    private void switchToLightTheme() {
        plantImage.getScene().getStylesheets().clear();
        plantImage.getScene().getStylesheets().add(getClass().getResource("/resources/style/light.css").toExternalForm());
    }

    @FXML
    private void switchToDarkTheme() {
        plantImage.getScene().getStylesheets().clear();
        plantImage.getScene().getStylesheets().add(getClass().getResource("/resources/style/dark.css").toExternalForm());
    }

    private void updateGrowthStage(int stage) {
        String imageName = switch (stage) {
            case 1 -> "plant_stage1.png";
            case 2 -> "plant_stage2.png";
            case 3 -> "plant_stage3.png";
            default -> "plant_stage0.png";
        };

        plantImage.setImage(new Image(getClass().getResource("/resources/images/" + imageName).toExternalForm()));
        feedCheckBox.setSelected(stage > 0);
    }

    @FXML
    private void showStage0(ActionEvent event) {
        updateGrowthStage(0);
    }

    @FXML
    private void showStage1(ActionEvent event) {
        updateGrowthStage(1);
    }

    @FXML
    private void showStage2(ActionEvent event) {
        updateGrowthStage(2);
    }

    @FXML
    private void showStage3(ActionEvent event) {
        updateGrowthStage(3);
    }
}
