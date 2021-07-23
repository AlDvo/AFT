package main.java;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Candy_abstract> box = new ArrayList<>();
        Candy bird = new Candy("bird","кислая", 1.5,155.5, 5674949);
        Chocolate mars = new Chocolate("mars", "Белый",0.9,55, 56822126);
        Marmelad ytky = new Marmelad("ytky","круглая",2.3,75, 9432674);
        double boxWeight = bird.weight + mars.weight + ytky.weight;
        double boxPrice = bird.price + mars.price + ytky.price;

        box.add(bird);
        box.add(mars);
        box.add(ytky);

        System.out.println("Вес коробки равен " + boxWeight);
        System.out.println("Ценна коробки равна " + boxPrice);
        System.out.println(bird.toString());
        System.out.println(mars.toString());
        System.out.println(ytky.toString());


        /*System.out.print("Введите название продукта ");
        String name = reader.readLine();
        switch (name){
            case ("конфета"):
                System.out.print("Введите название продукта ");
                String namenam = reader.readLine();
                System.out.print("Введите название конфеты ");
                String candyName = reader.readLine();
                System.out.print("Введите тип конфеты ");
                String type = reader.readLine();
                System.out.print("Введите вес продукта ");
                double weight = Double.parseDouble(reader.readLine());
                System.out.print("Введите цену продукта ");
                double price = Double.parseDouble(reader.readLine());
                System.out.print("Введите id продукта ");
                int id = Integer.parseInt(reader.readLine());
                Candy  = new Candy(candyName , type , weight , price , id);
        }*/
    }
}
