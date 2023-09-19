package org.example;

public class Atelie {


    public void getDressedMen(Clothes[] allClothes){
        for (Clothes clothes: allClothes) {
            System.out.println(clothes.ClothesSize);
            System.out.println(clothes.price);
            System.out.println(clothes.colour);
        }
    }
    public void getDressedWomen(Clothes[] allClothes){
        for (Clothes clothes: allClothes) {
            System.out.println(clothes.ClothesSize);
            System.out.println(clothes.price);
            System.out.println(clothes.colour);
        }
    }
}
