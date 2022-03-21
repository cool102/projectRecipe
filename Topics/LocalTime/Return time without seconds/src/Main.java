import java.time.LocalTime;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       String t= scanner.nextLine();
       LocalTime time = LocalTime.parse(t);
       int h = time.getHour();
       int m = time.getMinute();
       LocalTime newTime = LocalTime.of(h,m);
        System.out.println(newTime);
    }
}