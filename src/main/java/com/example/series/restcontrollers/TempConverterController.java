/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.series.restcontrollers;

import com.example.series.beans.TemperatureConversion;
import com.example.series.services.TempConverterServicesException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author JDUENAS
 */
@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value = "/TempConverter")
public class TempConverterController {

    @Autowired
    TemperatureConversion tempConverterServices;

    @GetMapping("/ToFahrenheit/{tempInCelsius}")
    public ResponseEntity<?> getTemperatureFromCelsiusToFahrenheitHandler(@PathVariable("tempInCelsius") float tempInCelsius) {
        try {
            return new ResponseEntity<>(tempConverterServices.fromCelsiusToFahrenheit(tempInCelsius), HttpStatus.ACCEPTED);
        } catch (TempConverterServicesException ex) {
            Logger.getLogger(TempConverterServicesException.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error fetching result", HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/ToCelsius/{tempInFahrenheit}")
    public ResponseEntity<?> getTemperatureFromFahrenheitToCelsiusHandler(@PathVariable("tempInFahrenheit") float tempInFahrenheit) {
        try {
            return new ResponseEntity<>(tempConverterServices.fromFahrenheitToCelsius(tempInFahrenheit), HttpStatus.ACCEPTED);
        } catch (TempConverterServicesException ex) {
            Logger.getLogger(TempConverterServicesException.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error fetching result", HttpStatus.NOT_FOUND);
        }
    }

}
