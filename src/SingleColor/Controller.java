package SingleColor;

import javafx.fxml.FXML;
import javafx.scene.text.Text;

public class Controller {
    @FXML Text vehicleCount;
    @FXML Text vehicleCount2;

    void setVehicleCount(Integer value) {
        vehicleCount.setText("Vehicle Count: " + value);
    }

    void test(String value) {
        vehicleCount2.setText(value);
    }
}
