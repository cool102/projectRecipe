import java.time.LocalDateTime;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner scanner = new Scanner(System.in);
        String d1 = scanner.nextLine();
        String d2 = scanner.nextLine();

        int n = scanner.nextInt();
        scanner.nextLine();

        LocalDateTime border1 = LocalDateTime.parse(d1);
        LocalDateTime border2 = LocalDateTime.parse(d2);
        LocalDateTime start = border1;
        LocalDateTime end = border2;
        if (border2.isBefore(border1)) {
            start = border2;
            end = border1;
        }

        //считать дату
        // проверить на принадлежность к промежутку
        // увеличть счетчик в случае принадлежности
        int counter=0;
        for (int i = 0; i < n; i++) {
            LocalDateTime candidate =  LocalDateTime.parse(scanner.nextLine());
            if (isInRange(candidate,start,end)) {
                counter++;
            }

        }
        System.out.println(counter);


    }
    public static boolean isInRange (LocalDateTime time,LocalDateTime start, LocalDateTime end){
        return ( (time.isAfter(start) || time.isEqual(start) ) && (time.isBefore(end)) );
    }
}