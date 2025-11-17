import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Type anything i will reverse that!!");
        StringBuilder sb = new StringBuilder(sc.nextLine());
        int n = sb.length();
        for (int i = 0; i < n / 2; i++) {
            char t1 = sb.charAt(i);
            char t2 = sb.charAt(n-i-1);
            sb.setCharAt(i, t2);
            sb.setCharAt(n-i-1, t1);

        }

        System.out.println(sb);
        sc.close();
    }
}
