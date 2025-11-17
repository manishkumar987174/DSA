

public class Bin {
    public static void main(String[] args) {
        int[] arr = { 2, 5,7,89,999};
        int start = 0;
        int last = arr.length - 1;
        int target = 89;
        int ans = -1;
        while (start <= last) {
            int mid = start + (last - start) / 2;
            if (arr[mid] == target) {
                ans = mid;
                break;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else if (arr[mid] > target) {
                last = mid - 1;
            }
        }
        if (ans == -1) {
            System.out.println("Element not found");
        } else
            System.out.println("Element found at index:" + ans);

    }
}


{

 
       
           
        
         
        
        

        
        

}