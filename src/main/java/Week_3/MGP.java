package Week_3;

import static input.InputUtils.doubleInput;

public class MGP {
    public static void main(String[] args) {
        double miles = doubleInput("Enter number of miles driven");
        double gas = doubleInput("Enter gallons of gas used");

        double mgp = milesPerGallon(miles, gas);
        System.out.println("The MGP for this journey is " + mgp + "miles per gallon");
    }

    public static double milesPerGallon(double miles, double gallonsOfGas) {
        double mgp = miles/gallonsOfGas;
        return mgp;
    }
}
