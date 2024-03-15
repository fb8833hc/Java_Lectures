package Week_4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import static input.InputUtils.*;

public class GuestList {
    public static void main(String[] args) {
        List<String> guestList = new ArrayList<>();

        while (true) {
            String name = stringInput("Enter name of guest or enter to quit");
            if (name.isEmpty()) {
                break;
            }
            if (containsIgnoresCase(guestList, name)) {
                System.out.println("You already added " + name);
            } else {
                System.out.println("Adding " + name + " to list");
                guestList.add(name);
            }

            }
        Collections.sort(guestList);

        printGuestNames(guestList);

        //remove guests if needed

        while (yesNoInput("Do you want to remove any guests?")) {
            System.out.println("Here are all the guests");
            printGuestNames(guestList);
            int index = positiveIntInput("Enter the number of the guests of the guest to remove");
            index--;
            if (index < guestList.size()) {
            String removedGuest = guestList.remove(index);
            System.out.println("Removed guest " + removedGuest);
        } else {
                System.out.println("Error - please enter a valid number of guests");
            }
            }
        printGuestNames(guestList);

        System.out.println("The number of guests in the guestlist is " + guestList.size());

        }
        public static void printGuestNames(List<String> guests) {
            for (int i = 0; i < guests.size(); i++) {
                System.out.println(i+1 + ": " + guests.get(i));
            }
        }
        public static boolean containsIgnoresCase (List < String > list, String data){
            for (String item: list) {
                if (item.equalsIgnoreCase(data)) {
                    return true;
                }
            }
            return false;

        }
    }

