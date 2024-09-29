import java.util.*;

class Circle {

    private double radius;
    final double PI = 3.14;

    public Circle (double radius) {
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double computeArea() {
        return PI * radius * radius;
    }

    public double computeCircumference(){
        return 2 * PI * radius;
    }

    public double getRadius() {
        return radius;
    }
}

public class CircularRegion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the outer circle radius: ");
        double ro = scanner.nextDouble();

        System.out.println("Enter the inner circle radius: ");
        double ri = scanner.nextDouble();

        Circle outerCircle = new Circle(ro);
        Circle innerCircle = new Circle(ri);

        double outerArea = outerCircle.computeArea();
        double innerArea = innerCircle.computeArea();

        double shadeArea = outerArea - innerArea;

        System.out.println("Inner Circle Radius: " + innerCircle.getRadius());
        System.out.println("Outer Circle Radius: " + outerCircle.getRadius());
        System.out.println("Area of Outer Circle: " + outerArea);
        System.out.println("Area of inner Circle: " + innerArea);
        System.out.println("Area of the Circular Region: " + shadeArea);


    }
}
