/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.series.beans;

import com.example.series.services.TempConverterServicesException;

/**
 *
 * @author estudiante
 */
public interface TemperatureConversion {
    
    public float fromCelsiusToFahrenheit(float tempInCelsius) throws TempConverterServicesException;
    public float fromFahrenheitToCelsius(float tempInFahrenheit) throws TempConverterServicesException;
    
}
