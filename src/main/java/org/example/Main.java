package org.example;

import java.util.List;

public class Main {
        public static void main(String[] args) {
            System.out.println(Size.L.getDescription());
            System.out.println(Size.L.getEuroSize());
            System.out.println(Size.XXS.getDescription());

            Clothes[] allClothes = new Clothes[4];
            allClothes[0] = new TShirt(Size.XS, 1000, "blue");
            allClothes[1]= new Trousers(Size.M,500,"white");
            allClothes[2]=new Skirt(Size.L,1500,"black");
            allClothes[3]=new Tie(Size.XXS,200,"yellow");

            new Atelie().getDressedMen(allClothes);
            new Atelie().getDressedWomen(allClothes);



        }
    }
