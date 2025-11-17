public class TransformArray {
    public static void main(String[] args) {

        int[] arr = { 34, 45, 6, 456, 54, 3, 234, 24 };

        int num = 0;
        for (int i = 0; i < arr.length; i++) {
            int min = Integer.MAX_VALUE;
            for(int j=0;j<arr.length;j++){
                if (min > arr[i]) &&arr[i] > 0) {
                    min = arr[i];
                    arr[i] = num;
            }
        }
        arr[i]=num;
        num--;
    }
       
     
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * (-1);
        }
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }
}
