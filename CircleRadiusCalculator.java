import java.util.Scanner;
public class CircleRadiusCalculator {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);

        System.out.println("What is the radius of the circle?");
        double Radius = Input.nextDouble();

        System.out.println("The area of the Circle is: " + Math.PI * Math.pow (Radius, 2));




    }
}
