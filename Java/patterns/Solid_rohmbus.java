
import java.util.*;

public class Solid_rohmbus {

    public static void rohmbus(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(j);
            }
            for (int k = 1; k <= n; k++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of lines");
        int n = sc.nextInt();
        rohmbus(n);
    }
}
