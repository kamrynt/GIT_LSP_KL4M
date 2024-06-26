package org.howard.edu.lsp.oopfinal.question2;

public class PaymentStrategyDriver {
    public static void main(String[] args) {
        ShoppingCart cart;

        // Using Credit Card Payment
        cart = new ShoppingCart(new CreditCardPayment("1234-5678-9012-3456"));
        cart.checkout(100.0);

        // Using PayPal Payment
        cart = new ShoppingCart(new PayPalPayment("user@example.com"));
        cart.checkout(50.0);

        // Using Bitcoin Payment
        cart = new ShoppingCart(new BitcoinPayment("1AaBbCcDdEeFfGgHh"));
        cart.checkout(75.0);
    }
}
