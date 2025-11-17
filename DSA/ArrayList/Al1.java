import java.util.ArrayList;

public class Al1 {
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<>();
        al.add(0,2);
        al.add(23);
        al.add(245);
        System.out.println(al);
        al.set(1,220000000);
        System.out.println(al+" "+al.size());

    }
}
