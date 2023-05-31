
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class DateTimeDuration {
    public static void main(String[] args) {
        LocalDateTime first = LocalDateTime.of(2022,5,2,12,15,30);
        LocalDateTime second = LocalDateTime.of(2022,5,2,13,47,45);
        System.out.println("Differenz: "+first.until(second, ChronoUnit.SECONDS)+ " Sekunden");
    }
}
