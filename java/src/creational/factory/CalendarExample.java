package creational.factory;

import java.util.Calendar;

public class CalendarExample {
  // Calendar is abstract class
  public static void main(String[] args) {
    Calendar cal = Calendar.getInstance();  //GregorianCalendar is concrete implementation here
    System.out.println(cal);
    System.out.println(cal.get(Calendar.DAY_OF_MONTH));
  }
}
