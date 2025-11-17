
import java.util.*;

public class print2larg {

    public static int secondlrg(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] != arr[n - 1]) {
                return arr[i];
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 938, 32, 76, 45};
        System.out.println(secondlrg(arr));
    }
}
