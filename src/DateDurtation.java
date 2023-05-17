import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalField;
import java.util.Locale;

public class DateDurtation {
    public static void main(String[] args) {
        TaskA();
        System.out.println();
        TaskB();
        System.out.println();
        TaskC();
        System.out.println();
        TaskD();
        System.out.println();
        TaskE();
        System.out.println();
        TaskF();
        System.out.println();

    }
    static void TaskA(){
        System.out.println("Aufgabe a)");
        String a = "24.04.2021";
        String b = "2022/10/3";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.M.yyyy", Locale.GERMAN);
        LocalDate aD = LocalDate.parse(a,DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        LocalDate bD = LocalDate.parse(b,DateTimeFormatter.ofPattern("yyyy/MM/d"));
        System.out.printf("%d Tage liegen zwischen %s und %s\n---------------------------------------------------------------",aD.until(bD,ChronoUnit.DAYS),aD.format(formatter),bD.format(formatter));
    }
    static void TaskB(){
        System.out.println("Aufgabe b)");
        String a = "10.2.2022";
        String b = "2022/5/2";
        LocalDate aD = LocalDate.parse(a,DateTimeFormatter.ofPattern("dd.M.yyyy"));
        LocalDate bD = LocalDate.parse(b,DateTimeFormatter.ofPattern("yyyy/M/d"));
        Period.between(aD,bD);
        System.out.printf("Differenz zwischen %s und %s: %d Jahre %d Monate %d Tage\n---------------------------------------------------------------",aD,bD,Period.between(aD,bD).getYears(),Period.between(aD,bD).getMonths(),Period.between(aD,bD).getDays());
    }
    static void TaskC(){
        System.out.println("Aufgabe c)");
        LocalDate birthday = LocalDate.of(2023,1,4);
        LocalDate now = LocalDate.now();
        System.out.printf("Vergangene Tage seit dem Letzten Geburtstag: %d Tage\n---------------------------------------------------------------",birthday.until(now,ChronoUnit.DAYS));
    }
    static void TaskD(){
        System.out.println("Aufgabe d)");
        LocalDate now = LocalDate.now();
        LocalDate birthday = LocalDate.of(2024,1,4);
        System.out.printf("Tage bis zum nächten Geburtstag: %d Tage\n---------------------------------------------------------------",now.until(birthday,ChronoUnit.DAYS));
    }
    static void TaskE(){
        System.out.println("Aufgabe E)");
        LocalDate now = LocalDate.now();
        LocalDate birthday = LocalDate.of(1996,1,4);
        System.out.printf("Mein Alter: %d Jahre\n---------------------------------------------------------------",ChronoUnit.YEARS.between(birthday,now));
    }
    static void TaskF(){
        System.out.println("Aufgabe F)");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy", Locale.GERMAN);
        LocalDate now = LocalDate.now();
        LocalDate birthday18 = LocalDate.of(1996,1,4).plusYears(18);
        LocalDate nowPlus18 = now.plus(Period.between(birthday18,now));
        System.out.printf("Bis zu meinem %d. Geburtstag am %s sind es noch %d Jahre, %d Monate, %d Tage bzw. %d Gesamttage!\n---------------------------------------------------------------",
                          Period.between(birthday18.minusYears(18),nowPlus18).getYears(),nowPlus18.format(formatter),Period.between(now,nowPlus18).getYears(),
                          Period.between(now,nowPlus18).getMonths(),Period.between(now,nowPlus18).getDays(),now.until(nowPlus18,ChronoUnit.DAYS));
    }
    static void TaskG(){
        System.out.println("Aufgabe g)");
        String a = "24.04.2021";
        String b = "2022/10/3";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.M.yyyy", Locale.GERMAN);
        LocalDate aD = LocalDate.parse(a,DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        LocalDate bD = LocalDate.parse(b,DateTimeFormatter.ofPattern("yyyy/MM/d"));
        System.out.printf("%d Tage liegen zwischen %s und %s%n",aD.until(bD,ChronoUnit.DAYS),aD.format(formatter),bD.format(formatter));
    }
}
