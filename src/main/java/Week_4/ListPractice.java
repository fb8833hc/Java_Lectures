package Week_4;

import java.util.ArrayList;
import java.util.List;

public class ListPractice {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Hello");
        arrayList.add("World");
        arrayList.add("Andy");
        arrayList.add("MCTC");

        String firstWord = arrayList.get(0);

        for (String s: arrayList) {
            System.out.println(s.toUpperCase());
        }

        System.out.println(arrayList);
    }
}
