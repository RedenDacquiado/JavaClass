import java.util.Scanner;
public class MathOperations {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);
        //System.out.print("Enter First Number:");
        //int number = imput.nextInt();


        System.out.print("Enter First Number: ");
        int num = imput.nextInt();


        System.out.print("Enter Second Number: ");
        int num2 = imput.nextInt();
        double result;

        System.out.println("Values: ");

        result = num + num2;
        System.out.println("Addition: " + result);

        result = num - num2;
        System.out.println("Subtraction: " + result);

        result = num * num2;
        System.out.println("Multiplication: " + result);

        result = (double) num / num2;
        System.out.println("Division: " + result);

    }
}
