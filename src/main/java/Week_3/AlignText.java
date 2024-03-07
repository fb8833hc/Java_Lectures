package Week_3;

public class AlignText {
    public static void main(String[] args) {
        int[] classCodes = {2454, 2505, 2560};
        String[] classNames = {"Java", "C#", "Web"};

        for (int c = 0; c < classCodes.length; c++) {
            int code = classCodes[c];
            String name = classNames[c];
            System.out.printf("%10d%10s", code, name);
            System.out.println();
        }
    }
}
