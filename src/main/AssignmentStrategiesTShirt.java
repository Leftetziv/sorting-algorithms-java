/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Arrays;
import java.util.List;
import model.Cart;
import model.TShirt;
import sorting.BubbleSorts;
import sorting.BucketSort;
import sorting.QuickSort;

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

        cart.fillCart(50);

        List<TShirt> ShowTShirts = cart.ShowTShirts();
        cart.payTotal();

//BubbleSorts:
//        BubbleSorts.BubbleSortsBySizeAsc(ShowTShirts);
//        System.out.println("\n BUBBLE-SORT BY SIZE ASC>>>>>>>>>>>>>>>>>>>>");
//        cart.ShowTShirts();
//        BubbleSorts.BubbleSortsBySizeDsc(ShowTShirts);
//        System.out.println("\n BUBBLE-SORT BY SIZE DSC>>>>>>>>>>>>>>>>>>>>");
//        cart.ShowTShirts();
//
//        BubbleSorts.BubbleSortsByColorAsc(ShowTShirts);
//        System.out.println("\n BUBBLE-SORT BY COLOR ASC>>>>>>>>>>>>>>>>>>>>");
//        cart.ShowTShirts();
//        BubbleSorts.BubbleSortsByColorDsc(ShowTShirts);
//        System.out.println("\n BUBBLE-SORT BY COLOR DSC>>>>>>>>>>>>>>>>>>>>");
//        cart.ShowTShirts();
//        
//        BubbleSorts.BubbleSortsByFabricAsc(ShowTShirts);
//        System.out.println("\n BUBBLE-SORT BY FABRIC ASC>>>>>>>>>>>>>>>>>>>>");
//        cart.ShowTShirts();
//        BubbleSorts.BubbleSortsByFabricDsc(ShowTShirts);
//        System.out.println("\n BUBBLE-SORT BY FABRIC DSC>>>>>>>>>>>>>>>>>>>>");
//        cart.ShowTShirts();
//
//        BubbleSorts.BubbleSortsByAllAsc(ShowTShirts);
//        System.out.println("\n BUBBLE-SORT BY ALL ASC>>>>>>>>>>>>>>>>>>>>");
//        cart.ShowTShirts();
//        BubbleSorts.BubbleSortsByAllDsc(ShowTShirts);
//        System.out.println("\n BUBBLE-SORT BY ALL DSC>>>>>>>>>>>>>>>>>>>>");
//        cart.ShowTShirts();
//
//
//BacketSorts:
//        BucketSort.BucketSortsBySizeAsc(ShowTShirts);
//        System.out.println("\n BUCKET-SORT BY SIZE ASC>>>>>>>>>>>>>>>>>>>>");
//        cart.ShowTShirts();
//        BucketSort.BucketSortsBySizeDsc(ShowTShirts);
//        System.out.println("\n BUCKET-SORT BY SIZE DSC>>>>>>>>>>>>>>>>>>>>");
//        cart.ShowTShirts();
//        
//        BucketSort.BucketSortsByColorAsc(ShowTShirts);
//        System.out.println("\n BUCKET-SORT BY COLOR ASC>>>>>>>>>>>>>>>>>>>>");
//        cart.ShowTShirts();
//        BucketSort.BucketSortsByColorDsc(ShowTShirts);
//        System.out.println("\n BUCKET-SORT BY COLOR DSC>>>>>>>>>>>>>>>>>>>>");
//        cart.ShowTShirts();
//        
//        BucketSort.BucketSortsByFabricAsc(ShowTShirts);
//        System.out.println("\n BUCKET-SORT BY FABRIC ASC>>>>>>>>>>>>>>>>>>>>");
//        cart.ShowTShirts();
//        BucketSort.BucketSortsByFabricDsc(ShowTShirts);
//        System.out.println("\n BUCKET-SORT BY FABRIC DSC>>>>>>>>>>>>>>>>>>>>");
//        cart.ShowTShirts();
//
        BucketSort.BucketSortsByAllAsc(ShowTShirts);
        System.out.println("\n BUCKET-SORT BY ALL ASC>>>>>>>>>>>>>>>>>>>>");
        cart.ShowTShirts();
        BucketSort.BucketSortsByAllDsc(ShowTShirts);
        System.out.println("\n BUCKET-SORT BY ALL DSC>>>>>>>>>>>>>>>>>>>>");
        cart.ShowTShirts();
//
//QuickSorts:
//        QuickSort.QuickSortsBySizeAsc(ShowTShirts);
//        System.out.println("\n QUICK-SORT BY SIZE ASC>>>>>>>>>>>>>>>>>>>");
//        cart.ShowTShirts();
//        QuickSort.QuickSortsBySizeDsc(ShowTShirts);
//        System.out.println("\n QUICK-SORT BY SIZE DSC>>>>>>>>>>>>>>>>>>>");
//        cart.ShowTShirts();
//        
//        QuickSort.QuickSortsByColorAsc(ShowTShirts);
//        System.out.println("\n QUICK-SORT BY COLOR ASC>>>>>>>>>>>>>>>>>>>");
//        cart.ShowTShirts();
//        QuickSort.QuickSortsByColorDsc(ShowTShirts);
//        System.out.println("\n QUICK-SORT BY COLOR DSC>>>>>>>>>>>>>>>>>>>");
//        cart.ShowTShirts();
//
//        QuickSort.QuickSortsByFabricAsc(ShowTShirts);
//        System.out.println("\n QUICK-SORT BY FABRIC ASC>>>>>>>>>>>>>>>>>>>");
//        cart.ShowTShirts();
//        QuickSort.QuickSortsByFabricDsc(ShowTShirts);
//        System.out.println("\n QUICK-SORT BY FABRIC DSC>>>>>>>>>>>>>>>>>>>");
//        cart.ShowTShirts();
//
//        QuickSort.QuickSortsByAllAsc(ShowTShirts);
//        System.out.println("\n QUICK-SORT BY ALL ASC>>>>>>>>>>>>>>>>>>>");
//        cart.ShowTShirts();
//        QuickSort.QuickSortsByAllDsc(ShowTShirts);
//        System.out.println("\n QUICK-SORT BY ALL DSC>>>>>>>>>>>>>>>>>>>");
//        cart.ShowTShirts();
    }

}
