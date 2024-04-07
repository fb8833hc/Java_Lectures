package Week_6;

import java.io.*;

public class Name {
    public static void main(String[] args) throws IOException {
        String Filename = "data.txt";
        String name = "Clara";
        String favoriteColor = "blue";
        int classCode = 2545;

        //write to the file
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(Filename));
        bufferedWriter.write(name + "\n");
        bufferedWriter.write(favoriteColor + "\n");
        bufferedWriter.write(classCode + "\n");

        bufferedWriter.close();

        BufferedReader bufferedReader = new BufferedReader(new FileReader(Filename));
        String line = bufferedReader.readLine();

        while (line != null) {
            System.out.println(line);
            line = bufferedReader.readLine();
        }

        bufferedReader.close();
    }
}
