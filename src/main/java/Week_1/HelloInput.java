package Week_1;

import static input.InputUtils.*;

public class HelloInput {
    public static void main(String[] args) {

        String name = stringInput("Please enter your name");
        System.out.println("Hello, " + name + "!");

        int numberOfClasses = positiveIntInput("How many classes are you taking this semester?");

        String units = "classes";
        if(numberOfClasses == 1){
            units = "class";
        }
        //if the number of classes are one change the unit variable to be class

        System.out.println("You are taking " + numberOfClasses + " " + units + " this semester.");
    }
}
