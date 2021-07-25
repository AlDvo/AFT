package main.java.Task1;


public class Chocolate extends Candy_abstract{

    String  color_chocolate;

    Chocolate(String name ,String color_chocolate, double weight,double price,int id){
        this.name = name;
        this.color_chocolate = color_chocolate;
        this.price = price;
        this.weight = weight;
        this.id = id;
    }

    public String toString(){
        return "Название шоколада " + name + ", вес " + weight +", ценна за кг " + price + " , номер id "+ id;
    }

}
