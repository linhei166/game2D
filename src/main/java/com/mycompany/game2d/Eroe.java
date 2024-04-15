package com.mycompany.game2d;

import java.util.Scanner;
public class Eroe extends Entita{

    Scanner in = new Scanner(System.in);
    private int Yposizione;
    private int Xposizione;

    public Eroe(String nome, int forza, int velocita, int arcana, int destrezza, int hp, int mana) {
        super(nome, forza, velocita, arcana, destrezza, hp, mana);
    }



    public void levelup(){
        for(int a=5;a>0;a--){
        int car = in.nextInt();
        switch (car){
            case 1:
                this.destrezza++;
                break;
            case 2:
                this.velocita++;
                break;
            case 3:
                this.arcana++;
                break;
            case 4:
                this.hp++;
                break;
            case 5:
                this.mana++;
                break;
            case 6:
                this.forza++;
                break;
        }
        }
        System.out.println("Out of for");
    }

    public void movimentoY(int valore ){
        int y = Yposizione;
        this.Yposizione += valore;

    }
    public void movimentoX(int valore){
        int x = Xposizione;
        this.Xposizione += valore;
    }

}
