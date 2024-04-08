package com.mycompany.game2d;
public class Game2D {

    public static void main(String[] args) {
        new Game();
        Eroe er = new Eroe("Gianni",3,3,3,3,3,3);
        er.levelup();
        er.printShet();
    }
}
