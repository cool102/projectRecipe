import java.util.*;


class MapFunctions {

    public static void removeLongNames(Map<String, String> map) {
        String[] keys = map.keySet().toArray(String[]:: new);
        for (String key : keys) {
            if (key.length() > 7 || map.get(key).length() > 7) {
                map.remove(key);
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

        MapFunctions.removeLongNames(map);

        System.out.println(map.size());
    }
}