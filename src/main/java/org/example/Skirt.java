package org.example;

public class Skirt extends Clothes implements WomenClothes{
    public Skirt(Size clothesSize, int price, String colour) {
        super(clothesSize, price, colour);
    }

    @Override
    public void getDressedWomen() {

    }
}
