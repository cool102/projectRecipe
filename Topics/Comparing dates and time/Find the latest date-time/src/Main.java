import java.time.LocalDateTime;
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        List<LocalDateTime> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {

            String strDate = scanner.nextLine();
            LocalDateTime ldt = LocalDateTime.parse(strDate);
            arr.add(ldt);

        }
        Optional<LocalDateTime> optDate =  arr.stream().sorted((d1, d2)->d2.compareTo(d1)).findFirst();
        System.out.println(optDate.get());


        // put your code here
    }
}