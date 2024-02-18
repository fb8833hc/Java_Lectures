package Week_1;

import static input.InputUtils.doubleInput;

public class AboveFreezing {
    public static void main(String[] args) {
        System.out.println("Enter today's temperature in F");
        double temp = doubleInput();

        if (temp >= 32) {
            //this will run if the condition is true
            System.out.println("It's above freezing");
        } else {
            //else prints if the "if" condition isn't true
            System.out.println("It's below freezing");
        }
    }
}
