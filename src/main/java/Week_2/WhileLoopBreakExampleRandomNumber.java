package Week_2;

import java.util.Random;

import static input.InputUtils.stringInput;

public class WhileLoopBreakExampleRandomNumber {
    public static void main(String[] args) {
        Random randomNumberGenerator = new Random();

        while (true) {
            System.out.println("Would you like a random number?");
            System.out.println("Enter any key for a random number, or Q to quit");

            String userInput = stringInput();

            if (userInput.equalsIgnoreCase("Q")) {
                break;
            }

            int randomNumber = randomNumberGenerator.nextInt();
            // .nextInt() with no arguement generate a random number from all the possible integer values
            System.out.println("Your random number is " + randomNumber);
        }
    }
}
