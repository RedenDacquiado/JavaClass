import java.util.Scanner;

public class IfElseExample {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("What is the students score?");
        int score = input.nextInt();

        if (score >= 75) {
            System.out.println("You passed!");
        }

        else {
            System.out.println("You failed!");
        }
    }
    
}
