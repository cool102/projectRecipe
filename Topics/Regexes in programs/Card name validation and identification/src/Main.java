import java.util.*;

class BankCard {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String numbers = scn.nextLine();
        String card = numbers.replaceAll("\\s", "");
        String visaRegex ="[4]\\d{15}"; // put your code here
        String masterCardRegex = "(([5][1]|[5][2])\\d{14})|(([2][2][2][1]|[2][7][2][0])\\d{12})";// put your code here
        String americanExpressRegex = "([3][4]|[3][7])\\d{13}"; // put your code here

        if (card.matches(visaRegex)) {
            System.out.println("Visa");
        } else if (card.matches(masterCardRegex)) {
            System.out.println("MasterCard");
        } else if (card.matches(americanExpressRegex)) {
            System.out.println("AmericanExpress");
        } else {
            System.out.println("Card number does not exist");
        }
    }
}