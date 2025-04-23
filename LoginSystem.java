import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Username:");
        String username = input.nextLine();
        System.out.println("Enter Password:");
        String password = input.nextLine();

        String username2 = ("Reden Dacquiado");
        String password2 = ("Seventeen");

        if (username.equals(username2) && password.equals(password2)) {
            System.out.println("Welcome Back User!");
        }

        else {
            System.out.println("Wrong Password/Username.Try again.");
        }

    }
    
}
