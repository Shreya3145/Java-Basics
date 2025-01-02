package Week_2.Assignment;
import java.util.Scanner;
public class MaximumOfThreeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        sc.close();

        int max = maximum(a, b, c);
        System.out.println("The maximum of the three numbers is: " + max);

        // int maxi = maximum_of_three(a, b, c);
        // System.out.println("The maximum of the three numbers is: " + maxi);
    }
    public static int maximum(int a, int b, int c) {
        if (a>b && a>c){
            return a;
        }
        else if (b>a && b>c){
            return b;
        }
        else{
            return c;
    }
    }
    /* public static int maximum_of_three(int a, int b, int c) {
        int d = a>b ? a : b;
        int e = d>c ? d : c;
        return e;
    }
    */
    
}
