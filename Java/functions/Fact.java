
public class Fact {

    public static int fact(int x) {
        int fact = 1;
        for (int i = 1; i <= x; i++) {
            fact =fact*i;
        }
        return fact;
    }

    public static void main(String[] args) {
        int num = 5;
        int factorial = fact(num);
        System.out.println(factorial);
    }
}
