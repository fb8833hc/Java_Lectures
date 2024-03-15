package Week_4;

import java.util.ArrayList;
import java.util.List;

import static input.InputUtils.positiveDoubleInput;

public class CountIncidences {
    public static void main(String[] args) {
        List<Double> speeds = new ArrayList<>();

        int totalHours = 12;

        for (int hour = 0; hour < totalHours; hour++) {
            double speed = positiveDoubleInput("Enter the internet speed for hour " + hour);
            speeds.add(speed);
        }

        System.out.println("All the speeds are:");

        for (int hour = 0; hour < speeds.size(); hour++) {
            double speed = speeds.get(hour);
            System.out.printf("Hour: %d speed %.2f\n", hour, speed);
        }

        //count the number of times the speed was 0

        int zeroCount = 0;

        for (double speed: speeds) {
            if (speed == 0) {
                zeroCount++;
            }
        }
    }
}
