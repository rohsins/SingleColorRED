package SingleColor;

import javafx.scene.image.Image;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.json.JSONArray;
import org.json.JSONObject;

public class Weather {
    private final String apiKey = "2a670e53ae77e49956144e487add4822";

    private URL url = new URL("https://api.openweathermap.org/data/2.5/weather?q=gorkha&appid=2a670e53ae77e49956144e487add4822");


    public Weather() throws MalformedURLException {
    }

    public void getData(Controller controller) throws IOException {
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestProperty("accept", "application/json");
        InputStream responseStream = connection.getInputStream();
        JSONObject jsonObject = new JSONObject(new String(responseStream.readAllBytes()));
        JSONObject main = jsonObject.optJSONObject("main");
        Integer visibility = jsonObject.optInt("visibility");
        JSONObject wind = jsonObject.optJSONObject("wind");
        JSONArray weather = jsonObject.optJSONArray("weather");
        JSONObject rain = jsonObject.optJSONObject("rain");
        Integer temperature = main.optInt("temp");
        Integer feelsLikeTemperature = main.optInt("feels_like");
        Integer pressure = main.optInt("pressure");
        Integer humidity = main.optInt("humidity");
        Integer windSpeed = wind.optInt("speed");
        Integer precipitation = null;
        if (!jsonObject.isNull("rain")) {
            precipitation = (int) (rain.optFloat("1h") * 100);
            controller.setPrecipitation(precipitation);
        }
        String iconCode = null;
        if (!jsonObject.isNull("weather")) {
            iconCode = ((JSONObject) weather.get(0)).optString("icon");

        } else {
            iconCode = "10n";
        }
//        String iconCode = "10n";

        URL iconUrl = new URL("http://openweathermap.org/img/w/" + iconCode + ".png");
        Image image = new Image(iconUrl.openStream());

        controller.setTemperature(temperature);
        controller.setFeelsLikeTemperature(feelsLikeTemperature);
        controller.setPressure(pressure);
        controller.setHumidity(humidity);
        controller.setWeatherIcon(image);
        controller.setVisibility(visibility);
        controller.setWindSpeed(windSpeed);

    }
}
