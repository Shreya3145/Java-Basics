package Week_2.Assignment;
import java.util.Scanner;
public class UpperOrLower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character whether to guess it's lower or upper case:");
        char ch = sc.next().charAt(0);
        lowerOrUpper(ch);
        sc.close();
    }
    public static void lowerOrUpper(char ch){
        if(ch>='A'&& ch<='Z'){
            System.out.println("Upper Case");
        }
        else if(ch>='a'&& ch<='z'){
            System.out.println("Lower Case");
        }
        else{
            System.out.println("Invalid one!");
        }
    }
}
