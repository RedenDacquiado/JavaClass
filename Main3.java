public class Main3 {
    public static void main(String[] args) {
        Car2 myCar = new Car2("Toyota", "Corolla", 120);
        
        System.out.println("Brand: " + myCar.brand);
        System.out.println("Model: " + myCar.model);
        System.out.println("Speed: " + myCar.speed + " km/h");
 
        myCar.honk();
    }
}
