import java.time.LocalTime;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String b= scanner.nextLine();
        String m= scanner.nextLine();
        LocalTime b1
                = LocalTime.parse(b);
        LocalTime m1= LocalTime.parse(m);
        int t = b1.toSecondOfDay()-m1.toSecondOfDay();
        System.out.println(Math.abs(t));
    }
}