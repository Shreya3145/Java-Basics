package Week_2.Assignment;
import java.util.Scanner;
public class Steel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter hardness of the steel: ");
        double hardness = scanner.nextDouble();
        System.out.print("Enter carbon content of the steel: ");
        double carbonContent = scanner.nextDouble();
        System.out.print("Enter tensile strength of the steel: ");
        double tensileStrength = scanner.nextDouble();
        
        int grade = 5;
        boolean condition1 = hardness > 50;
        boolean condition2 = carbonContent < 0.7;
        boolean condition3 = tensileStrength > 5600;
        
        if (condition1 && condition2 && condition3) {
            grade = 10;
        } else if (condition1 && condition2) {
            grade = 9;
        } else if (condition2 && condition3) {
            grade = 8;
        } else if (condition1 && condition3) {
            grade = 7;
        } else if (condition1 || condition2 || condition3) {
            grade = 6;
        }
        
        System.out.println("The grade of the steel is: " + grade);
        
        scanner.close();
    }
}
