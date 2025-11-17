
public class Clear_bit {

    public static void main(String[] args) {
        int n = 5;
        int position = 2;
        int bitMask = 1 << position;
        int not = ~(bitMask);
        int result = n & not;
        System.out.println(result);

    }
}
