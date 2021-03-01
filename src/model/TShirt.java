/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Random;

/**
 *
 * @author Leyteris
 */
public class TShirt {

    private String name;
    private double price;
    private Color color;
    private Size size;
    private Fabric fabric;

    private static String[] names;

    static {
        names = new String[]{"Aloha", "Baseball", "Camp",
            "Epaulette", "Lumberjack", "Granddad", "Golf",
            "Henley", "Polo", "Tuxedo", "Tunic", "Sweatshirt"};
    }


    public TShirt() {
        this.name = randomName();
        this.color = randomColor();
        this.size = randomSize();
        this.fabric = randomFabric();
        calcPrice();
    }

    public TShirt(String name, double price, Color color, Size size, Fabric fabric) {
        this.name = name;
        this.price = price;
        this.color = color;
        this.size = size;
        this.fabric = fabric;
    }
    
    public TShirt(TShirt t) {
        this.name = t.getName();
        this.price = t.getPrice();
        this.color = t.getColor();
        this.size = t.getSize();
        this.fabric = t.getFabric();
    }
    
    

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Fabric getFabric() {
        return fabric;
    }

    public void setFabric(Fabric fabric) {
        this.fabric = fabric;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String randomName() {
        Random random = new Random();

        int nextInt = random.nextInt(names.length);
        return names[nextInt];
    }

    private Size randomSize() {
        Random random = new Random();

        Size[] values = Size.values();
        int nextInt = random.nextInt(values.length);
        return values[nextInt];
    }

    private Color randomColor() {
        Random random = new Random();

        Color[] values = Color.values();
        int nextInt = random.nextInt(values.length);
        return values[nextInt];
    }

    private Fabric randomFabric() {
        Random random = new Random();

        Fabric[] values = Fabric.values();
        int nextInt = random.nextInt(values.length);
        return values[nextInt];
    }

    private void calcPrice() {
        int colorOrdinal = this.color.ordinal() + 1;
        int sizeOrdinal = this.size.ordinal() + 1;
        int fabricOrdinal = this.fabric.ordinal() + 1;

        this.price = 5;
        price = price + sizeOrdinal;
        price = price + 1.5 * colorOrdinal;
        price = price + price * (5.0/fabricOrdinal);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TShirt{name=").append(String.format("%15s",name));
        sb.append(", price=").append(String.format("%7.2f",price));
        sb.append(", color=").append(String.format("%10s",color));
        sb.append(", size=").append(String.format("%5s",size));
        sb.append(", fabric=").append(String.format("%10s",fabric));
        sb.append('}');
        return sb.toString();
    }

}
