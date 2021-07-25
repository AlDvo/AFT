package main.java.Task1;

public class Marmelad extends Candy_abstract {

    String shape;

    Marmelad(String name ,String shape, double weight,double price, int id){
        this.name = name;
        this.shape = shape;
        this.price = price;
        this.weight = weight;
        this.id = id;
    }

    public String toString(){
        return "Название мармедала " + name + ", вес " + weight +", ценна за кг " + price + " , номер id "+ id;
    }


}
