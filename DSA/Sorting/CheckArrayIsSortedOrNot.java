public class CheckArrayIsSortedOrNot {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 9, 5 };
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                System.out.println("Arry is not sorted!!");
                return;
            } 
        }
        System.out.println("Array is sorted!!");

    }
}
