package Week_2;

import java.util.Arrays;

public class ArrayExamples {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        numbers[0] = 4;
        numbers[1] = 100;
        //numbers[5]

        String[] classNames = { "Java", "C#", "Web"};
        classNames[0] = "Java";
        classNames[1] = "C#";
        classNames[2] = "Web";

        System.out.println("One of the second year classes is " + classNames[0]);

        int numberOfClasses = classNames.length;
        System.out.println("There are " + numberOfClasses + " classes");

        for (int x = 0; x<classNames.length; x++) {
            System.out.println("A class name is " + classNames[x]);
        }

        System.out.println(Arrays.toString((classNames)));
    }
}
