package pro.sky.java.course4.weather.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import pro.sky.java.course4.weather.model.Weather;
import pro.sky.java.course4.weather.model.WeatherMain;
import pro.sky.java.course4.weather.model.WeatherWind;

import java.math.BigDecimal;

@Service
@Profile("!production")
public class WeatherServiceTest implements WeatherService{

    @Override
    public Weather getWeather(float lat, float lon) {
        Weather weather = new Weather();
        WeatherMain weatherMain = new WeatherMain();
        weatherMain.setHumidity(BigDecimal.ONE);
        weatherMain.setTemp(BigDecimal.ONE);
        WeatherWind weatherWind = new WeatherWind();
        weatherWind.setSpeed(BigDecimal.ONE);
        weatherWind.setDeg(1);
        weather.setMain(weatherMain);
        weather.setWind(weatherWind);
        return weather;
    }
}
