import java.util.Scanner;

public class BooleanExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Is user logged in?");
        String logIn = input.nextLine();

        System.out.println("Does user have access?");
        String HaveAccess = input.nextLine();

        boolean isLoggedIn = true;
        boolean isAccess = false;
        System.out.println("User Login: " + isLoggedIn);
        System.out.println("Access granted: " + isAccess);

    }
}
