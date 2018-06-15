package dates;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class LocalDateTest {

    private static int counter = 0;

    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        showLocalDate(now);
        System.out.println(now.getMonth());
        System.out.println(now.getYear());
        System.out.println(now.getDayOfWeek());
        //first date of the month
        System.out.println("day of the week on " + now.minusDays(now.getDayOfMonth()-1) +" was: ");
        System.out.println(now.minusDays(now.getDayOfMonth()-1).getDayOfWeek());

        System.out.println(counter);

    }
        private static void showLocalDate (LocalDate now){

        counter++;
        System.out.println(now.getMonth());
        System.out.println(now.getMonth().getDisplayName(TextStyle.FULL, Locale.getDefault()));
        System.out.println(now.getMonth().getValue());
        System.out.println(now.getYear());
        System.out.println(now.getDayOfMonth());
        System.out.println(now.getDayOfWeek());
        System.out.println(now.getDayOfYear());
        System.out.println(now.getDayOfWeek().getValue());
    }
}
