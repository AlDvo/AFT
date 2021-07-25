package main.java.Task1;



public class Candy extends Candy_abstract {

    String type_candy;

    Candy(String name,String type_candy, double weight, double price, int id) {
        this.name = name;
        this.type_candy = type_candy;
        this.price = price;
        this.weight = weight;
        this.id = id;
    }

    public String toString() {
        return "Название конфеты " + name + ", вес " + weight + ", ценна за кг " + price + " , номер id " + id;
    }
}
