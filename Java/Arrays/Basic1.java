import java.util.*;
public class Basic1{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int [] arr=new int[10];
        for(int i=0;i<arr.length;i++){
            System.out.print("Enter "+i+" = element-");
            arr[i]=sc.nextInt();
        }
            System.out.print("Enter number to find?");
        int find=sc.nextInt();

        for(int i: arr){
            if(arr[i]==find){
                System.out.println("Number found at index-"+i);
                break;
            }
        }
    }
}