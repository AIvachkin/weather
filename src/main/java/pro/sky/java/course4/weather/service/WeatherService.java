package pro.sky.java.course4.weather.service;

import pro.sky.java.course4.weather.model.Weather;

public interface WeatherService {

    Weather getWeather (float lat, float lon);
}
