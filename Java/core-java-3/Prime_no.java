
import java.util.*;

public class Prime_no {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your no!");
        int n = sc.nextInt();
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                System.out.println("Not a prime no!!");
                break;
            } else {
                System.out.println("prime no!!");
                break;
            }
        }
    }
}
