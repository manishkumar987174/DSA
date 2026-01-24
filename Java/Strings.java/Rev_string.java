
public class Rev_string {
    public static void main(String[] args) {
        String str = new String(); 
        // StringBuilder str = new StringBuilder("this is a table");
        // int len = str.length();
        // for (int i = 0; i < len / 2; i++) {
        //     int front = i;
        //     int last = len - i - 1;

        //     char frontchar = str.charAt(front);
        //     char lastchar = str.charAt(last);

        //     str.setCharAt(front, lastchar);
        //     str.setCharAt(last, frontchar);
        // }
        str.reverse();
        System.out.println(str);
    }
}
