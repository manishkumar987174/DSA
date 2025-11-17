// import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoDlist {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>();
        l1.addAll(Arrays.asList(2, 3, 4, 5));
        List<Integer> l2 = new ArrayList<>();
        l2.addAll(Arrays.asList(2, 3, 4));
        List<Integer> l3 = new ArrayList<>();
        List<Integer> l4 = new ArrayList<>();
        l4.add(5);
        List<List<Integer>> list = new ArrayList<>();
        list.addAll(Arrays.asList(l1,l2,l3,l4));

        for (int i = 0; i < list.size(); i++) {
            List<Integer> x = list.get(i);
            for (int j = 0; j < x.size(); j++) {
                System.out.print(x.get(j) + " ");
            }
            System.out.println();
        }
    }
}
