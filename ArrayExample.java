public class ArrayExample {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        // int[] numbers; Declaring an array
        // numbers = new int[5]; Allocating memory for 5 integers
 
        // Accessing elements
        System.out.println("First element: " + numbers[0]);
        System.out.println("Third element: " + numbers[2]);
 
        // Modifying an array element
        numbers[1] = 25;
        System.out.println("Updated second element: " + numbers[1]);
    }
}
