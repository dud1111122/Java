package tree.controller;

import javafx.event.ActionEvent;
import javafx.scene.Scene;
import tree.main.Main;

public class TaskController {

    private static SeedController seedController;

    public static void setSeedController(SeedController controller) {
        seedController = controller;
    }

    public void switchToLightTheme(ActionEvent event) {
        Scene scene = Main.getScene();
        if (scene != null) {
            scene.getStylesheets().clear();
            scene.getStylesheets().add(getClass().getResource("/resources/style/light.css").toExternalForm());
        }
    }

    public void switchToDarkTheme(ActionEvent event) {
        Scene scene = Main.getScene();
        if (scene != null) {
            scene.getStylesheets().clear();
            scene.getStylesheets().add(getClass().getResource("/resources/style/dark.css").toExternalForm());
        }
    }

    // 🚀 필요한 경우 이렇게 seedController를 통해 성장 단계 변경도 가능
    public void growPlant(int stage) {
        if (seedController != null) {
            seedController.updateGrowthStage(stage);
        }
    }
    private void handleAddTask(javafx.event.ActionEvent event) {
        System.out.println("handleAddTask called! (아직 동작은 없음)");
    }
    
    
    
    

}


