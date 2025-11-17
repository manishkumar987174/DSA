import java.util.Scanner;

public class child extends Parent {
    String color;

    void speak() {
        System.out.println("Hanjii!");
    }

    public static void main(String[] args) {
        child c1 = new child();
        c1.name = "Ravi";
        c1.age = 23;
        c1.color="RED";
        c1.title = "Chaudhry";
        System.out.println(c1.name);
        c1.speak();
        Scanner sc=new Scanner(System.in);
    }
}
