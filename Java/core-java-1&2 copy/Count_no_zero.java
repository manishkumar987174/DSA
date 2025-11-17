public class Count_no_zero {
    public static void main(String[] args) {
        int n=2305060;
        int count=0;
        while (n!=0) {
            if(n%10==0){
                count++;
            }
            n=n/10;
        }
        System.out.println(count);
    }
}
