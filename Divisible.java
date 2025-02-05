import java.util.Scanner;
public class Divisible {
    public static void main(String[] args) {
        System.out.println("Enter a numder: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();


        int num2 = 3, num3 = 5;
        System.out.println("Is the number divisible by 3 and 5? " + (num % num2 == 0 && num % num3 == 0));



    }
}
