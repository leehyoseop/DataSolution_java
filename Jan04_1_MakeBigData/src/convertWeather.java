import java.util.ArrayList;

import com.hyoseop.jan041.main.AirDAO;
import com.hyoseop.jan051.main.Weather;
import com.hyoseop.jan051.main.WeatherDAO;

public class convertWeather {
	public static void main(String[] args) {
		ArrayList<Weather> weathers = WeatherDAO.getMyWeather();
		for (Weather weather : weathers) {
			System.out.println(weather.getNo());
			System.out.println(weather.getTemp());
		}
		WeatherDAO.writeWeatherToFile(weathers);
	}
}
