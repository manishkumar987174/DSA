import java.util.*;
public class Trim{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string");
        String str=sc.nextLine();
        String str2=str.replaceAll(" ","");
        System.out.println(str2);
    }
}