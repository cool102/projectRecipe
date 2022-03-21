import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        LocalDateTime dt = LocalDateTime.parse(scanner.nextLine());
        String[] arr = scanner.nextLine().split("\\s");
        long hours = Long.parseLong(arr[0]);
        long min = Long.parseLong(arr[1]);
        System.out.println(dt.minusHours(hours).plusMinutes(min));
    }
    }
