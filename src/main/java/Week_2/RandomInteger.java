package Week_2;

import java.util.Random;

public class RandomInteger {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(10);
        System.out.println("Random secret number between 0 and 9 = " + randomNumber);
    }
}
