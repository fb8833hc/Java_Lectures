package Week_1;

import static input.InputUtils.stringInput;

public class Scope {
    public static void main(String[] args) {
        String email = stringInput("Enter your email");
        double bookPrice = 40;
        double discount = 0;


        if (email.endsWith(".edu")) {
            System.out.println("Your student email is " + email);
            discount = 10;
        }
        System.out.println(email);
        bookPrice = bookPrice / 100 * (100 - discount);
        System.out.println(bookPrice);
    }
}
