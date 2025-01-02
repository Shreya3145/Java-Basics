package Week_4;
import java.util.Scanner;
public class Reverse{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ener the number:");
        int num = sc.nextInt();
        System.out.println(rev(num));
        sc.close();
        

}
public static int rev(int num) {
    int rev = 0;
        while(num>0){
            int rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }
return rev;
    
}
}
