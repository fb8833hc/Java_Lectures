package Week_4;

import javax.swing.plaf.IconUIResource;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AddingList {
    public static void main(String[] args) {
        List<Integer> classCodes = new ArrayList<>();
        classCodes.add(2545);
        classCodes.add(1150);
        classCodes.add(1250);

        classCodes.add(0, 1425);
        classCodes.add(2, 1100);

        System.out.println(Collections.min(classCodes));
        System.out.println(Collections.max(classCodes));

        for (int classCode: classCodes) {
            System.out.println("ITEC " + classCode);
        }
    }
}
