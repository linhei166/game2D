package com.mycompany.game2d;

public class Game {

    private GameFreme Gfreme;
    private GamePanel Gpanel;

    public Game(){

        Gpanel = new GamePanel();
        Gfreme = new GameFreme(Gpanel);
        Gpanel.addKeyListener(new GameInput(Gpanel));


    }

}
