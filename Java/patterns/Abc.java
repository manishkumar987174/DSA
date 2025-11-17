
import java.util.*;

public class Abc {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of lines!");
        int num = sc.nextInt();
        char ch = 'A';
        for (int i = 0; i <=num; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.print("\n");
        }
        sc.close();
    }
}
