
import java.util.*;

public class Power {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base-");
        int n = sc.nextInt();
        int result = 1;
        // System.out.println("Enter power-");
        // int p=sc.nextInt();
        // System.out.println(Math.pow(n,p));
        for (int i = 1; i <= n; i--) {
            result = n * n;
        }
        System.out.println(result);
    }

}
