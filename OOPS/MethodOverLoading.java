class overLoading {
    void sum(int a, int b) {
        System.out.println(a + b);
    }

    void sum(int a, int b, int c) {
        System.out.println(a + b+c);
    }

    void sum(double a, double b) {
        System.out.println(a + b);
    }
}

public class MethodOverLoading {
    public static void main(String[] args) {
        overLoading obj = new overLoading();
        obj.sum(2, 3);
        obj.sum(2, 3, 5);
        obj.sum(2.0, 3.0);
    }
}
