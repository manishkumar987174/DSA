public class StringMethods {

    public static boolean isVowel(char ch){
        if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U'){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String str = "aeiou";
        int n = str.length();
        System.out.println(str.charAt(3) + "\n" + n);
        int count = 0;
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            if (isVowel(ch) == true) {
                count++;
            }
        }
         System.out.println(count);
    }
}
