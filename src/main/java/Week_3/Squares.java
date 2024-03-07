package Week_3;

import static input.InputUtils.doubleInput;

public class Squares {
    public static void main(String[] args) {
        double number = doubleInput("Please enter a number and I'll square it");
        square(number);
        //this is the end of the main method
    }

    //this method takes one arguement, a number
    //it calculates the square of that number (by multiplying it by itself)
    //and prints the number and its square value
    public static void square(double n) {
        double sq = n * n;
        System.out.println("The square of " + n + " is " + sq);
    }
}
