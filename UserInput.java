import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);
        

        System.out.println("Enter your Name: ");
        String name = imput.nextLine();

        System.out.println("Enter your Age: ");
        int age = imput.nextInt();

        System.out.println("Enter your Favorite Number: "
        );
        int favnum = imput.nextInt();

        int result = favnum * 2;

        System.out.println("Hello" + name + "! You are" + age + "years old.");

        System.out.println("Your favorite number multiplied by 2 is: " + result);

    }
}