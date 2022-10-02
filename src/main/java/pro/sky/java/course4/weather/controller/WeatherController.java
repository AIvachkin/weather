package pro.sky.java.course4.weather.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.java.course4.weather.model.Weather;
import pro.sky.java.course4.weather.service.WeatherService;

@RestController
public class WeatherController {

    @Autowired
    private WeatherService weatherService;

    @GetMapping("/weather/{lat}/{lon}")
    public ResponseEntity<Weather> getWeather (@PathVariable("lat") float lat,
                                               @PathVariable("lon") float lon){
        Weather weather = weatherService.getWeather(lat, lon);
        return ResponseEntity.ok(weather);
    }
}
