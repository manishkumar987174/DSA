
import java.util.*;

public class Armstrong {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number-");
        int num = sc.nextInt();
        int original = num;
        int result = 0;
        int digit = String.valueOf(num).length();

        while (num != 0) {
            int rem = num % 10;
            result += Math.pow(rem, digit);
            num = num / 10;
        }

        if (original == result) {
            System.out.println("Armstrong number!");
        } else {
            System.out.println("Not Armstrong number!");
        }
    }
}
