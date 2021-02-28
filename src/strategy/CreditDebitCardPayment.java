/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;


public class CreditDebitCardPayment implements PaymentStrategy {

    private final String cardType;
    private final String cardNumber;
    private final int expirationDate;

    public CreditDebitCardPayment(String cardType, String cardNumber, int expirationDate) {
        this.cardType = cardType;
        this.cardNumber = cardNumber;
        this.expirationDate = expirationDate;
    }
    
    
    @Override
    public void pay(double price) {
        System.out.println("Card with number: "+cardNumber+" paid the amount of: $"+String.format("%.2f",price));
    }
    
}
