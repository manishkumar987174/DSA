public  class Final {
    public static void main(String[] args) {
        Employe e1 = new Employe("Manish");
        System.out.println(e1.name);
        System.out.println(e1.getId());
        e1.setSalary(300000000);
        System.out.println(e1.getSalary());
        System.out.println(Employe.company);

    }
}
