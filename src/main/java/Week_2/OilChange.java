package Week_2;

public class OilChange {
    public static void main(String[] args) {
        int mileage = 150000;
        int interval = 3000;

        for (int oilchange = 0; oilchange < 8; oilchange++) {
            mileage = mileage + interval;
            System.out.println("Get oil change at " + mileage + " miles");
        }
    }
}
