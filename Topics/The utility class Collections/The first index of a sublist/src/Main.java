import java.util.*;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner scanner = new Scanner(System.in);
        String[] arr1  = scanner.nextLine().split("\\s");
        String[] arr2  = scanner.nextLine().split("\\s");
        List<Integer> numbers1 = new ArrayList<Integer>();
        List<Integer> numbers2 = new ArrayList<Integer>();
        for (String current:arr1
             ) {
            numbers1.add(Integer.parseInt(current));
        }
        for (String current:arr2
        ) {
            numbers2.add(Integer.parseInt(current));
        }

       int a = Collections.indexOfSubList(numbers1, numbers2);
       //
        int b = Collections.lastIndexOfSubList(numbers1, numbers2);
        System.out.printf("%d %d",a,b);
    }
}