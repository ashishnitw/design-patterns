package creational.singleton;

import java.util.Calendar;

public class ExampleCalendar {
    public static void main(String[] args) {
        Calendar firstCalendar = Calendar.getInstance();
        Calendar secondCalendar = Calendar.getInstance();

        if (firstCalendar == secondCalendar)
            System.out.println("They are same instance");
        else
            System.out.println("They are different instance");
    }
}
