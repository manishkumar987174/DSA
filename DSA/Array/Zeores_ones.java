
public class Zeores_ones {

    public static void main(String[] args) {
        int[] arr = {0, 0, 0, 0, 0, 1, 1,1};
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            if (arr[i] == 0) {
                i++;
            } else if (arr[j] == 1) {
                j--;
            } else if (i > j) {
                break; 
            }else {
                arr[i] = 0;
                arr[j] = 1;
                i++;
                j--;
            }
        }
        for (int ele : arr) {
            System.out.print(ele + " ");
        }

    }
}
