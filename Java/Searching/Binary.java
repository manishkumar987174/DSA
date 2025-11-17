
import java.util.*;

public class Binary {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {2, 5, 3, 4, 1, 9, 8, 7};
        Arrays.sort(arr);
        System.out.println("Enter your no to find");
        int n = sc.nextInt();
        int start = 0;
        int end = arr.length - 1;
        int find = binary_search(arr, start, end, n);
        System.out.println("Item found at index->" + find);
        for (int i : arr) {
            System.out.print(i + " ");
        }
        sc.close();

    }

    static int binary_search(int[] arr, int start, int end, int n) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == n) {
                return mid;
            } else if (mid < n) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
