package Week_2;

public class MarkCalculator {
    public static void main(String[] args) {
        int tamil, english, maths, science, socialScience;
        double average, total;
        tamil = 80;
        english = 90;
        maths = 99;
        science = 97;
        socialScience = 80;
        total = tamil + english + maths + science + socialScience;
        average = total / 5;
        System.out.println("Total marks: " + total);
        System.out.println("Average marks: " + average);
    }
    
}
