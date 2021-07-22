package main.java;

public class Candy extends Candy_abstract {
    String name;
    double weight;
    double price;
    int id;

    Candy(String name, double weight, double price, int id) {
        this.name = name;
        this.price = price;
        this.weight = weight;
        this.id = id;
    }

    public String toString() {
        return "Название конфеты " + name + ", вес " + weight + ", ценна за кг " + price + " , номер id " + id;
    }
}
