
public class SecondGreatest {

    public static void main(String[] args) {
        int[] arr = {23, 45, 223, 2, 34, 56};
        int max = Integer.MIN_VALUE;
        int n = arr.length;
        int smx = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        System.out.println("maximum no is=" + max);
        for (int i = 0; i < n; i++) {
            if (arr[i]!= max) {
                if (smx < arr[i]) {
                    smx = arr[i];
                }
            }
        }
        System.out.println("Second maximum no is=" + smx);

    }
//     Maximum subarray sum (Kadane’s Algorithm).

// Input: [-2,1,-3,4,-1,2,1,-5,4]
// Output: 6 (subarray [4,-1,2,1])

}
