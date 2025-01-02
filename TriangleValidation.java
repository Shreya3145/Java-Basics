package Week_2.Assignment;

import java.util.Scanner;

public class TriangleValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first angle of the triangle:");
        int a = sc.nextInt();
        System.out.println("Enter the second angle of the triangle:");
        int b = sc.nextInt();
        System.out.println("Enter the third angle of the triangle:");
        int c = sc.nextInt();
        angle(a,b,c);
        sc.close();
    }
    public static void angle(int a, int b, int c) {
        if(a+b+c==180){
            System.out.println("Valid Triangle");
        }
        else{
            System.out.println("Invalid Triangle");
        }
    }
    
}
