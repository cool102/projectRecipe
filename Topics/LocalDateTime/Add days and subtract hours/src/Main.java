import java.time.LocalDateTime;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner scanner = new Scanner(System.in);
        String[] arr = scanner.nextLine().split("\\s");
        String date = arr[0];
        long days = Long.parseLong(arr[1]);
        long hours = Long.parseLong(arr[2]);
        LocalDateTime dateTime = LocalDateTime.parse(date);
        System.out.println(dateTime.plusDays(days).minusHours(hours));
    }
}