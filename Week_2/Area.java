package Week_2;
public class Area {
    public static void main(String[] args) {
        int l,b,r;
        double pi;
        l=5;
        b=10;
        r=3;
        pi = 3.14; // we can also use pi = Math.pi 
        double areaOfCircle, areaOfSquare, areaOfRectangle;
        areaOfCircle = pi*r*r;
        areaOfSquare = l*l;
        areaOfRectangle = l*b;
        System.out.println("Area of a Circle: " + areaOfCircle + " m^2");
        System.out.println("Area of a Square: " + areaOfSquare + " m^2");
        System.out.println("Area of a Rectangle: " + areaOfRectangle + " m^2");
    }
}

