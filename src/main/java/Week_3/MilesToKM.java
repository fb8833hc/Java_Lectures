package Week_3;

import static input.InputUtils.doubleInput;

public class MilesToKM {
    public static void main(String[] args) {
        double miles = doubleInput("Enter a number of miles ");
        double km = milesToKM(miles);
        System.out.println(miles + " miles is equal to " + km + " kilometer");

    }

    private static double milesToKM(double miles) {
        double km = miles * 1.6;
        return km;
    }
}
