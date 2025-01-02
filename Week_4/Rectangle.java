package Week_4;
import java.util.Scanner;
public class Rectangle {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle:");
        int length = sc.nextInt();
        System.out.println("Enter the width of the rectangle:");
        int width = sc.nextInt();
        int area = length * width;
        int perimeter = 2*(length+width);
        areaOrPerimeter(area, perimeter);
    }
    public static void areaOrPerimeter(int area, int perimeter){
        if(area>=perimeter){
            System.out.println("Area is greater than Perimeter");
        }
        else{
            System.out.println("Perimeter is greater than area");
        }
    }

}
