package Week_2.Assignment;
import java.util.Scanner;
public class InputCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char character = sc.next().charAt(0);
        inputchar(character);
        sc.close();
    }
     public static void inputchar(char character) {
        if (Character.isLetter(character)) {
            System.out.println(character + " is an alphabet.");
        } else if (Character.isDigit(character)) {
            System.out.println(character + " is a digit.");
        } else {
            System.out.println(character + " is a special character.");
        }

    }
}