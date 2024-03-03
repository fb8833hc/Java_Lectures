package Week_2;

import static input.InputUtils.doubleInput;

public class BusFareTotalArrayDayNames {
    public static void main(String[] args) {
        String [] dayNames = {"Monday", "Tueday", "Wednesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        double total = 0;
        for (int day =0; day < dayNames.length; day++) {
            String dayName = dayNames[day];
            double dayExpense = doubleInput("On " + dayName + ", what did you spend on busfares?");
            total = total + dayExpense;
        }

        System.out.println("For the week, you spent $" + total + " for bus fares.");
    }
}
