package Week_6;

import java.util.List;
import java.util.Random;

public class ArrayExceptions {
    public static void main(String[] args) {
        String[] classNames = {"Web", "Java", "C#"};
        for (String name: classNames) {
            System.out.println(name);
        }

        List<Integer> classCodes = List.of(2560, 2545, 2505);

        for (int i = 0; i < classCodes.size(); i++) {
            System.out.println(classCodes.get(i));
        }

        Random rnd = makeRandomNumberGenerator();
        System.out.println(getRandomNumber(rnd));
    }

    public static Random makeRandomNumberGenerator() {
        return new Random();
    }

    public static int getRandomNumber(Random rnd) {
        return rnd.nextInt(10);
    }
}
