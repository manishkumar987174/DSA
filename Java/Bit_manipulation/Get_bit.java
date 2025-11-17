
public class Get_bit {

    public static void main(String[] args) {
        int n = 5;
        int position = 3;
        int bitmask = 1 << position;
        if ((bitmask & n) == 0) {
            System.out.println("bit was zero");
        } else {
            System.out.println("bit was 1");

        }
    }
}
