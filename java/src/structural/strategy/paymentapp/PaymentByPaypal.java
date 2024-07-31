package structural.strategy.paymentapp;

public class PaymentByPaypal implements PaymentStrategy {
    private String emailId;
    private String password;

    public PaymentByPaypal(String emailId, String password) {
        this.emailId = emailId;
        this.password = password;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid using Paypal");
    }

    @Override
    public void collectPaymentDetails() {
        System.out.println("Collecting payment details for Paypal");
    }
}
