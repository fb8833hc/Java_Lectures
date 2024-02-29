package Week_2;

import static input.InputUtils.stringInput;

public class WhleLoopPassword {
    public static void main(String[] args) {
        String secretPassword = "kittens";
        int maxGuesses = 5;

        System.out.println();
        String userPassword = stringInput("Enter the password");

        while (!userPassword.equals(secretPassword) && maxGuesses > 1) {
            System.out.println("Password incorrect, access denied!");
            System.out.println("Try again");
            userPassword = stringInput("Enter the password");
            maxGuesses--;
        }
        if (maxGuesses > 1) {
            System.out.println("Correct password - access granted");
        }
        else { //out of attempts
            System.out.println("Max number of password attempts. ");
        }
    }
}
