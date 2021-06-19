package SingleColor;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        GridPane gridPane = new GridPane();
        Scene scene = new Scene(gridPane, 300, 275, Color.BLACK);
        PaneController paneController = new PaneController(scene);
        Controller controller = new Controller();

        paneController.addPane("vehiclePane1", getClass().getResource("singleColor.fxml"), controller);
        paneController.addPane("weather", getClass().getResource("weather.fxml"), controller);

//        paneController.activate("vehiclePane1");

        primaryStage.setTitle("Single Color Display");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.setWidth(320);
        primaryStage.setHeight(160);
        primaryStage.show();

//        controller.setVehicleCount(1348793);

        paneController.activate("weather");

        Weather weather = new Weather();
        weather.getData(controller);
    }


    public static void main(String[] args) {
        launch(args);
    }
}
