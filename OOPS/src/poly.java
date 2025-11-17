class Example {
    void abc() {
        System.out.println("hello");
    }
}

class poly extends Example {
    abc(){
        System.out.println("world");
    }

    public static void main(String[] args) {
        poly p = new poly();
        p.abc();
    }
}
