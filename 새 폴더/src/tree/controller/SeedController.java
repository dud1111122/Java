package tree.controller;

import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class SeedController {

    @FXML
    private CheckBox feedCheckBox;

    @FXML
    private ImageView plantImage;

    @FXML
    public void initialize() {
        TaskController.setSeedController(this);
        updateGrowthStage(0); // 초기 이미지 설정
    }

    public void updateGrowthStage(int stage) {
        String imageName = switch (stage) {
            case 1 -> "plant_stage1.png";
            case 2 -> "plant_stage2.png";
            case 3 -> "plant_stage3.png";
            default -> "plant_stage0.png";
        };

        plantImage.setImage(
            new Image(getClass().getResource("/resources/images/" + imageName).toExternalForm())
        );
        feedCheckBox.setSelected(stage > 0);
    }

    @FXML
    public void showStage0() {
        updateGrowthStage(0);
    }

    @FXML
    public void showStage1() {
        updateGrowthStage(1);
    }

    @FXML
    public void showStage2() {
        updateGrowthStage(2);
    }

    @FXML
    public void showStage3() {
        updateGrowthStage(3);
    }

}