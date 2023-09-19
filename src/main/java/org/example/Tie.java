package org.example;

public class Tie extends Clothes implements MenClothes {
    public Tie(Size clothesSize, int price, String colour) {
        super(clothesSize, price, colour);
    }

    @Override
    public void getDressedMen() {

    }
}
