package org.example;

public class TShirt extends Clothes implements MenClothes, WomenClothes{

    public TShirt(Size clothesSize, int price, String colour) {
        super(clothesSize, price, colour);
    }

    @Override
    public void getDressedMen() {

    }

    @Override
    public void getDressedWomen() {

    }
}
