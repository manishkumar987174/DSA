
public class Fill_zero_end {

   
    public static void main(String[] args) {
        int []arr={0,5,0,3,4,0,2,1};
         int n = arr.length;
         int idx=0;
        int [] temp = new int[n];
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                
                temp[idx++] = arr[i];
            }
        }
        for(int i:temp){
            System.out.println(i);
        }
        
    }
}
