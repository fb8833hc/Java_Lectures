package Week_6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CodeStyleCheck {
    public static void main(String[] args) {
        String filename = "ReadNumberFromFile.java";
        int maxLineLength = 100;
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            boolean linesTooLong = false;
            int numberOfLinesTooLong = 0;
            String line = reader.readLine();
            int linecounter = 1;
            while (line != null) {
                //System.out.println(line);
                if (line.length() > maxLineLength) {
                    System.out.println("The line " + linecounter + " is too long.");
                    System.out.println(line);
                    linesTooLong = true;
                    numberOfLinesTooLong++;
                }
                linecounter++;
                line = reader.readLine();
            }

            if (linesTooLong) {
                System.out.println("There are " + numberOfLinesTooLong + " lines that were too long");
            } else {
                System.out.println("There were no lines too long");
            }

        } catch (IOException e) {
            System.out.println("Error reading file" + filename + "because " + e);
        }

    }
}
