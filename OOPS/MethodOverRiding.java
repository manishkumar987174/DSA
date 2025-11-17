class bank {
    void interest() {
        System.out.println("from bank!!");
    }
}

class sbi extends bank {
    @Override
    void interest() {
        System.out.println("from sbi!!!!!");
    }
}

class pnb extends bank {
    @Override
    void interest() {
        System.out.println("from pnb!!");
    }
}

public class MethodOverRiding {
    public static void main(String[] args) {
        bank obj = new bank();
        bank obj1 = new sbi();
        bank obj2 = new pnb();

        obj.interest();
        obj1.interest();
        obj2.interest();
    }
}
