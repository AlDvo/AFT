package main.java;


import java.util.ArrayList;
import java.util.Iterator;

public class main {
    public static void main(String[] args){
        ArrayList<Candy_abstract> box = new ArrayList<>();
        Candy bird = new Candy("bird","кислая", 1.5,155.5, 5674949);
        Chocolate mars = new Chocolate("mars", "Белый",0.9,55, 56822126);
        Marmelad ytky = new Marmelad("ytky","круглая",2.3,75, 9432674);
        double boxWeight = bird.weight + mars.weight + ytky.weight;
        double boxPrice = bird.price + mars.price + ytky.price;

        box.add(bird);
        box.add(mars);
        box.add(ytky);

        double boxWeight1 = 0;
        double boxPrice1 = 0;

        Iterator <Candy_abstract> iterator = box.iterator();

        while (iterator.hasNext())
        {
            Candy_abstract element = iterator.next();
            boxWeight1 = boxWeight1 + element.weight;
            boxPrice1 = boxPrice1 + element.price;
        }

        System.out.println("Вес коробки равен ещё " + boxWeight1);
        System.out.println("Ценна коробки равна ещё " + boxPrice1);

        System.out.println("Вес коробки равен " + boxWeight);
        System.out.println("Ценна коробки равна " + boxPrice);
        System.out.println(bird.toString());
        System.out.println(mars.toString());
        System.out.println(ytky.toString());

    }
}
