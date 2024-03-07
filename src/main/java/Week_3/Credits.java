package Week_3;

import static input.InputUtils.intInput;

public class Credits {
    public static void main(String[] args) {
        int creditsNeeded = intInput("How many credits does your program require?");
        int creditsEarned = intInput("How many credits have you earned?");
        int creditsToGraduate = howManyCreditsToGraduate(creditsNeeded, creditsEarned);
        System.out.printf("You need %d credits to graduate. You've got this!", creditsToGraduate);
    }

    public static int howManyCreditsToGraduate(int creditsNeeded, int creditsEarned) {
        int creditsToGraduate = creditsNeeded - creditsEarned;
        return creditsToGraduate;
    }
}
