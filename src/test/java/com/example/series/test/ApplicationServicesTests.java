package com.example.series.test;

import com.anarsoft.vmlens.concurrent.junit.ConcurrentTestRunner;
import com.anarsoft.vmlens.concurrent.junit.ThreadCount;

import com.example.series.services.TemperatureConversionStub;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.concurrent.atomic.AtomicInteger;
import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 *
 * @author JDUENAS
 */

@RunWith(ConcurrentTestRunner.class)
@SpringBootTest
public class ApplicationServicesTests {

    TemperatureConversionStub converterStubTest;
    
    @Test
    public void testingFromCelsiusToFahrenheit(){
        converterStubTest = new TemperatureConversionStub();
        Assert.assertEquals(71.6,converterStubTest.fromCelsiusToFahrenheit(22),0.0);
    }
    
    @Test
    public void testingFromFahrenheitToCelsius(){
      converterStubTest = new TemperatureConversionStub();
      Assert.assertEquals(10.0,converterStubTest.fromFahrenheitToCelsius(50),0.0);
    }



}
