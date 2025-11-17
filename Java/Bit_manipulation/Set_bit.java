// package Bit_manipulation;

public class Set_bit {
    public static void main(String[] args) {
        int n=5;
        int position=1;
        int bitMask=1<<position;
        int newNum=n|bitMask;
        System.out.println(newNum);

    }
    
}
