package Week_2.Assignment;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println("Enter an operation to perform:");
        System.out.println("\n 1. Addition\n 2. Subtraction\n 3. Multiplication \n 4. Divison \n.Reminder");
        
        int a = sc.nextInt();
        switch(a){
            case 1:{
                System.out.println(add(num1, num2));
                break;
            }
            case 2:{
                System.out.println(sub(num1, num2));
                break;
            }
            case 3:{
                System.out.println(mul(num1, num2));
                break;
            }
            case 4:{
                System.out.println(div(num1, num2));
                break;
            }
            case 5:{
                System.out.println(mod(num1, num2));
                break;
            }
            default:{
                System.out.println("Enter valid one!");
                break;
            }
        }
    }
    public static int add(int a, int b){
        return a+b;
    }
    public static int sub(int a, int b){
        return a-b;
    }
    public static int mul(int a, int b){
        return a*b;
    }
    public static int div(int a, int b){
        return a/b;
    }
    public static int mod(int a, int b){
        return a%b;
    }
    
}
