public class Sum_N_no{
    public static int sum(int n,int digit,int sum){
            if(n==digit){
                sum=sum+n;
                return sum;
            }
            sum=sum+n;
           return sum(n+1,digit,sum);
            
    }
    public static void main(String[] args) {
        System.out.println(sum(1,10,0));
        
    }
}