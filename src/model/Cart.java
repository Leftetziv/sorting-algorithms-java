/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;
import strategy.CashPayment;
import strategy.CreditDebitCardPayment;
import strategy.MoneyBankTransferPayment;
import strategy.PaymentStrategy;

/**
 *
 * @author Leyteris
 */
public class Cart {

    private static Cart cart;
    private List<TShirt> tshirts;

    private Cart() {
        this.tshirts = new ArrayList();
    }

    public static Cart getCart() {
        if (cart == null) {
            cart = new Cart();
        }

        return cart;
    }

    public void addToCart(TShirt shirt) {
        this.tshirts.add(shirt);
    }

    public void removeFromCart(TShirt shirt) {
        tshirts.remove(shirt);
    }

    public double computeTotalPrice() {
        double sum = 0;
        for (TShirt t : this.tshirts) {
            sum += t.getPrice();
        }

        return sum;
    }

    public void payTotal(PaymentStrategy paymentStrategy) {
        paymentStrategy.pay(computeTotalPrice());
    }

    public void payTotal() {
        double totalPrice = computeTotalPrice();
        PaymentStrategy paymentStrategy;

        if (totalPrice <= 300) {
            paymentStrategy = new CashPayment();
        } else if (totalPrice <= 400) {
            paymentStrategy = new CreditDebitCardPayment("Debit", "424242424242424242", 23);
        } else {
            paymentStrategy = new MoneyBankTransferPayment("GR123456789123456789", "Fou Bar");
        }

        paymentStrategy.pay(totalPrice);
    }

    public void fillCart(int numberOfTShirts) {
        for (int i = 0; i < numberOfTShirts; i++) {
            addToCart(new TShirt());
        }
    }

    public void ShowTShirts() {
        for (TShirt t:tshirts) {
            System.out.println(t);
        }
    }
    
    public List<TShirt> getTShirts() {
        return tshirts;
    }
    
    public List<TShirt> clone() {
        List<TShirt> clone = new ArrayList();
        for (TShirt t:tshirts) {
            clone.add(t);
        }
        return clone;
    }
}
