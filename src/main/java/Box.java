package main.java;

public class Box {
    Candy сandy;
    Chocolate chocolate;
    Marmelad marmelad;


    Box(Candy сandy, Chocolate chocolate,Marmelad marmelad){
        this.сandy = сandy;
        this.chocolate = chocolate;
        this.marmelad =  marmelad;
    }
    Box( Chocolate chocolate,Marmelad marmelad){
        this.chocolate = chocolate;
        this.marmelad =  marmelad;
    }
    Box(Candy сandy, Chocolate chocolate){
        this.сandy = сandy;
        this.chocolate = chocolate;
    }
    Box(Candy сandy,Marmelad marmelad){
        this.сandy = сandy;
        this.marmelad =  marmelad;
    }
    Box(Candy сandy){
        this.сandy = сandy;
    }
    Box(Marmelad marmelad){
        this.marmelad =  marmelad;
    }
    Box(Chocolate chocolate) {
        this.chocolate = chocolate;
    }
}
