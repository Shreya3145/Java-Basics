package Week_4;
import java.util.Scanner;
public class Leapyear {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year = sc.nextInt();
        leap(year);
    }
    public static void leap(int year){
        if(year%4==0 && year%100!=0 || year%400==0){
            System.out.println("It's a leap year!");
        }
        else{
            System.out.println("Not a leap year!");
        }

    }
    
}

