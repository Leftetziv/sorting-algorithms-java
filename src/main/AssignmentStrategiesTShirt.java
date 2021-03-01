/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import model.Cart;
import model.TShirt;
import sorting.BubbleSorts;
import sorting.BucketSort;
import sorting.QuickSort;
import util.Utility;

/**
 *
 * @author Leyteris
 */
public class AssignmentStrategiesTShirt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Cart cart = Cart.getCart();

        cart.fillCart(1000);

        List<TShirt> tShirts = cart.getTShirts();
//        cart.ShowTShirts();
//        cart.payTotal();

        List<TShirt> toSort;


        for (int i = 1; i <= 8; i++) {
            toSort = cart.clone();
            
//            System.out.println("\nunsorted:");
//            for (TShirt t : toSort) {
//                System.out.println(t);
//            }
            
            BubbleSorts.BubbleSortsByAllAsc(toSort);
            
//            System.out.println("sorted:");
//            for (TShirt t : toSort) {
//                System.out.println(t);
//            }
        }
//        
//BubbleSorts:
//        toSort = cart.clone();
//        BubbleSorts.BubbleSortsBySizeAsc(toSort);
//        Utility.printList(toSort);
//
//        toSort = cart.clone();
//        BubbleSorts.BubbleSortsBySizeDsc(toSort);
//        Utility.printList(toSort);
//
//        toSort = cart.clone();
//        BubbleSorts.BubbleSortsByColorAsc(toSort);
//        Utility.printList(toSort);
//
//        toSort = cart.clone();
//        BubbleSorts.BubbleSortsByColorDsc(toSort);
//        Utility.printList(toSort);
//
//        toSort = cart.clone();
//        BubbleSorts.BubbleSortsByFabricAsc(toSort);
//        Utility.printList(toSort);
//
//        toSort = cart.clone();
//        BubbleSorts.BubbleSortsByFabricDsc(toSort);
//        Utility.printList(toSort);
//
//        toSort = cart.clone();
//        BubbleSorts.BubbleSortsByAllAsc(toSort);
//        Utility.printList(toSort);
//
//        toSort = cart.clone();
//        BubbleSorts.BubbleSortsByAllDsc(toSort);
//        Utility.printList(toSort);
//
//BacketSorts:
//        toSort = cart.clone();
//        BucketSort.BucketSortsBySizeAsc(toSort);
//        Utility.printList(toSort);
//
//        toSort = cart.clone();
//        BucketSort.BucketSortsBySizeDsc(toSort);
//        Utility.printList(toSort);
//
//        toSort = cart.clone();
//        BucketSort.BucketSortsByColorAsc(toSort);
//        Utility.printList(toSort);
//
//        toSort = cart.clone();
//        BucketSort.BucketSortsByColorDsc(toSort);
//        Utility.printList(toSort);
//
//        toSort = cart.clone();
//        BucketSort.BucketSortsByFabricAsc(toSort);
//        Utility.printList(toSort);
//
//        toSort = cart.clone();
//        BucketSort.BucketSortsByFabricDsc(toSort);
//        Utility.printList(toSort);
//
//        toSort = cart.clone();
//        BucketSort.BucketSortsByAllAsc(toSort);
//        Utility.printList(toSort);
//
//        toSort = cart.clone();
//        BucketSort.BucketSortsByAllDsc(toSort);
//        Utility.printList(toSort);
//
//QuickSorts:
//        toSort = cart.clone();
//        QuickSort.QuickSortsBySizeAsc(toSort);
//        Utility.printList(toSort);
//
//        toSort = cart.clone();
//        QuickSort.QuickSortsBySizeDsc(toSort);
//        Utility.printList(toSort);
//
//        toSort = cart.clone();
//        QuickSort.QuickSortsByColorAsc(toSort);
//        Utility.printList(toSort);
//
//        toSort = cart.clone();
//        QuickSort.QuickSortsByColorDsc(toSort);
//        Utility.printList(toSort);
//
//        toSort = cart.clone();
//        QuickSort.QuickSortsByFabricAsc(toSort);
//        Utility.printList(toSort);
//
//        toSort = cart.clone();
//        QuickSort.QuickSortsByFabricDsc(toSort);
//        Utility.printList(toSort);
//
//        toSort = cart.clone();
//        QuickSort.QuickSortsByAllAsc(toSort);
//        Utility.printList(toSort);
//
//        toSort = cart.clone();
//        QuickSort.QuickSortsByAllDsc(toSort);
//        Utility.printList(toSort);

    }

}
