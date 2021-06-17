package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.awt.*;
import java.util.Collection;
import java.util.Objects;


public class Main extends Application {
//    Controller controller = new Controller();

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("sample.fxml")));
//        Group root = new Group();
        primaryStage.setTitle("Single Color Display");
        Scene scene = new Scene(root, 300, 275, Color.WHEAT);

//        Text inVehicle = new Text();
//        controller.inVehicle.setX(50);
//        controller.inVehicle.setY(50);
//        controller.inVehicle.setText("what is up");
//        controller.inVehicle.setFont(Font.font("sanserif", 24));
//        controller.inVehicle.setFill(Color.RED);

//        root.getChildren().add(controller.inVehicle);
        primaryStage.setScene(scene);
//        primaryStage.setFullScreen(true);
        primaryStage.show();

        Controller.runner();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
