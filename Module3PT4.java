public class Module3PT4 {
    public static void main(String[] args) {
        String [] names = {"Joshua", "Julian", "Ester", "John", "Mary"};
        System.out.println("Old Array:");

        

        System.out.println("First Element: " + names[0]);
        System.out.println("Second Element: " + names[1]);
        System.out.println("Third Element: " + names[2]);

        System.out.println("Max Value Array:");

        for (int i = 0; i < names.length; i++) {
            System.out.println("Element at index " + i + ": " + names[i]);
        }

        System.out.println("New Array:");

        names[1] = "James";
        System.out.println("First Element: " + names[0]);
        System.out.println("Updated Second Element: " + names[1]);
        System.out.println("Third Element: " + names[2]);

        System.out.println("Max Value Array:");

        for (int i = 0; i < names.length; i++) {
            System.out.println("Element at index " + i + ": " + names[i]);
        }
    }
}