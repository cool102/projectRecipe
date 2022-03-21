import java.time.LocalTime;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       String timeInSec = scanner.nextLine();
       LocalTime t= LocalTime.ofSecondOfDay(Integer.parseInt(timeInSec));
       System.out.println(t);
    }
}
