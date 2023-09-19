package org.example;

public abstract class Clothes {
    public Size ClothesSize;
    public int price;
    public String colour;

    public Clothes(Size clothesSize, int price, String colour) {
        this.ClothesSize = clothesSize;
        this.price = price;
        this.colour = colour;
    }
}
