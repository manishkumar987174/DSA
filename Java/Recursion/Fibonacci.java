
public class Fibonacci {

    public static void main(String[] args) {
        int n = 10;
        fibo(0, 1, n);
        // for(int i=0;i<n;i++){
        //     System.out.print(fibo(i)+" ");
        // }

    }

    static void fibo(int a, int b, int n) {
        // if(n==0) return n;
        // if(n==1) return n;
        // return fibo(n-1)+fibo(n-2);
        if (n == 0) {
            return;
        }
        System.out.print(a + " ");
        fibo(b, a + b, n - 1);

    }
}
