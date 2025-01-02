package Week_2.Assignment;
import java.util.Scanner;
public class ProfitOrLoss {
    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the cost price of the product:");
        double cp = sc.nextDouble();
        System.out.println("Enter the selling price of the product:");
        double sp = sc.nextDouble();
        profitOrLoss(cp, sp);
        sc.close();
    }
    public static void profitOrLoss(double cp, double sp) {
        if(cp<sp){
            double profit = sp-cp;
            System.out.println("Profit: " + profit);
        }
        else if(cp>sp){
            double loss = cp-sp;
            System.out.println("Loss: " + loss);
        }
        else{
            System.out.println("No profit, no loss!");
        }
    }
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total operating costs");
        double operatingCosts = sc.nextDouble();

        System.out.println("Enter COGS: ");//meaning: Cost Of Goods Sold
        double cogs = sc.nextDouble();

        System.out.println("Enter Other Expenses: ");
        double oE = sc.nextDouble();

        double totalExpenses = operatingCosts + cogs + oE;
        System.out.println("The Total Expenses are: " + totalExpenses);

        System.out.println("Enter total revenue:");
        double totalRevenue = sc.nextDouble();

        profitOrLoss(totalRevenue, totalExpenses);
        sc.close();
    }
    public static void profitOrLoss(double totalRevenue, double totalExpenses) {
        if(totalExpenses<totalRevenue){
            double profit = totalRevenue-totalExpenses;
            System.out.println("Profit: " + profit);
        }
        else if(totalExpenses>totalRevenue){
            double loss = totalExpenses-totalRevenue;
            System.out.println("Loss: " + loss);
        }
        else{
            System.out.println("No profit, no loss!");
        }
    }
}

