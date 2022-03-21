import java.util.*;
import java.util.stream.Collectors;

class Main {
    public static void main(String[] args) {
        // put your code here

         Scanner scanner = new Scanner(System.in);

        String[] arr = scanner.nextLine().split("\\s");
        String candidate = scanner.nextLine();
        List<String> list = new ArrayList<String>(List.of(arr));


        System.out.println(Collections.frequency(list, candidate));
    }
}