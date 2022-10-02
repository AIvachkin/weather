package pro.sky.java.course4.weather.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import pro.sky.java.course4.weather.model.Weather;

import java.util.Map;

@Service
public class WeatherService {

    private static String WEATHER_SERVICE_URL =
            "https://api.openweathermap.org/data/2.5/weather?lat={lat}&lon={lon}&appid=8fbcc292cb58c5c1d03c79eee03f21ce&units=metric";

//    lat=55.7504461   lon=37.6174943   Moscow
//    59.9386, 30.3141 Saint-Petersburg

    @Autowired
    private RestTemplate restTemplate;

    public Weather getWeather (float lat, float lon){
        return restTemplate.exchange(
                WEATHER_SERVICE_URL,
                HttpMethod.GET,
                new HttpEntity<>(HttpHeaders.EMPTY),
                Weather.class,
                        lat,
                        lon)
                .getBody();

    }
}
