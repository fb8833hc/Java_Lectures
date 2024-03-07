package Week_3;

public class Marathon {
    public static void main(String[] args) {
        double currentDistance = 1;
        double targetDistance = 26.2;
        double percentIncrease = 1.10; //used to increase by 10%

        marathonSchedule(currentDistance, targetDistance, percentIncrease);
    }


        public static void marathonSchedule(double currentDistance, double targetDistance, double percentIncrease) {
        int week = 1;

        while (currentDistance < targetDistance) {
            System.out.println(week + " " + currentDistance);
            currentDistance = currentDistance * percentIncrease;
            week++;
        }
        System.out.println(week + " " + currentDistance);
    }
}
