
// ========================================================================================
//   NOTE: The example below should be used as a complement to slides 32+33 of the slide 
//         set "Strings". Full explanation of the example was given in class.
// ========================================================================================

import java.util.Calendar;

public class TestCalendar {
  public static void main(String[] args) {
    Calendar myCalendar = Calendar.getInstance();

    // Setting the date to 27th April 2007 at 10:01am.
    myCalendar.set(2007, 3, 27, 10, 01);

    System.out.println("date = " + myCalendar.get(Calendar.DATE));
    System.out.println("month = " + myCalendar.get(Calendar.MONTH));
    System.out.println("hour of day = " + myCalendar.get(Calendar.HOUR_OF_DAY));
    System.out.println("time = " + myCalendar.getTime());

    System.out.println("***********");

    myCalendar.add(Calendar.DATE, 15);
    System.out.println("new date = " + myCalendar.get(Calendar.DATE));
    System.out.println("new month = " + myCalendar.get(Calendar.MONTH));
    System.out.println("new hour of day = " + myCalendar.get(Calendar.HOUR_OF_DAY));
    System.out.println("new time = " + myCalendar.getTime());

    System.out.println("***********");

    // Number of milliseconds between 1st January 1970 and 12th May 2007.
    System.out.println("time in ms = " + myCalendar.getTimeInMillis());
  }
}