/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

public class MoneyBankTransferPayment implements PaymentStrategy {

    private final String IBAN;
    private final String acountOwner;

    public MoneyBankTransferPayment(String IBAN, String acountOwner) {
        this.IBAN = IBAN;
        this.acountOwner = acountOwner;
    }

    
    @Override
    public void pay(double price) {
        System.out.println("Bank account with IBAN: " + IBAN + " paid the amount of: $" + String.format("%.2f",price));
    }

}
