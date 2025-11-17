
import java.util.Scanner;

public class Contain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter digit to find? ");
        int digit = sc.nextInt();
        int[] arr = {2, 3, 4, 5, 6, 67, 89};
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == digit) {
                result = arr[i];
            }
        }
            if (result == digit) {
                System.out.println("Found!!");
            } else {
                System.out.println("Not Found!!");
            }
        }
    }
