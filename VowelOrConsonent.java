package Week_2.Assignment;

import java.util.Scanner;

public class VowelOrConsonent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character whether to guess it's vowel or consonent: ");
        char ch = sc.next().charAt(0);
        vowel(ch); 
        sc.close();
    }
    public static void vowel(char ch) {
        if ((ch == 'a' || ch == 'e' || ch == 'i'|| ch == 'o' || ch == 'u')||(ch == 'A' || ch == 'E' || ch == 'I'|| ch == 'O' || ch == 'U')){
            System.out.println("It is a Vowel!");
        }
        else{
            System.out.println("It is a consonent!");
        }
    }
    
}
