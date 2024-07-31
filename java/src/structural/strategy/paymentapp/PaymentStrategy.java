package structural.strategy.paymentapp;

/**
 * Strategy interface
 * */
public interface PaymentStrategy {
    void pay(int amount);
    void collectPaymentDetails();
}
