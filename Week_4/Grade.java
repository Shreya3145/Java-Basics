package Week_4;
import java.util.Scanner;
public class Grade {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Physics, Chemistry, Biology, Mathematics, Computer respectively: ");
        int Physics = sc.nextInt();
        int Chemistry = sc.nextInt();
        int Biology = sc.nextInt();
        int Mathematics = sc.nextInt();
        int Computer = sc.nextInt();
        int total_marks = total(Physics, Chemistry, Biology, Mathematics, Computer);
        double avg_marks = avg(total_marks);
        System.out.println("Total marks: " + total_marks);
        System.out.println("Average marks: " + avg_marks);
        grade(avg_marks);

    }
    public static int total(int a, int b, int c, int d,int e){
        return a + b + c + d + e;
    }
    public static double avg(int a){
        return a / 5;
    }
    public static void grade(double avg){
        if (avg >= 90) {
            System.out.println("Grade: A");
            } else if (avg >= 80) {
                System.out.println("Grade: B");
                } else if (avg >= 70) {
                    System.out.println("Grade: C");
                    } else if (avg >= 60) {
                        System.out.println("Grade: D");
                    } else if (avg >= 40) {
                        System.out.println("Grade: E");
                        } else {
                            System.out.println("Grade: F");

    }
        
    }
}
