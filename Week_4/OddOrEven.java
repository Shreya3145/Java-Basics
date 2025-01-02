package Week_4;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        oddeven(number);  
    }
    public static void oddeven(int a){
        switch(a%2){
            case 0:{
                System.out.println("Even");
                break;
            }
            case 1:{
                System.out.println("Odd");
                break;
        }
        }
    }
}
