import java.util.Scanner;

public class NamNhuan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year: ");
        int year = sc.nextInt();

        boolean isLeapYear = false;
        boolean isDivisionBy4 = year % 4 == 0;
        boolean isDivisionBy100 = year % 100 == 0;
        boolean isDivisionBy400 = year % 400 == 0;

        if (isDivisionBy4){
            if (isDivisionBy100){
                if (isDivisionBy400){
                    isLeapYear = true;
                }
            }else {
                isLeapYear = true;
            }
        }

        if (isLeapYear){
            System.out.printf("%d is a leap year",year);
        }else {
            System.out.printf("%d is not a leap year",year);
        }
    }
}
