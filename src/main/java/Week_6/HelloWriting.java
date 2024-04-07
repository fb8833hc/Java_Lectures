package Week_6;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class HelloWriting {
    public static void main(String[] args) throws IOException {


        //file will be created if it does not exist
        //file will be overwritten if it does exist

        FileWriter writer = new FileWriter("hello.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(writer);

        bufferedWriter.write("Hello!\n");
        bufferedWriter.write("Hello java students!\n");
        bufferedWriter.write("Goodbye!\n");

        bufferedWriter.close(); //do not forget to close otherwise the program won't end

        FileWriter writer2 = new FileWriter("hello.txt", true); //append flag - true ends the data to the end
        BufferedWriter bufferedWriter2 = new BufferedWriter(writer2);

        bufferedWriter2.write("Other data!\n");
        bufferedWriter2.write("Hello programmers!\n");
        bufferedWriter2.write("End of file!\n");

        bufferedWriter2.close(); //do not forget to close otherwise the program won't end
    }
}
