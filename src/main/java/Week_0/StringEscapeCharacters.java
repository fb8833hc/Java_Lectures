package Week_0;

public class StringEscapeCharacters {
    public static void main(String[] args) {
        // \" allows you to have quotes within quotes
        String message = "This class is \"Java Programming\"!";
        System.out.println(message);
        // \n makes everything after it a new line
        String anotherMessage = "Welcome, everyone!\nI hope you enjoy the class!";
        System.out.println(anotherMessage);
        // \t put a tab space
        String andanotherMessage = "Videos\tLabs\tZoom";
        System.out.println(andanotherMessage);
    }
}
