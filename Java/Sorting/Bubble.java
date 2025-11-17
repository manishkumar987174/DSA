
public class Bubble {

    public static int[] bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = {2, 6, 5, 3, 2, 34, 5, 13, 98};
        int[] sortArr = bubbleSort(arr);
        for (int i : sortArr) {
            System.out.print(i + " ");

        }
    }
}