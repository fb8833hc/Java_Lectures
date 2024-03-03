package Week_2;

import static input.InputUtils.doubleInput;

public class AverageBill {
    public static void main(String[] args) {
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        double total = 0;
        double average = 0;
        for (int month = 0; month < months.length; month++) {
            String monthName = months[month];
            double MonthlyBill = doubleInput("How much was the bill for " + monthName + "?");
            total = total + MonthlyBill;
            average = average + total/months.length;
        }

        System.out.println("This is total yearly bill: $" + total);
        System.out.println("This is the average of the bill: $" + average);
    }
}
