/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

import java.util.ArrayList;
import java.util.List;
import model.Color;
import model.Fabric;
import model.Size;
import model.TShirt;

/**
 *
 * @author Leyteris
 */
public class BucketSort {

    protected static void BucketSortsByColorLimited(List<TShirt> shirts, int start, int end, boolean order) {

        int bucketNumber = Color.values().length;

        List<List<TShirt>> bucketList = new ArrayList();

        for (int i = 0; i < bucketNumber; i++) {
            bucketList.add(new ArrayList<TShirt>());
        }

        TShirt tshirt;
        for (int i = start; i < end; i++) {
            tshirt = shirts.get(i);
            if (order) {
                bucketList.get(tshirt.getColor().ordinal()).add(tshirt);
            } else {
                bucketList.get(bucketNumber - 1 - tshirt.getColor().ordinal()).add(tshirt);
            }
        }

        int counter = start;
        for (int i = 0; i < bucketList.size(); i++) {
            List<TShirt> bucket = bucketList.get(i);
            if (!bucket.isEmpty()) {
                for (int j = 0; j < bucket.size(); j++) {
                    shirts.set(counter, bucket.get(j));
                    counter++;
                }
            }
        }

    }

    public static void BucketSortsByColorAsc(List<TShirt> shirts) {
        BucketSortsByColorLimited(shirts, 0, shirts.size(), true);
    }

    public static void BucketSortsByColorDsc(List<TShirt> shirts) {
        BucketSortsByColorLimited(shirts, 0, shirts.size(), false);
    }

    protected static void BucketSortsBySizeLimited(List<TShirt> shirts, int start, int end, boolean order) {

        int bucketNumber = Size.values().length;

        List<List<TShirt>> bucketList = new ArrayList();

        for (int i = 0; i < bucketNumber; i++) {
            bucketList.add(new ArrayList<TShirt>());
        }

        TShirt tshirt;
        for (int i = start; i < end; i++) {
            tshirt = shirts.get(i);
            if (order) {
                bucketList.get(tshirt.getSize().ordinal()).add(tshirt);
            } else {
                bucketList.get(bucketNumber - 1 - tshirt.getSize().ordinal()).add(tshirt);
            }
        }

        int counter = start;
        for (int i = 0; i < bucketList.size(); i++) {
            List<TShirt> bucket = bucketList.get(i);
            if (!bucket.isEmpty()) {
                for (int j = 0; j < bucket.size(); j++) {
                    shirts.set(counter, bucket.get(j));
                    counter++;
                }
            }
        }

    }

    public static void BucketSortsBySizeAsc(List<TShirt> shirts) {
        BucketSortsBySizeLimited(shirts, 0, shirts.size(), true);
    }

    public static void BucketSortsBySizeDsc(List<TShirt> shirts) {
        BucketSortsBySizeLimited(shirts, 0, shirts.size(), false);
    }

    protected static void BucketSortsByFabricLimited(List<TShirt> shirts, int start, int end, boolean order) {

        int bucketNumber = Fabric.values().length;

        List<List<TShirt>> bucketList = new ArrayList();

        for (int i = 0; i < bucketNumber; i++) {
            bucketList.add(new ArrayList<TShirt>());
        }

        TShirt tshirt;
        for (int i = start; i < end; i++) {
            tshirt = shirts.get(i);
            if (order) {
                bucketList.get(tshirt.getFabric().ordinal()).add(tshirt);
            } else {
                bucketList.get(bucketNumber - 1 - tshirt.getFabric().ordinal()).add(tshirt);
            }
        }

        int counter = start;
        for (int i = 0; i < bucketList.size(); i++) {
            List<TShirt> bucket = bucketList.get(i);
            if (!bucket.isEmpty()) {
                for (int j = 0; j < bucket.size(); j++) {
                    shirts.set(counter, bucket.get(j));
                    counter++;
                }
            }
        }

    }

    public static void BucketSortsByFabricAsc(List<TShirt> shirts) {
        BucketSortsByFabricLimited(shirts, 0, shirts.size(), true);
    }

    public static void BucketSortsByFabricDsc(List<TShirt> shirts) {
        BucketSortsByFabricLimited(shirts, 0, shirts.size(), false);
    }

    protected static void BucketSortsByAll(List<TShirt> shirts, boolean order) {
        if (order) {
            BucketSortsByColorAsc(shirts);
        } else {
            BucketSortsByColorDsc(shirts);
        }

        Color color = shirts.get(0).getColor();
        int k = 0;
        for (int i = 1; i < shirts.size(); i++) {
            if (!shirts.get(i).getColor().equals(color)) {
                BucketSortsBySizeLimited(shirts, k, i, order);
                k = i;
                color = shirts.get(i).getColor();
            }
        }
        BucketSortsBySizeLimited(shirts, k, shirts.size(), order);

        Size size = shirts.get(0).getSize();
        k = 0;
        for (int i = 1; i < shirts.size(); i++) {
            if (!shirts.get(i).getSize().equals(size)) {
                BucketSortsByFabricLimited(shirts, k, i, order);
                k = i;
                size = shirts.get(i).getSize();
            }
        }
        BucketSortsByFabricLimited(shirts, k, shirts.size(), order);
    }

    public static void BucketSortsByAllAsc(List<TShirt> shirts) {
        BucketSortsByAll(shirts, true);
    }

    public static void BucketSortsByAllDsc(List<TShirt> shirts) {
        BucketSortsByAll(shirts, false);
    }

}
