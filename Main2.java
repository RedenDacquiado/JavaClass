public class Main2 {
    public static void main(String[] args) {
        Car myCar = new Car(); // Creating an object
        myCar.brand = "Toyota";
        myCar.model = "Corolla";
        myCar.speed = 120;
        
        System.out.println("Brand: " + myCar.brand);
        System.out.println("Model: " + myCar.model);
        System.out.println("Speed: " + myCar.speed + " km/h");
 
        myCar.honk(); // Calling a method
    }
}
