public class LearnInterface2 {
    public static void main(String[] args) {
        dog d1 = new dog();
        d1.bark();
        d1.eat();
    }

}

interface Animal {
    void bark();
    void eat();
}

class dog implements Animal {
    @Override
    public void bark() {
        System.out.println("Dog can bark!");
    }

    @Override
    public void eat() {
        System.out.println("dog can eat!!");
    }
}