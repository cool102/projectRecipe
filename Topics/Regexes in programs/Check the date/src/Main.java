import java.util.*;

class Date {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String date = scn.nextLine();
        String dateRegex = "((19|20)\\d{2}(-|.|/)([0][1-9]|[1][1-2])(-|.|/)([0][1-9]|[1][0-9]|[2][0-9]|[3][0-1])|(([0][1-9]|[1][0-9]|[2][0-9]|[3][0-1])(-|.|/)([0][1-9]|[1][1-2])(-|.|/)(19|20)\\d{2}))";
        String res = date.matches(dateRegex)? "Yes":"No";
        System.out.println(res);

    }
}