public class Encapsulation {
    private double balance;
    private String name;

    public void deposite(double amount) {
        balance += amount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void withdrawl(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else
            System.out.println("Insufficient balance!!");
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        Encapsulation acc = new Encapsulation();
        acc.deposite(5000);
        acc.withdrawl(1000);
        System.out.println(acc.getBalance());
        acc.deposite(20000);
        System.out.println(acc.getBalance());
        acc.setName("Manish");
        System.out.println(acc.getName());
    }
}
