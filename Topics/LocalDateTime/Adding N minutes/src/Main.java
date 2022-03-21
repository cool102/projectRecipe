import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        LocalDateTime dt = LocalDateTime.parse(scanner.nextLine());
        long minutes = Long.parseLong(scanner.nextLine());
        LocalDateTime newDt = dt.plusMinutes(minutes);
        int dayOfYear =newDt.toLocalDate().getDayOfYear();
        int year = newDt.getYear();
        LocalTime time =newDt.toLocalTime();
        System.out.printf("%s %s %s",year,dayOfYear,time);
    }
}
