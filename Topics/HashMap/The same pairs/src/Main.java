import java.util.*;


class MapFunctions {

    public static void calcTheSamePairs(Map<String, String> map1, Map<String, String> map2) {
        // write your code here
        int counter = 0;
        Set<String> keySet1 = map1.keySet();
        for (String cur : keySet1
        ) {
            if ((map2.containsKey(cur)) && (map1.get(cur).equals(map2.get(cur)))) {
                counter++;
            }

        }
        System.out.println(counter);
    }
}
