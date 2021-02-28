/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;


public class CashPayment implements PaymentStrategy {

    public CashPayment() {
    }
    
    @Override
    public void pay(double price) {
        System.out.println("Paid $"+String.format("%.2f",price)+" with cash");
    }
    
}
