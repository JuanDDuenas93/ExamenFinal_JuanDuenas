/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.series.services;

import com.example.series.beans.TemperatureConversion;
import org.springframework.stereotype.Service;

/**
 *
 * @author JDUENAS
 */
@Service
public class TemperatureConversionStub implements TemperatureConversion{

    @Override
    public float fromCelsiusToFahrenheit(float tempInCelsius) {
        return (float) ((tempInCelsius*1.8)+32);
    }

    @Override
    public float fromFahrenheitToCelsius(float tempInFahrenheit) {
        return (float) ((tempInFahrenheit-32)*0.555555555556);
    }
    
}
