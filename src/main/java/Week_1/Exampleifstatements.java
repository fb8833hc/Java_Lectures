package Week_1;

import static input.InputUtils.intInput;

public class Exampleifstatements {

    public static void main(String[] args) {

        String college = "MCTC";
        String className = "Java";
        int classCode = intInput("enter a class code: ");

        //== means equally
        if (classCode == 2545) {
            System.out.println("This is Java Programming!");
        } else if (classCode == 2505) {
            System.out.println("This is c# programming!");
        }
          else {
            System.out.println("This is NOT Java Programming");
        }
    }
}
