package Week_7;

import java.util.Date;

public class Dates {
    public static void main(String[] args) {
        Date now = new Date();
        System.out.println(now);

        System.out.println(now.getTime());

        long milliseconds = now.getTime();
        System.out.println(milliseconds);

        Date dateFromTime = new Date(milliseconds);

        long numberOfMilliseconds = 1234567L; //L at end
        Date date2009 = new Date(numberOfMilliseconds);
        System.out.println(date2009);

        if (date2009.before(now)) {
            System.out.println("2009 is earlier than now");
        }
    }
}
