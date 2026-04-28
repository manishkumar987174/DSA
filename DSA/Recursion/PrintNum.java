public class PrintNum {
    static int PrintNumber(int n) {
        if (n == 0) {
            return 0;
        }
        return n + PrintNumber(n - 1);
    }
    public static void main(String[] args) {
        int n = 20;
        int sum = PrintNumber(n);
        System.out.println(sum);
    }
}