package JavaBasics;


import java.util.Calendar;
import java.util.Date;

public class WhileLoops {
    public static void main(String[] args) throws InterruptedException {

        Date today = new Date();
        System.out.println(today);

        Calendar fixedDate = Calendar.getInstance();
        fixedDate.set(2017,3,12,16,56, 0);

        while(today.before(fixedDate.getTime()))
        {
            System.out.println("Currently the fixed date is before the system date.");
            Thread.sleep(1000);
            today = new Date();
            System.out.println(today);
        }
        System.out.println("The system date is greater than.");
    }
}
