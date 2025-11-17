interface PaymentProcessor {
    void processPayment(double amount);
    void refundPayment(double amount);
}

class CreditCardPayment implements PaymentProcessor {
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment of $" + amount);
    }

    public void refundPayment(double amount) {
        System.out.println("Refunding credit card payment of $" + amount);
    }
}

class PayPalPayment implements PaymentProcessor {
    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment of $" + amount);
    }

    public void refundPayment(double amount) {
        System.out.println("Refunding PayPal payment of $" + amount);
    }
}

class UPIPayment implements PaymentProcessor {
    public void processPayment(double amount) {
        System.out.println("Processing UPI payment of $" + amount);
    }

    public void refundPayment(double amount) {
        System.out.println("Refunding UPI payment of $" + amount);
    }
}

public class PaymentSystem {
    public static void main(String[] args) {
        PaymentProcessor creditCard = new CreditCardPayment();
        PaymentProcessor paypal = new PayPalPayment();
        PaymentProcessor upi = new UPIPayment();

        creditCard.processPayment(100.0);
        paypal.processPayment(200.0);
        upi.processPayment(300.0);

        creditCard.refundPayment(50.0);
        paypal.refundPayment(75.0);
        upi.refundPayment(150.0);
    }
}
