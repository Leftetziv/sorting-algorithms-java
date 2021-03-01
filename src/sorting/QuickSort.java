/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

import java.util.List;
import model.Color;
import model.Size;
import model.TShirt;

/**
 *
 * @author Leyteris
 */
public class QuickSort {

    /* By Size*/
    public static void QuickSortsBySizeAsc(List<TShirt> shirts) {
        long startTime = System.nanoTime();

        quickSortSize(shirts, 0, shirts.size() - 1, true);

        long endTime = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println("QuickSortsBySizeAsc>>>>>> \t" + totalTime / 1000000.0);
    }

    public static void QuickSortsBySizeDsc(List<TShirt> shirts) {
        long startTime = System.nanoTime();

        quickSortSize(shirts, 0, shirts.size() - 1, false);

        long endTime = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println("QuickSortsBySizeDsc>>>>>> \t" + totalTime / 1000000.0);
    }

    protected static void quickSortSize(List<TShirt> shirts, int low, int high, boolean order) {
        if (low < high) {

            int pi = partitionSize(shirts, low, high, order);

            quickSortSize(shirts, low, pi - 1, order);
            quickSortSize(shirts, pi + 1, high, order);
        }
    }

    protected static int partitionSize(List<TShirt> shirts, int low, int high, boolean order) {
        TShirt pivot = shirts.get(high);

        int i = (low - 1);

        TShirt temp;
        for (int j = low; j < high; j++) {
            if (order) {
                if (shirts.get(j).getSize().ordinal() <= pivot.getSize().ordinal()) {
                    i++;
                    temp = shirts.get(j);
                    shirts.set(j, shirts.get(i));
                    shirts.set(i, temp);
                }
            } else {
                if (shirts.get(j).getSize().ordinal() >= pivot.getSize().ordinal()) {
                    i++;
                    temp = shirts.get(j);
                    shirts.set(j, shirts.get(i));
                    shirts.set(i, temp);
                }
            }

        }

        temp = shirts.get(i + 1);
        shirts.set(i + 1, shirts.get(high));
        shirts.set(high, temp);

        return (i + 1);
    }

    /* By Color*/
    public static void QuickSortsByColorAsc(List<TShirt> shirts) {
        long startTime = System.nanoTime();

        quickSortColor(shirts, 0, shirts.size() - 1, true);

        long endTime = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println("QuickSortsByColorAsc>>>>>> \t" + totalTime / 1000000.0);
    }

    public static void QuickSortsByColorDsc(List<TShirt> shirts) {
        long startTime = System.nanoTime();

        quickSortColor(shirts, 0, shirts.size() - 1, false);

        long endTime = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println("QuickSortsByColorDsc>>>>>> \t" + totalTime / 1000000.0);
    }

    protected static void quickSortColor(List<TShirt> shirts, int low, int high, boolean order) {
        if (low < high) {

            int pi = partitionColor(shirts, low, high, order);

            quickSortColor(shirts, low, pi - 1, order);
            quickSortColor(shirts, pi + 1, high, order);
        }
    }

    protected static int partitionColor(List<TShirt> shirts, int low, int high, boolean order) {
        TShirt pivot = shirts.get(high);

        int i = (low - 1);

        TShirt temp;
        for (int j = low; j < high; j++) {
            if (order) {
                if (shirts.get(j).getColor().ordinal() <= pivot.getColor().ordinal()) {
                    i++;
                    temp = shirts.get(j);
                    shirts.set(j, shirts.get(i));
                    shirts.set(i, temp);
                }
            } else {
                if (shirts.get(j).getColor().ordinal() >= pivot.getColor().ordinal()) {
                    i++;
                    temp = shirts.get(j);
                    shirts.set(j, shirts.get(i));
                    shirts.set(i, temp);
                }
            }

        }

        temp = shirts.get(i + 1);
        shirts.set(i + 1, shirts.get(high));
        shirts.set(high, temp);

        return (i + 1);
    }

    /* By fabric*/
    public static void QuickSortsByFabricAsc(List<TShirt> shirts) {
        long startTime = System.nanoTime();

        quickSortFabric(shirts, 0, shirts.size() - 1, true);

        long endTime = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println("QuickSortsByFabricAsc>>>>>> \t" + totalTime / 1000000.0);
    }

    public static void QuickSortsByFabricDsc(List<TShirt> shirts) {
        long startTime = System.nanoTime();

        quickSortFabric(shirts, 0, shirts.size() - 1, false);

        long endTime = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println("QuickSortsByFabricDsc>>>>>> \t" + totalTime / 1000000.0);
    }

    protected static void quickSortFabric(List<TShirt> shirts, int low, int high, boolean order) {
        if (low < high) {

            int pi = partitionFabric(shirts, low, high, order);

            quickSortFabric(shirts, low, pi - 1, order);
            quickSortFabric(shirts, pi + 1, high, order);
        }
    }

    protected static int partitionFabric(List<TShirt> shirts, int low, int high, boolean order) {

        TShirt pivot = shirts.get(high);

        int i = (low - 1);

        TShirt temp;
        for (int j = low; j < high; j++) {
            if (order) {
                if (shirts.get(j).getFabric().ordinal() <= pivot.getFabric().ordinal()) {
                    i++;
                    temp = shirts.get(j);
                    shirts.set(j, shirts.get(i));
                    shirts.set(i, temp);
                }
            } else {
                if (shirts.get(j).getFabric().ordinal() >= pivot.getFabric().ordinal()) {
                    i++;
                    temp = shirts.get(j);
                    shirts.set(j, shirts.get(i));
                    shirts.set(i, temp);
                }
            }
        }

        temp = shirts.get(i + 1);
        shirts.set(i + 1, shirts.get(high));
        shirts.set(high, temp);

        return (i + 1);
    }

    /* By All*/
    public static void QuickSortsByAllAsc(List<TShirt> shirts) {
        long startTime = System.nanoTime();

        QuickSortsByAll(shirts, true);

        long endTime = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println("QuickSortsByAllAsc>>>>>> \t" + totalTime / 1000000.0);
    }

    public static void QuickSortsByAllDsc(List<TShirt> shirts) {
        long startTime = System.nanoTime();

        QuickSortsByAll(shirts, false);

        long endTime = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println("QuickSortsByAllDsc>>>>>> \t" + totalTime / 1000000.0);
    }

    protected static void QuickSortsByAll(List<TShirt> shirts, boolean order) {
        if (order) {
            quickSortColor(shirts, 0, shirts.size() - 1, true);
        } else {
            quickSortColor(shirts, 0, shirts.size() - 1, false);
        }

        Color color = shirts.get(0).getColor();
        int k = 0;
        for (int i = 1; i < shirts.size(); i++) {
            if (!shirts.get(i).getColor().equals(color)) {
                quickSortSize(shirts, k, i - 1, order);
                k = i;
                color = shirts.get(i).getColor();
            }
        }
        quickSortSize(shirts, k, shirts.size() - 1, order);

        Size size = shirts.get(0).getSize();
        k = 0;
        for (int i = 1; i < shirts.size(); i++) {
            if (!shirts.get(i).getSize().equals(size)) {
                quickSortFabric(shirts, k, i - 1, order);
                k = i;
                size = shirts.get(i).getSize();
            }
        }
        quickSortFabric(shirts, k, shirts.size() - 1, order);
    }

}
