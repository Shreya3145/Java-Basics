package Week_2.Assignment;
import java.util.Scanner;
public class Ages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the age of the first person: ");
        int a = scanner.nextInt();

        System.out.println("Enter the age of the second person: ");
        int b = scanner.nextInt();

        System.out.println("Enter the age of the third person: ");
        int c = scanner.nextInt();
        int youngest = age(a, b, c);
        System.out.println("The youngest person is: " + youngest);
        scanner.close();
    }
    public static int age(int a, int b, int c) {
        if (a < b && a < c) {
            return a;
        } else if (b < a && b < c) {
            return b;
        } else {
            return c;
        }
    }
}
