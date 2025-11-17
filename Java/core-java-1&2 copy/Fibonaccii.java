
import java.util.Scanner;

public class Fibonaccii {

    public static void main(String[] args) {
        int first = 0;
        int second = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of term");
        int n = sc.nextInt();
        int c = first + second;
        // System.out.print(first + " " + second + " ");
        for (int i = 1; i < n-1; i++) {
            c = first + second;
            first = second;
            second = c;
        }
            System.out.print( c );

    }

}
