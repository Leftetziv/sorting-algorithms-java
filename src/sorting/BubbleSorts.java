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
        long startTime = System.nanoTime();

        BubbleSortsByFabricLimited(shirts, 1, shirts.size(), true);

        long endTime = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println("BubbleSortsByFabricAsc>>> \t" + totalTime / 1000000.0);
    }

    public static void BubbleSortsByFabricDsc(List<TShirt> shirts) {
        long startTime = System.nanoTime();

        BubbleSortsByFabricLimited(shirts, 1, shirts.size(), false);

        long endTime = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println("BubbleSortsByFabricDsc>>> \t" + totalTime / 1000000.0);
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
        long startTime = System.nanoTime();

        BubbleSortsBySizeLimited(shirts, 1, shirts.size(), true);

        long endTime = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println("\nBubbleSortsBySizeAsc>>> \t" + totalTime / 1000000.0);
    }

    public static void BubbleSortsBySizeDsc(List<TShirt> shirts) {
        long startTime = System.nanoTime();

        BubbleSortsBySizeLimited(shirts, 1, shirts.size(), false);

        long endTime = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println("BubbleSortsBySizeDsc>>> \t" + totalTime / 1000000.0);
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
        long startTime = System.nanoTime();

        BubbleSortsByColorLimited(shirts, 1, shirts.size(), true);

        long endTime = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println("BubbleSortsByColorAsc>>> \t" + totalTime / 1000000.0);
    }

    public static void BubbleSortsByColorDsc(List<TShirt> shirts) {
        long startTime = System.nanoTime();

        BubbleSortsByColorLimited(shirts, 1, shirts.size(), false);

        long endTime = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println("BubbleSortsByColorDsc>>> \t" + totalTime / 1000000.0);
    }

    //version 2
    protected static void BubbleSortsByAll(List<TShirt> shirts, boolean order) {
        if (order) {
            BubbleSortsByColorLimited(shirts, 1, shirts.size(), true);
        } else {
            BubbleSortsByColorLimited(shirts, 1, shirts.size(), false);
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
        long startTime = System.nanoTime();

        BubbleSortsByAll(shirts, true);

        long endTime = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println("BubbleSortsByAllAsc>>>>> \t" + totalTime / 1000000.0);
    }

    public static void BubbleSortsByAllDsc(List<TShirt> shirts) {
        long startTime = System.nanoTime();

        BubbleSortsByAll(shirts, false);

        long endTime = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println("BubbleSortsByAllDsc>>>>> \t" + totalTime / 1000000.0);
    }

    //version 1
    /*
    public static void BubbleSortsByAll(List<TShirt> shirts) {
        TShirt temp;

        for (int i = 1; i < shirts.size(); i++) {
            for (int j = 0; j < shirts.size() - i; j++) {
                if (shirts.get(j).getColor().compareTo(shirts.get(j + 1).getColor()) > 0) {
                    temp = shirts.get(j);
                    shirts.set(j, shirts.get(j + 1));
                    shirts.set(j + 1, temp);
                } else if (shirts.get(j).getColor().equals(shirts.get(j + 1).getColor())) {
                    if (shirts.get(j).getSize().compareTo(shirts.get(j + 1).getSize()) > 0) {
                        temp = shirts.get(j);
                        shirts.set(j, shirts.get(j + 1));
                        shirts.set(j + 1, temp);
                    } else if (shirts.get(j).getSize().equals(shirts.get(j + 1).getSize())) {
                        if (shirts.get(j).getFabric().compareTo(shirts.get(j + 1).getFabric()) > 0) {
                            temp = shirts.get(j);
                            shirts.set(j, shirts.get(j + 1));
                            shirts.set(j + 1, temp);
                        }
                    }
                }
            }
        }
    }*/
}
