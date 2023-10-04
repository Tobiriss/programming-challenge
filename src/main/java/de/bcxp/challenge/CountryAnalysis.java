package de.bcxp.challenge;

import java.util.List;

public class CountryAnalysis {
    public String findCountryWithHighestDensity(List<String[]> fileData) {

        String countryWithHighestDensity = null;
        double highestDensity = Double.MIN_VALUE;

        // iterate over every row
        for (String[] row : fileData) {
            //check if there are at least 5 columns
            if (row.length >= 5) {
                //save the value of population and area to double for calculation
                try {
                    double countryPopulation = Double.parseDouble(row[3]);
                    System.out.println(countryPopulation);
                    double countryArea = Double.parseDouble(row[4]);
                    System.out.println(countryArea);
                    double density = countryPopulation / countryArea;

                    if (density > highestDensity) {
                        highestDensity = density;
                        // save the country to variable
                        countryWithHighestDensity = row[0];
                    }
                } catch (NumberFormatException e) {
                    System.out.println(e);
                }
            }
        }
        return countryWithHighestDensity;
    }
}
