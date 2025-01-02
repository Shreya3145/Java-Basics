package Week_2.Assignment;
import java.util.Scanner;
public class MaximumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int max = maximum(a, b);
        
        System.out.println("The maximum of the two numbers is: " + max);
        sc.close();
    }
    public static int maximum(int a, int b) {
        int c = a>b?a:b;
        return c;
    }
    
}
