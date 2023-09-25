package com.weather.weatherApp.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WeatherResponse {

    private Location location;
    private Current current;


    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Current getCurrent() {
        return current;
    }

    public void setCurrent(Current current) {
        this.current = current;
    }

    public static class Location {
    	@JsonProperty("name")
        private String name;
    	
    	public String getName() {
    		return this.name;
    	}
    	
    	public void setName(String name) {
    		this.name = name;
    	}

    }

    public static class Current {
        @JsonProperty("temp_c") 
        private double tempC;
        
        @JsonProperty("humidity") 
        private double humidity;

        
        public double getTempC() {
    		return this.tempC;
    	}
    	
    	public void setTempC(double tempC) {
    		this.tempC = tempC;
    	}
    	
    	public double getHumidity() {
    		return this.humidity;
    	}
    	
    	public void setHumidity(double humidity) {
    		this.humidity = humidity;
    	}
  
    }
}

