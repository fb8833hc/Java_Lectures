package Week_6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WritingVariable {
    public static void main(String[] args) throws IOException {
        int classCode = 2454;
        double averageEnrollment = 22.16; //average students in a semester
        String className = "Java";

        FileWriter writer = new FileWriter("java.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(writer);

        bufferedWriter.write(classCode + "\n");
        bufferedWriter.write(averageEnrollment + "\n");
        bufferedWriter.write(className + "\n");

        bufferedWriter.close(); //writer.close() also works
    }
}
