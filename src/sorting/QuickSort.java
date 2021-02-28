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
        quickSortSize(shirts, 0, shirts.size() - 1, true);
    }

    public static void QuickSortsBySizeDsc(List<TShirt> shirts) {
        quickSortSize(shirts, 0, shirts.size() - 1, false);
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
        quickSortColor(shirts, 0, shirts.size() - 1, true);
    }

    public static void QuickSortsByColorDsc(List<TShirt> shirts) {
        quickSortColor(shirts, 0, shirts.size() - 1, false);
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
        quickSortFabric(shirts, 0, shirts.size() - 1, true);
    }

    public static void QuickSortsByFabricDsc(List<TShirt> shirts) {
        quickSortFabric(shirts, 0, shirts.size() - 1, false);
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
        QuickSortsByAll(shirts, true);
    }

    public static void QuickSortsByAllDsc(List<TShirt> shirts) {
        QuickSortsByAll(shirts, false);
    }

    protected static void QuickSortsByAll(List<TShirt> shirts, boolean order) {
        if (order) {
            QuickSortsByColorAsc(shirts);
        } else {
            QuickSortsByColorDsc(shirts);
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
                quickSortFabric(shirts, k, i-1, order);
                k = i;
                size = shirts.get(i).getSize();
            }
        }
        quickSortFabric(shirts, k, shirts.size()-1, order);
    }

}
