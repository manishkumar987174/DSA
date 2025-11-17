public class Inheritance {
    public static class car {
        String name;
        String model;
        double price;
    }

    public static class bmw extends car {
        int year;
    }

    public static void main(String[] args) {
        bmw c1 = new bmw();
        c1.name = "BMW";
        c1.price = 1000000;
        c1.year = 2020;
        c1.model = "bmwz";
        System.out.println(c1.name + " " + c1.price);
    }

}
