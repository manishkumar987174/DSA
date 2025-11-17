
public class Binary {

    static int binary_search(int[] arr, int start, int end, int target) {
        if (start > end) {
            return -1;
        }
        int mid = start + (end - start) / 2;
        if (arr[mid] == target) {
            return mid;
        }
        if (arr[mid] < target) {
            return binary_search(arr, mid + 1, end, target);
        }

        return binary_search(arr, start, mid - 1, target);

    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 10, 20, 40, 50, 60, 70, 80, 100};
        int target = 70;
        int start = 0;
        int end = arr.length - 1;
       int index= binary_search(arr, start, end, target);
       System.out.println("Item found at index->"+index);
    }
}
