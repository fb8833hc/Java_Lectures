package Week_3;

import static input.InputUtils.stringInput;

public class HelloMethods {
    public static void main(String[] args) {
        String name = stringInput("Please enter your name");
        String greeting = makeGreeting(name);
        System.out.println(greeting);
    }//end of main method

    //A new method that we've created
    //this method takes one arguement, a string
    //it will create a new string made from the word "hello"
    //plus the string arguement, plus an exclamation point !
    //it will then return that new greeting string
    public static String makeGreeting(String n) {
        String greeting = "Hello " + n + "!";
        return greeting;
        //end of the makeGreeting method
    }
}
