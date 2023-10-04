package de.bcxp.challenge;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CsvReader {

    // take in file name and return a list of string arrays with content of given file
    public List<String[]> readFile(String fileName) throws IOException {
        
        List<String[]> fileContent = new ArrayList<>();
        
        try (Scanner scanner = new Scanner(new File("C:\\Users\\Tobias\\Desktop\\Tech Challenge BCxP\\programming-challenge\\src\\main\\resources\\de\\bcxp\\challenge\\" + fileName))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] cells = line.split(",");

                fileContent.add(cells);
            }
        }

        return fileContent;
    }
}
