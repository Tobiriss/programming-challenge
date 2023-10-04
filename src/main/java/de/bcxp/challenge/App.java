package de.bcxp.challenge;

import java.io.IOException;
import java.util.List;

/**
 * The entry class for your solution. This class is only aimed as starting point and not intended as baseline for your software
 * design. Read: create your own classes and packages as appropriate.
 */
public final class App {

    /**
     * This is the main entry method of your program.
     * @param args The CLI arguments passed
     * @throws IOException
     */
    public static void main(String... args) throws IOException {

        // Your preparation code …
        CsvReader reader = new CsvReader();
        WeatherAnalysis lowestTemp = new WeatherAnalysis();

        List<String[]> weatherContent = reader.readFile("weather.csv");

        String dayWithSmallestTempSpread = lowestTemp.findSmallestTempSpread(weatherContent); // Your day analysis function call …
        System.out.printf("Day with smallest temperature spread: %s%n", dayWithSmallestTempSpread);

        String countryWithHighestPopulationDensity = "Some country"; // Your population density analysis function call …
        System.out.printf("Country with highest population density: %s%n", countryWithHighestPopulationDensity);
    }

}
