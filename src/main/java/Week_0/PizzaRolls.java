package Week_0;

public class PizzaRolls {
    public static void main(String[] args) {
        //sharing pizza rolls between peope
        double pizzarolls = 40;
        int people = 7;

        double rollsPerPerson = pizzarolls / people;
        System.out.println("Each person gets " + rollsPerPerson + " rolls");
        //limiting the decimal points
        System.out.printf("Each person gets %.1f rolls", rollsPerPerson);
    }
}
