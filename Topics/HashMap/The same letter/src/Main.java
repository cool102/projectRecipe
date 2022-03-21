import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


class MapFunctions {

    public static void printWithSameLetter(Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()
        ) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (key.charAt(0) == value.charAt(0)) {
                System.out.println(key + " " + value);
            }

        }

    }
}

/* Do not change code below */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> map = new HashMap<>();

        while (scanner.hasNextLine()) {
            String s = scanner.nextLine();
            String[] pair = s.split(" ");
            map.put(pair[0], pair[1]);
        }

        MapFunctions.printWithSameLetter(map);
    }
}