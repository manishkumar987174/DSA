
import java.util.*;

public class Bin_dec {

    public static int binDec(int binNum) {
        int decimal = 0;
        int pow = 0;
        while (binNum > 0) {
            int rem = binNum % 10;
            decimal = decimal + (rem * (int) Math.pow(2, pow));
            pow++;
            binNum = binNum / 10;
        }
        return decimal;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your binary no-");
        int bin = sc.nextInt();
        int Dec_no = binDec(bin);
         System.out.println("Decimal no is= "+Dec_no);
    }
}
