package Week_2;

public class SumArray {
    public static void main(String[] args) {
        double numbers[] = new double[3];

        numbers[0] = 45.234256;
        numbers[1] = -123945.22;
        numbers[2] = 0.0000003;

        double sum = 0.0;

        for (int x = 0; x < numbers.length; x++) {
            sum = sum + numbers[x];
        }

        System.out.println("Total of numbers = " + sum);
    }
}
