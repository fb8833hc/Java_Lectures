package Week_6;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WriteArrayList {
    public static void main(String[] args) throws IOException {
        //Write lines to the file "ITeC 2545 Java" and "ITEC 2560 Web"

        String filename = "ITEC_Class.txt";
        List<String> classNames = List.of("Java", "Web", "C#");

        List<Integer> classCodes = List.of(2545, 2560, 2585);

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filename));

        for (int i = 0; i < classNames.size(); i++) {
            String name = classNames.get(i);
            int code = classCodes.get(i);
            bufferedWriter.write("ITEC" + " " + code + " " + name + "\n");
        }

        bufferedWriter.close();

        BufferedReader bufferedReader = new BufferedReader(new FileReader(filename));

        List<String> classDescriptions = new ArrayList<>();

        String line = bufferedReader.readLine();

        while (line != null) {
            classDescriptions.add(line);
            line = bufferedReader.readLine();
        }

        System.out.println("End of file reached");
        System.out.println(classDescriptions);
    }
}
