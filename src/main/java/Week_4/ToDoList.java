package Week_4;

import java.util.ArrayList;
import java.util.List;

import static input.InputUtils.stringInput;

public class ToDoList {
    public static void main(String[] args) {
        List<String> todoList = new ArrayList<>();
        while(true) {
            String data = stringInput("Type a task you need to do, or Enter to quit");
            if (data.length() == 0) {
                break;
            }
            if (todoList.contains(data)) {
                System.out.println("You already added that!");
            } else {
                todoList.add(data);
            }
            todoList.add(data);
        }

        System.out.println("Thank you, your tasks are:");

        for (String input: todoList) {
            System.out.println(input);
        }

        System.out.println("You have " + todoList.size() + " tasks to do");
    }
}
