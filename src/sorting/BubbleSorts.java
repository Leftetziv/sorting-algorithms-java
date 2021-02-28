/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

import java.util.List;
import model.Color;
import model.Fabric;
import model.Size;
import model.TShirt;

/**
 *
 * @author Leyteris
 */
public class BubbleSorts {

//Integer Bubblesort
//    public static int[] myBubbleSort(int[] arr) {
//        
//        for (int i=1;i<arr.length;i++){
//            for (int j=0;j<arr.length-i;j++) {
//                if (arr[j]>arr[j+1]) {
//                    int temp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = temp;
//                }
//            }
//        }
//        return arr;
//    }
    protected static void BubbleSortsByFabricLimited(List<TShirt> shirts, int start, int end, boolean order) {
        TShirt temp;

        for (int k = 1, i = start; i < end; i++, k++) {
            for (int j = start - 1; j < end - k; j++) {
                if (order) {
                    if (shirts.get(j).getFabric().compareTo(shirts.get(j + 1).getFabric()) > 0) {
                        temp = shirts.get(j);
                        shirts.set(j, shirts.get(j + 1));
                        shirts.set(j + 1, temp);
                    }
                } else {
                    if (shirts.get(j).getFabric().compareTo(shirts.get(j + 1).getFabric()) < 0) {
                        temp = shirts.get(j);
                        shirts.set(j, shirts.get(j + 1));
                        shirts.set(j + 1, temp);
                    }
                }
            }
        }
    }

    public static void BubbleSortsByFabricAsc(List<TShirt> shirts) {
        BubbleSortsByFabricLimited(shirts, 1, shirts.size(), true);
    }

    public static void BubbleSortsByFabricDsc(List<TShirt> shirts) {
        BubbleSortsByFabricLimited(shirts, 1, shirts.size(), false);
    }

    protected static void BubbleSortsBySizeLimited(List<TShirt> shirts, int start, int end, boolean order) {
        TShirt temp;

        for (int k = 1, i = start; i < end; i++, k++) {
            for (int j = start - 1; j < end - k; j++) {
                if (order) {
                    if (shirts.get(j).getSize().compareTo(shirts.get(j + 1).getSize()) > 0) {
                        temp = shirts.get(j);
                        shirts.set(j, shirts.get(j + 1));
                        shirts.set(j + 1, temp);
                    }
                } else {
                    if (shirts.get(j).getSize().compareTo(shirts.get(j + 1).getSize()) < 0) {
                        temp = shirts.get(j);
                        shirts.set(j, shirts.get(j + 1));
                        shirts.set(j + 1, temp);
                    }
                }
            }
        }
    }

    public static void BubbleSortsBySizeAsc(List<TShirt> shirts) {
        BubbleSortsBySizeLimited(shirts, 1, shirts.size(), true);
    }

    public static void BubbleSortsBySizeDsc(List<TShirt> shirts) {
        BubbleSortsBySizeLimited(shirts, 1, shirts.size(), false);
    }

    protected static void BubbleSortsByColorLimited(List<TShirt> shirts, int start, int end, boolean order) {
        TShirt temp;

        for (int k = 1, i = start; i < end; i++, k++) {
            for (int j = start - 1; j < end - k; j++) {
                if (order) {
                    if (shirts.get(j).getColor().compareTo(shirts.get(j + 1).getColor()) > 0) {
                        temp = shirts.get(j);
                        shirts.set(j, shirts.get(j + 1));
                        shirts.set(j + 1, temp);
                    }
                } else {
                    if (shirts.get(j).getColor().compareTo(shirts.get(j + 1).getColor()) < 0) {
                        temp = shirts.get(j);
                        shirts.set(j, shirts.get(j + 1));
                        shirts.set(j + 1, temp);
                    }
                }
            }
        }
    }

    public static void BubbleSortsByColorAsc(List<TShirt> shirts) {
        BubbleSortsByColorLimited(shirts, 1, shirts.size(), true);
    }

    public static void BubbleSortsByColorDsc(List<TShirt> shirts) {
        BubbleSortsByColorLimited(shirts, 1, shirts.size(), false);
    }

    //version 2
    protected static void BubbleSortsByAll(List<TShirt> shirts, boolean order) {
        if (order) {
            BubbleSortsByColorAsc(shirts);
        } else {
            BubbleSortsByColorDsc(shirts);
        }

        Color color = shirts.get(0).getColor();
        int k = 1;
        for (int i = 1; i < shirts.size(); i++) {
            if (!shirts.get(i).getColor().equals(color)) {
                BubbleSortsBySizeLimited(shirts, k, i, order);
                k = i + 1;
                color = shirts.get(i).getColor();
            }
        }
        BubbleSortsBySizeLimited(shirts, k, shirts.size(), order);

        Size size = shirts.get(0).getSize();
        k = 1;
        for (int i = 1; i < shirts.size(); i++) {
            if (!shirts.get(i).getSize().equals(size)) {
                BubbleSortsByFabricLimited(shirts, k, i, order);
                k = i + 1;
                size = shirts.get(i).getSize();
            }
        }
        BubbleSortsByFabricLimited(shirts, k, shirts.size(), order);
    }

    public static void BubbleSortsByAllAsc(List<TShirt> shirts) {
        BubbleSortsByAll(shirts, true);
    }

    public static void BubbleSortsByAllDsc(List<TShirt> shirts) {
        BubbleSortsByAll(shirts, false);
    }

    //version 1
//    public static void BubbleSortsByAll(List<TShirt> shirts) {
//        TShirt temp;
//
//        for (int i = 1; i < shirts.size(); i++) {
//            for (int j = 0; j < shirts.size() - i; j++) {
//                if (shirts.get(j).getColor().compareTo(shirts.get(j + 1).getColor()) > 0) {
//                    temp = shirts.get(j);
//                    shirts.set(j, shirts.get(j + 1));
//                    shirts.set(j + 1, temp);
//                } else if (shirts.get(j).getColor().equals(shirts.get(j + 1).getColor())) {
//                    if (shirts.get(j).getSize().compareTo(shirts.get(j + 1).getSize()) > 0) {
//                        temp = shirts.get(j);
//                        shirts.set(j, shirts.get(j + 1));
//                        shirts.set(j + 1, temp);
//                    } else if (shirts.get(j).getSize().equals(shirts.get(j + 1).getSize())) {
//                        if (shirts.get(j).getFabric().compareTo(shirts.get(j + 1).getFabric()) > 0) {
//                            temp = shirts.get(j);
//                            shirts.set(j, shirts.get(j + 1));
//                            shirts.set(j + 1, temp);
//                        }
//                    }
//                }
//            }
//        }
//    }
}
