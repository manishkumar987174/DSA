
public class Avg {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 5, 3, 4, 2, 3};
        int result = 0;
        int avg = arr.length;
        for (int i = 0; i < arr.length; i++) {
            result += arr[i];
        }
        System.out.print("Average is=" + result / avg);
    }
}