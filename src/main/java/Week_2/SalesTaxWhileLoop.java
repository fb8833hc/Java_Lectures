package Week_2;

import static input.InputUtils.doubleInput;
import static input.InputUtils.yesNoInput;

public class SalesTaxWhileLoop {
    public static void main(String[] args) {
        boolean moreCalculations = true;
        double price;
        double salesTax = 1.07;

        while (moreCalculations) {
            price = doubleInput("Type in a price");
            double priceInclTax = price * salesTax;
            System.out.println("The price plus sales tax is " + priceInclTax);
            moreCalculations = yesNoInput("Do you want to continue?");
        }
        System.out.println("Thanks for using the program - goodbye!");
    }
}
