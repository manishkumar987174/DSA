
import java.util.*;

public class Funoverld {

    public static int multiply(int x, int y) {
        int result = x * y;
        return result;
    }

    public static int multiply(int x, int y, int z) {
        int result = x * y * z;
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st no-");
        int n1 = sc.nextInt();
        System.out.println("Enter 2nd no-");
        int n2 = sc.nextInt();
        System.out.println("Enter 3rd no-");
        int n3 = sc.nextInt();
        int result1 = multiply(n1, n2);
        System.out.println("result of two no= " + result1);
        int result2 = multiply(n1, n2, n3);
        System.out.println("result of two no= " + result2);
        sc.close();
    }
}