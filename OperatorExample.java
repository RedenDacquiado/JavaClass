public class OperatorExample {
    public static void main(String[] args) {
        int a = 10, b = 10;

        //Arithmetic
        System.out.println("Addition: " + (a + b));

        //Relational
        System.out.println("Is a equal to or greater than b? " + (a >= b));

        //Logical
        boolean isStudent = false, hasID = false;
        System.out.println("Is the person login in a student and have an ID? " + (!isStudent && !hasID));
    }
}
