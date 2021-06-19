package SingleColor;

import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class Controller {
    @FXML Text vehicleCount;
    @FXML Text temperature;
    @FXML Text feelsLikeTemperature;
    @FXML Text pressure;
    @FXML Text humidity;
    @FXML ImageView weatherIcon;
    @FXML Text precipitation;
    @FXML Text visibility;
    @FXML Text windSpeed;

    void setVehicleCount(Integer value) {
        vehicleCount.setText("Vehicle Count: " + value);
    }

    void setWeatherIcon(Image image) { weatherIcon.setImage(image); }
    void setTemperature(Integer value) {
//        temperature.setText("Temp: " + (value - 273) + " °C");
        temperature.setText((value - 273) + " °C");
        temperature.setFont(Font.font(30));
    }
    void setFeelsLikeTemperature(Integer value) { feelsLikeTemperature.setText("Feels Like: " + (value - 273) + " °C"); }
    void setPressure(Integer value) { pressure.setText("Pressure: " + value + " mBar"); }
    void setHumidity(Integer value) { humidity.setText("Humidity: " + value + " %"); }
    void setPrecipitation(Integer value) { precipitation.setText("Precipitation: " + value + " %"); }
    void setVisibility(Integer value) { visibility.setText("Visibility: " + value + " m"); }
    void setWindSpeed(Integer value) { windSpeed.setText("Wind Speed: " + value + " m/s"); }

}
