package Week_1;

import static input.InputUtils.*;

public class Prices {
    public static void main(String[] args) {
        String productName = stringInput("What is the name of the product?");
        double price = positiveDoubleInput("What does " + productName + " cost?");
        int quantity = positiveIntInput("How many " + productName + " to sell?");

        double totalPrice = price * quantity;

        System.out.println(quantity + " of " + productName + " at $" +
                price + " each costs $" + totalPrice);
    }
}
