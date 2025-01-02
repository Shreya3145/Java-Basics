package Week_2.Assignment;

import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Basic Salary: ");
        double basicSalary = sc.nextDouble();
        System.out.println("Enter Joined Year: ");
        int joinedYear = sc.nextInt();
        System.out.println("Enter Current Year: ");
        int currentYear = sc.nextInt();
        double grossSalary = calculateGrossSalary(basicSalary, joinedYear, currentYear);
        System.out.println("Gross Salary: " + grossSalary);
        sc.close(); 
    }

    public static double calculateGrossSalary(double basicSalary, int joinedYear, int currentYear) {
        double hra = 0.0;
        double da = 0.0;  
        int yearsOfService = currentYear - joinedYear;
        
        if (yearsOfService < 1) {
            hra = basicSalary * 0.10; 
            da = basicSalary * 0.05;  
        } else if (yearsOfService < 5) {
            hra = basicSalary * 0.15; 
            da = basicSalary * 0.10;  
        } else {
            hra = basicSalary * 0.20; 
            da = basicSalary * 0.15;  
        }
        double grossSalary = basicSalary + hra + da;
        return grossSalary;
    }
}