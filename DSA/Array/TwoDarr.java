
import java.util.Scanner;


public class TwoDarr {

    public static void main(String[] args) {
        int[][] arr = new int[2][3];
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length + 1; j++) {
                arr[i][j]=sc.nextInt();
                
            }

        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length + 1; j++) {
                System.err.print(arr[i][j] + " ");
            }
            System.err.println("");
        }
        sc.close();

    }
}
