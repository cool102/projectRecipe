import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner scanner = new Scanner(System.in);
        List<Integer> seq = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());


        int swops = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < swops; i++) {
            int[] indexes = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt).toArray();
            Collections.swap(seq, indexes[0], indexes[1]);
        }

        seq.stream().forEach(e -> System.out.print(e + " "));

    }
    }
