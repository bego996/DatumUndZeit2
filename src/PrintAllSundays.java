import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

public class PrintAllSundays {
    public static void main(String[] args) {
        LocalDate[] localDates = getAllSundays(2016);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        for (int i = 0; i < localDates.length; i++) {
            System.out.printf("%d. KW: %s, %s%n", i + 1, localDates[i].getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.GERMAN), localDates[i].format(dateTimeFormatter));
        }
    }
    public static LocalDate[] getAllSundays(int year) {
        LocalDate[] sundaysOfTheYear = new LocalDate[52];
        LocalDate begin = LocalDate.ofYearDay(year, 1);
        for (int i = 0; i < 7; i++) {
            if (begin.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.GERMAN).equals("Sonntag")) {
                break;
            } else
                begin = begin.plusDays(1);
        }
        for (int i = 0; i < sundaysOfTheYear.length; i++) {
            sundaysOfTheYear[i] = LocalDate.from(begin);
            begin = begin.plusDays(7);
        }
        return sundaysOfTheYear;
    }
}
