
import java.util.*;

public class Table{
    public static void main(String[]args){
        int table=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no-");
        int n=sc.nextInt();
        for(int i=1;i<=10;i++){
            table=n*i;
            System.out.println(n+"*"+i+"= "+table);
        }
    }
}
