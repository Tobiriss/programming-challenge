package de.bcxp.challenge;

import java.util.List;

public class WeatherAnalysis {

    public String findSmallestTempSpread(List<String[]> fileData) {

        String dayWithLowestSpread = null;
        double lowestCurrentTempSpread = Double.MAX_VALUE;

        // iterate over every row
        for (String[] row : fileData) {
            //check if there are at least column 1 to 3 (day, mxt, mnt)
            if (row.length >= 2) {
                //save the value of strings mxt and mnt to double for calculation
                try {
                    double maxTemp = Double.parseDouble(row[1]);
                    double minTemp = Double.parseDouble(row[2]);
                    double tempSpread = maxTemp - minTemp;

                    if (tempSpread < lowestCurrentTempSpread) {
                        lowestCurrentTempSpread = tempSpread;
                        // save the day to variable
                        dayWithLowestSpread = row[0];
                    }
                } catch (NumberFormatException e) {
                    System.out.println(e);
                }
            }
        }

        return dayWithLowestSpread;
    }

}
