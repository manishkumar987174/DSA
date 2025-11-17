
import java.util.*;

public class Prime {

    public static void main(String[] args) {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your no-");
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println("Prime no");
        } else {
            System.out.println("Not a prime no!");
        }
    }//intelligia ecclipse
}
