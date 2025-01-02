package Week_4;
import java.util.Scanner;
public class Divisible {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        divisible(a);
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

