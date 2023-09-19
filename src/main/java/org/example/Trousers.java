package org.example;

public class Trousers extends Clothes implements MenClothes, WomenClothes{
    public Trousers(Size clothesSize, int price, String colour) {
        super(clothesSize, price, colour);
    }

    @Override
    public void getDressedMen() {

    }

    @Override
    public void getDressedWomen() {

    }
}
