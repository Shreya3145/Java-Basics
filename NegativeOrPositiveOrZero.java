package Week_2.Assignment;
import java.util.Scanner;
public class NegativeOrPositiveOrZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = scanner.nextInt();
        negativeOrPositiveOrZero(a);
        scanner.close();
    }
    public static void negativeOrPositiveOrZero(int a) {
        if (a > 0) {
            System.out.println(a + " is a positive number.");
        } else if (a < 0) {
            System.out.println(a + " is a negative number.");
        } else {
            System.out.println(a + " is zero.");
        }
    }  
}
