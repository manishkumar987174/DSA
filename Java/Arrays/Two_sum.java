
import java.util.Scanner;

public class Two_sum {

    public static void main(String[] args) {
        int[] nums = {3, 5, 7, 9};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your target number-");
        int target = sc.nextInt();
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1+i; j < nums.length; j++) {
                if (nums[i] + nums[j ] == target) {
                    System.out.println(i+" " +j);
                }
            }
        }

    }
}
