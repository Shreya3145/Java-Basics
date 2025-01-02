package Week_4;
import java.util.Scanner;
public class UpperOrLower {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character whether to guess it's lower or upper case:");
        char ch = sc.next().charAt(0);
        lowerOrUpper(ch);
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
