public class LearnInterface {
    
    interface Animal {
        void sound();
        void sleep();
    }

    static class Dog implements Animal { // made static
        public void sound() {
            System.out.println("Bhow Bhow");
        }

        public void sleep() {
            System.out.println("Sota hai...");
        }
    }

    public static void main(String[] args) { // no extra Main class
        Animal dog = new Dog();
        dog.sound();
        dog.sleep();
    }
}


