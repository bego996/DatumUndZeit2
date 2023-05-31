import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.chrono.ChronoLocalDate;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;

public class PrintDaysPerMonth {
    public static int[] calcDaysPerMonth(int year){
        int[] daysCounterMonth = new int[12];
        for (int i = 0; i < daysCounterMonth.length ; i++) {
            LocalDate actualMonth = LocalDate.of(year,i+1,1);
            daysCounterMonth[i] =  actualMonth.lengthOfMonth();
            System.out.println(actualMonth.getMonth().getDisplayName(TextStyle.FULL, Locale.GERMANY) + ":" + daysCounterMonth[i]);
        }
        return daysCounterMonth;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Gib das gewünschte Jahr ein und ich gebe dir die Tage zu den Monaten aus: ");
        int input = scanner.nextInt();
        System.out.println("Anzahl der Tage:");
        calcDaysPerMonth(input);
    }
}
