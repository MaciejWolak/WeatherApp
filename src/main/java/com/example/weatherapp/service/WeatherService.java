package com.example.weatherapp.service;

import com.example.weatherapp.model.Weather;
import com.example.weatherapp.webclient.WeatherClient;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class WeatherService {

    private final WeatherClient weatherClient;

    public Weather getWeather() {
        return weatherClient.getWeatherForCity("krzeszowice");
    }
}
