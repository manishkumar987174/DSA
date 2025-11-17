
//import java.util.Scanner;

public class Min_max {

    public static void main(String[] args) {

        int myArr[] = {1, 2, 3, 4, 5, 6};
        int min = myArr[0];
        int max = myArr[0];
        int arr2[] = {7, 8, 9, 10, 11};
        for (int i = 0; i < myArr.length - 1; i++) {
            if (myArr[i] < min) {
                min = myArr[i];
            }
            if (myArr[i] > max) {
                max = myArr[i];
            }

        }
        System.err.println("min=" + min + "\nmax=" + max);
    }
}
