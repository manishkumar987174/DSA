import java.util.Arrays;

public class TwoSum {

    public static int[] twosum(int[] arr, int target) {
        int[] ans = new int[2];
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    ans[0] = i;
                    ans[1] = j;
                    return ans;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 4, 9};
        int target = 8;
     
     System.out.println(Arrays.toString(twosum(arr, target)));
    }
}