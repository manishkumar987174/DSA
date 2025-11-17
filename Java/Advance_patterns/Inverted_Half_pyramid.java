
// import java.util.*;

public class Inverted_Half_pyramid {

    public static void inverted_pyramid(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void inverted_Half_number(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows-i+1; j++) {
                System.err.print(j);
            }
            System.err.println("");
        }
    }

    public static void main(String[] args) {
        inverted_Half_number(5);
        // inverted_pyramid(10);

    }
}
