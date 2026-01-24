public class Str {
    public static void main(String[] args) {
        String str1 = "";
        str1.concat("hey!!");
        for (int i = 0; i < 100; i++) {
            str1 += "Hello! ";
        }
        System.out.println(str1);
    }
}
