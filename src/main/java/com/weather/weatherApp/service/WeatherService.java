package com.weather.weatherApp.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.weather.weatherApp.entities.WeatherResponse;

@Service
public class WeatherService {
	
	@Value("${weather.api.url}")
    private String apiUrl;
	
	@Value("${appKey}")
	private String appKey;

    private final RestTemplate restTemplate;

    public WeatherService() {
        this.restTemplate = new RestTemplate();
    }

    public WeatherResponse getWeatherData(String city) {
       String apiUrlWithCity = apiUrl + "?q=" + city + "&key="+appKey;

       WeatherResponse response = restTemplate.getForObject(apiUrlWithCity, WeatherResponse.class);
       
       
       return response;

    }

}
