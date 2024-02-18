package Week_1;

import java.util.Arrays;

import static input.InputUtils.stringInput;

public class StringMethods {
    public static void main(String[] args) {
        String secretPassword = "kittens";
        int numberOfCharactersInPassword = secretPassword.length();
        System.out.println(numberOfCharactersInPassword);
        if (secretPassword.length() > 12) {
            System.out.println("Longer passwords are more secure. Good choice");
        } else {
            System.out.println("Consider using a longer password");
        }

        String email = "Clara.James@MINNEAPOLIS.edu";
        email = email.toLowerCase();
        System.out.println(email);

        String classIdentifier = "itec 2545";
        classIdentifier = classIdentifier.toUpperCase();
        System.out.println(classIdentifier);

        System.out.println(email.endsWith(".edu"));
        System.out.println(email.endsWith(".com"));

        String exampleEmail = "test@gmail.com";
        if (exampleEmail.endsWith(".edu")) {
            System.out.println("This is an education email address");
        } else {
            System.out.println("This is not an education email address");
        }

        String classCode = stringInput("Please enter a class code");
        System.out.println(classCode.startsWith("ITEC"));
        if (classCode.startsWith("ITEC")) {
            System.out.println("This is an ITEC class");
        } else {
            System.out.println("This is not an ITEC class");
        }
        //contains
        //look for support ticket requests that contain the text server
        String supportTicketDescription1 = "The server is down!";
        String supportTicketDescription2 = "My mouse mat is missing";
        String supportTicketDescription3 = "All the servers need to be rebooted.";

        System.out.println(supportTicketDescription1.contains("server"));
        System.out.println(supportTicketDescription2.contains("server"));
        System.out.println(supportTicketDescription3.contains("server"));

        String serverProblem = "The SERVER IS DOWN!!!";
        String searchTerm = "server";

        if (serverProblem.toUpperCase().contains(searchTerm)) {
            System.out.println("Found a server problem");
        } else {
            System.out.println("This is not a server problem");
        }

        String uppercaseServerProblem = serverProblem.toUpperCase();
        String uppercaseSearchTerm = searchTerm.toUpperCase();
        if (uppercaseServerProblem.contains(uppercaseSearchTerm)) {
            System.out.println("server problem");
        } else {
            System.out.println("Not a server problem");
        }

        String studentEmail = "abc@minneapolis.edu";
        System.out.println(studentEmail.contains(".edu"));
        String trickStudentEmail = "abc.edu@gmail.com";
        System.out.println(trickStudentEmail.contains(".edu"));

    }

    //trim and split wouldn't work. They kept crashing my program

    String className = "Java Programming";
    double credits = 6.0;
    int studentsEnrolled = 24;
    String format = "Online";




}
