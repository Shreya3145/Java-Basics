package Week_2.Assignment;

import java.util.Scanner;

public class LibraryFine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Number of days late to return the book: ");
        int days = sc.nextInt();
        
        fine(days);
        sc.close();
    }
    public static void fine(int day){
        if (day <= 0){  
            System.out.println("No fine");
            } else if (day <= 5){
                System.out.println("Fine is: 50 paise");
                } else if (day >= 6 && day <= 10){
                    System.out.println("Fine is: 1 rupee");
                    } else if (day >= 11 && day <= 30){
                        System.out.println("Fine is: 5 rupees");
                    } else if(day > 30){
                        System.out.println("Membership cancelled");
                        }
                        else{
                            System.out.println("Invalid input");
                        }

    }
    
}
