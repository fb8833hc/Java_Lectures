package Week_6;

public class StringToInt {
    public static void main(String[] args) {
        String hopeThisIsANumber = "50";
        try {
            int number = Integer.parseInt(hopeThisIsANumber);

            System.out.println("The number is " + number);
        } catch (NumberFormatException e) {
            System.out.println("This is not a valid integer string.");
        }
    }
}
