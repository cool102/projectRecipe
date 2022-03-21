import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<Integer>();
        // put your code here
        int M = scanner.nextInt();
        int[] arr = new int[M];
        for (int i = 0; i < arr.length; i++)
        {

            arr[i] = scanner.nextInt();
        }
        int last = arr[arr.length - 1];
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0]=last;
        for (int cur:arr
        ) {
            System.out.printf(cur+" ");

        }
    }
    }
