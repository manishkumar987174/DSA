public class Car extends Vehicle {
    public void start() {
        System.out.println("car!!");
    }

    public static void main(String[] args) {
       Car c1 = new Car();
        c1.start();
    }
}
