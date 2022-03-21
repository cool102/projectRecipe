import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        LocalDateTime dt1 = LocalDateTime.parse(scanner.nextLine());
        LocalDateTime dt2 = LocalDateTime.parse(scanner.nextLine());
        System.out.println(ChronoUnit.HOURS.between(dt1, dt2));
    }
}