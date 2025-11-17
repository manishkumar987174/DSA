
public class Cross {

    public static void main(String[] args) {
        int n = 5;
        int num = (int) Math.ceil(n / 2.0);
        System.out.println(num);
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j == num || i == num) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }
}
