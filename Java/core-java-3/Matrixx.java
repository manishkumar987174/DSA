
import java.util.*;

public class Matrixx {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st matrix row value");
        int r1 = sc.nextInt();
        System.out.print("Enter the 1st matrix column value");
        int c1 = sc.nextInt();
        int[][] arr1 = new int[r1][c1];

        System.out.print("Enter the 2nd matrix row value");
        int r2 = sc.nextInt();
        System.out.print("Enter the 2nd matrix column value");
        int c2 = sc.nextInt();
        int[][] arr2 = new int[r2][c2];

        System.out.println("Enter the value of 1st matrix ");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[0].length; j++) {
                arr1[i][j] = sc.nextInt();
            }

        }

        System.out.println("Enter the value of 2nd matrix");
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[0].length; j++) {
                arr2[i][j] = sc.nextInt();
            }

        }
        System.out.println("first matrix");

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[0].length; j++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.print("\n");
        }
        System.out.println("second matrix");

        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[0].length; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.print("\n");
        }

        if (c1 != r2) {
            System.out.println("Invalid input!");
            return;
        }
        int result[][] = new int[r1][c2];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    result[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }

        System.out.println("After mulitplication");

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.print("\n");
        }
        sc.close();
    }
}
