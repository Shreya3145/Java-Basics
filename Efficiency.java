package Week_2.Assignment;
import java.util.Scanner;
public class Efficiency {

    public static void main(String[] args) {
        String efficiency  = "";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the time taken by the worker: ");
        double timeTaken = sc.nextDouble();
        efficiencyOfWorker(timeTaken, efficiency);
        sc.close();
    }
    public static void efficiencyOfWorker(double timeTaken, String efficiency) {
        if (timeTaken >= 2 && timeTaken <= 3) {
            efficiency = "Efficient";
        } else if (timeTaken >= 3 && timeTaken <= 4) {
            efficiency = "Improve Speed";
        } else if (timeTaken >= 4 && timeTaken <= 5) {
            efficiency = "Training Required";
        } else if (timeTaken > 5) {
            efficiency = "Fired   ";
        } else {
            efficiency = "Invalid Time";
        }

        System.out.println("Worker Efficiency: " + efficiency);

    }
    
}
