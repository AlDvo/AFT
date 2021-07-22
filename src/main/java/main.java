package main.java;


public class main {
    public static void main(String[] args){
        Candy bird = new Candy("bird",35, 45,3253463);
        Chocolate mars = new Chocolate("mars", 3.1,35,42624);
        Marmelad ytky = new Marmelad("ytky",2.7,45,1325436);
        Box box = new Box(bird , mars , ytky);
        double boxWeight = bird.weight + mars.weight + ytky.weight;
        double boxPrice = bird.price + mars.price + ytky.price;

        System.out.println("Вес коробки равен " + boxWeight);
        System.out.println("Ценна коробки равна " + boxPrice);
        System.out.println(bird.toString());
        System.out.println(mars.toString());
        System.out.println(ytky.toString());


    }
}
