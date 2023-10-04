package de.bcxp.challenge;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.io.IOException;
import java.util.List;

/**
 * Example JUnit 5 test case.
 */
class AppTest {

    private String successLabel = "not successful";

    @BeforeEach
    void setUp() {
        successLabel = "successful";
    }

    @Test
    void aPointlessTest() {
        assertEquals("successful", successLabel, "My expectations were not met");
    }

    @Test
    public void testWeather() throws IOException {
        CsvReader reader = new CsvReader();
        WeatherAnalysis lowestTemp = new WeatherAnalysis();

        List<String[]> weatherData = reader.readFile("weather.csv");
        assertNotNull(weatherData);

        String dayWithSmallestSpread = lowestTemp.findSmallestTempSpread(weatherData);
        assertNotNull(dayWithSmallestSpread);

        int expectedDay = 14;
        assertEquals(expectedDay, dayWithSmallestSpread);
    }

    @Test
    public void testCountries() throws IOException {
        CsvReader reader = new CsvReader();
        CountryAnalysis highestDensity = new CountryAnalysis();

        List<String[]> countryData = reader.readFile("countries.csv");
        assertNotNull(countryData);

        String countryWithHighestDensity = highestDensity.findCountryWithHighestDensity(countryData);
        assertNotNull(countryWithHighestDensity);

        String expectedCountryName = "CountryName";
        assertEquals(expectedCountryName, countryWithHighestDensity);
    }

}