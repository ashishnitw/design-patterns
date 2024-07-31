package structural.strategy.paymentapp;

public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart(new PaymentByCreditCard("John Doe", "1234567890123456", "786", "12/15"));
        cart.checkout(1000);

        cart = new ShoppingCart(new PaymentByPaypal("abc@gmail.com", "password"));
        cart.checkout(2000);
    }
}
