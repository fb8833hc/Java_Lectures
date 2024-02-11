package Week_0;

public class Temp {
    public static void main(String[] args) {
        String currentMonth = "January";
        int dayOfMonth = 11;
        double forecastHigh = 19.4;
        double forecastLow = -3.7;
        double tempDifference = forecastHigh - forecastLow;

        System.out.println("On " + currentMonth + " " + dayOfMonth + ", the difference between the high and" +
                " low temperatures is " + tempDifference + "F");
    }
}
