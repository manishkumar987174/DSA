
import java.util.*;

public class Merge_arr {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of matrix");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the size of 2nd matrix");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];

        int l1 = arr.length;
        int l2 = arr2.length;
        int[] arr3 = new int[l1 + l2];

        System.out.println("Enter  the  valueof 1st matrix");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter  the  value of 2nd matrix");
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }

        for (int i = 0; i < l1; i++) {
            arr3[i] = arr[i];
        }
        for (int i = 0; i < l1; i++) {
            arr3[l1 + i] = arr2[i];
        }
        for (int i : arr3) {
            System.out.println(i);
        }
    }
}
