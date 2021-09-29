package com.dz;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Plate plate = new Plate(1, 10, true);
        Dish pan = new Pan(20, 100);
        Cup cup = new Cup("cartoon", 300);
        Dish ladle = new Ladle(7, 40);
        Glass glass = new Glass(250);
        Fork fork = new Fork("dessert");
        Spoon spoon = new Spoon();
        ((Pan) pan).makeBorsh();
        cup.drink();
        ((Ladle) ladle).boilEggs();
        fork.eat();
        ArrayList<Dish> allDishes = new ArrayList<>();
        allDishes.add(plate);
        allDishes.add(pan);
        allDishes.add(cup);
        allDishes.add(ladle);
        allDishes.add(glass);
        allDishes.add(fork);
        allDishes.add(spoon);
        for (int i = 0; i < allDishes.size(); i++)
            System.out.println(allDishes.get(i));
    }
}
