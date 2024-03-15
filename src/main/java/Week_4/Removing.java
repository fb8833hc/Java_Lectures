package Week_4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Removing {
    public static void main(String[] args) {

        List<String> classNames = new ArrayList<>();
        classNames.add("Programming Logic");
        classNames.add("Web Client Server");
        classNames.add("Project Management");
        classNames.add("Info Tech Concepts");

        Collections.sort(classNames);

        String alphabeticalFirst = Collections.min(classNames);
        System.out.println(alphabeticalFirst);

        for (String name: classNames) {
            System.out.println(name);
        }

        for (int i = 0; i < classNames.size(); i++) {
            System.out.println(classNames.get(i));
        }

        System.out.println(classNames);

        boolean wasRemoved = classNames.remove("Project Management");
        System.out.println(classNames + " " + wasRemoved);


        classNames.remove(0); //remove int primitive type - index are primitive
        System.out.println(classNames);

        classNames.set(1, "System Analysis");
        System.out.println(classNames);

        String search = "System Analysis";
        if (classNames.contains(search)) {
            System.out.println("The list does contain " + search);
        } else {
            System.out.println("The list does NOT contain " + search);
        }

        System.out.println(classNames.size());

        classNames.clear();

        System.out.println(classNames);
        System.out.println(classNames.size());
        System.out.println(classNames.isEmpty());
    }
}
