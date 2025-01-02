package Week_2.Assignment;

import java.util.Scanner;

public class DivisibleBy5or11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        divisible(a);
        
        sc.close();
    }
    public static void divisible(int a){
        if(a%5==0||a%11==0){
            System.out.println("It's is divisible by 11 or 5");
        }
        else{
            System.out.println("It's is not divisible by 11 or 5");

        }
    }
    
}
