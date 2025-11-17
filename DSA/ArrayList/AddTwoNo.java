import java.util.ArrayList;
import java.util.Arrays;

public class AddTwoNo {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        list1.addAll(Arrays.asList(2, 3, 4, 5, 6, 67, 8));
        list2.addAll(Arrays.asList(2, 3, 4, 5, 6, 67, 8));
        int n1 = list1.size();
        int n2 = list2.size();
        ArrayList<Integer> sum = new ArrayList<>();
        for (int i = 0; i < n1 && i < n2; i++) {
           if(list1.get(i)+list2.get(i)<=9){
            
           }
        }
        System.out.println(sum);
    }
}
