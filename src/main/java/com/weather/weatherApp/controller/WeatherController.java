package com.weather.weatherApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.weather.weatherApp.entities.WeatherResponse;
import com.weather.weatherApp.service.WeatherService;

@RestController
@RequestMapping("/weather")
@CrossOrigin(origins = "*")
public class WeatherController {
	
	private final WeatherService weatherService;
	
	@Autowired
    public WeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

	@GetMapping("/{city}")
	public WeatherResponse getWeather(@PathVariable String city) {
		WeatherResponse response = weatherService.getWeatherData(city);
		
		return response;
	}
	
	@GetMapping("/health")
	public String getWeather() {
		
		return "Hi";
	}

}
