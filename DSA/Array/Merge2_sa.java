
public class Merge2_sa {

    public static void main(String[] args) {
        int[] arr1 = {1,3,5,7};
        int[] arr2 = {2,4,6,8};
        int a1 = arr1.length;
        int a2 = arr2.length;
        int i = 0;
        int j = 0;
        int k = 0;
        int[] result = new int[a1 + a2];
        
        while (i < a1 && j < a2) {
            if (arr1[i] <= arr2[j]) {
                result[k] = arr1[i];
                i++;
            } else {
                result[k] = arr2[j];
                j++;
            }
            k++;
        }

        if (i == a1) {
            while (j < a2) {
                result[k] = arr2[j];
                j++;
                k++;
            }
        }
        if (j == a2) {
            while (i < a1) {
                result[k] = arr1[i];
                i++;
                k++;
            }
        }
        for (int ele : result) {
            System.out.print(ele + " ");
        }
    }
}
