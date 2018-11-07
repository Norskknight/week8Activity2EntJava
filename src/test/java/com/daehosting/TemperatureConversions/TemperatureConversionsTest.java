package com.daehosting.TemperatureConversions;

import org.hibernate.type.BigDecimalType;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class TemperatureConversionsTest {

    @Test
    public void getTemperatureConversionsSoap12() throws Exception{
        TemperatureConversionsSoapType service =
                new TemperatureConversions().getTemperatureConversionsSoap12();
        BigDecimal celsiusToFahrenheitResult = service.celsiusToFahrenheit(BigDecimal.valueOf(0.0));
        assertEquals("The celcius to Fahrenhit conversion failed", celsiusToFahrenheitResult, BigDecimal.valueOf(32));
    }

    @Test
    public void getTemperatureConversionsSoap12FahrenheitToCelsius() throws Exception{
        TemperatureConversionsSoapType service =
                new TemperatureConversions().getTemperatureConversionsSoap12();
        BigDecimal fahrenheitToCelsiusResult = service.fahrenheitToCelsius(BigDecimal.valueOf(32));
        assertEquals("The Fahrenhit to celcius conversion failed", fahrenheitToCelsiusResult, BigDecimal.valueOf(0));
    }
    @Test
    public void getTemperatureConversionsSoap12WindchillInCelsius() throws Exception{
        TemperatureConversionsSoapType service =
                new TemperatureConversions().getTemperatureConversionsSoap12();
        BigDecimal WindchillInCelsius = service.windChillInCelsius(BigDecimal.valueOf(0),BigDecimal.valueOf(10));
        assertEquals("The Windchill In Celsius conversion failed", WindchillInCelsius, BigDecimal.valueOf(-8.97));
    }
    @Test
    public void getTemperatureConversionsSoap12WindchillInFahrenheit() throws Exception{
        TemperatureConversionsSoapType service =
                new TemperatureConversions().getTemperatureConversionsSoap12();
        BigDecimal WindchillInFahrenheit = service.windChillInFahrenheit(BigDecimal.valueOf(32),BigDecimal.valueOf(10));
        assertEquals("The Windchill In Celsius conversion failed", WindchillInFahrenheit, BigDecimal.valueOf(15.854));
    }
}