package Week_3;

import static input.InputUtils.doubleInput;
import static input.InputUtils.intInput;

public class Lemonade {
    public static void main(String[] args) {
        double lemonadeProfit = calculateProfitForProduct("Lemonade");
        System.out.println("Lemonade profit = $" + lemonadeProfit);

        double cookieProfit = calculateProfitForProduct("Cookies");
        System.out.println("Cookie profit + $" + cookieProfit);
    }

    public static double calculateProfitForProduct(String productName) {
        System.out.println("How much did you spend on " + productName + " supplies?");
        double suppliesCost = doubleInput();
        System.out.println("What did you sell one " + productName + " for?");
        double salePrice = doubleInput();
        System.out.println("How many " + productName + " did you sell?");
        int numberSold = intInput();

        double profit = ( numberSold * salePrice) - suppliesCost;
        return profit;
    }
}
