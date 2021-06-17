package sample;

import javafx.fxml.FXML;
import javafx.scene.text.Text;

public class Controller {
    static @FXML Text in_vehicle;
    Text inVehicle = new Text();
    String inVehicleCount = "In-Vehicle: 23";

//    in_vehicle.setText();

    static void runner() {
        in_vehicle.setText("this is in vehicle text");
    }
}
