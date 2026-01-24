public class palindrome {
    public static void main(String[] args) {
        String str = "madam";
        int start = 0;
        boolean isPalindrom = true;
        int last = str.length() - 1;
        while (start < last) {
            if (str.charAt(start) != str.charAt(last)) {
                isPalindrom = false;
                break;
            }
            start++;
            last--;
        }
        System.out.println(isPalindrom);

    }
}
