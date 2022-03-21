import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regNum = scanner.nextLine(); // a valid or invalid registration number
        String res = regNum.matches("[ABEKMHOPCTYX]\\d{3}[ABEKMHOPCTYX][ABEKMHOPCTYX]") ? "true" : "false";
        System.out.println(res);
        /* write your code here */
    }
}