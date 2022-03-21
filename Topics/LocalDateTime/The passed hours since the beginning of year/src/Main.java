import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner scanner = new Scanner(System.in);
        LocalDateTime dt = LocalDateTime.parse(scanner.nextLine());

        LocalDateTime dt2 = LocalDateTime.of(LocalDate.of(2017, 1, 1), LocalTime.MIN);

        System.out.println(ChronoUnit.HOURS.between(dt2, dt));

    }
}