import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        int first = 0;
        int second = 1;
        System.out.println("Enter your no?");
        Scanner sc =new Scanner(System.in);
        int count = sc.nextInt();
        System.out.println("Fibonacci Series up to " + count);
        System.out.print(first + " " + second);

        for (int i = 2; i <= count; i++) {
            int next = first + second;
            System.out.print(" " + next);
            first = second;
            second = next;
        }
    }
}
