package Week_0;

public class Prices {
    public static void main(String[] args) {
        String productName = "Packet of spaghetti";
        double price = 1.6;
        int quantity = 4;

        double totalPrice = quantity * price;
        System.out.println(quantity + " of " + productName
                + " at $" + price + " each costs a total of $" + totalPrice);
    }
}
