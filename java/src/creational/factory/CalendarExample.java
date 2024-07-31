package creational.factory;

import java.util.Calendar;

public class CalendarExample {
  public static void main(String[] args) {
    // Calendar is abstract class
    // GregorianCalendar is concrete implementation here
    Calendar cal = Calendar.getInstance();
    System.out.println(cal);
    System.out.println(cal.get(Calendar.DAY_OF_MONTH));
  }
}
