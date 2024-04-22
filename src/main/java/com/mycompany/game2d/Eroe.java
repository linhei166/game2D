package com.mycompany.game2d;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.Scanner;
public class Eroe extends Entita{

    Scanner in = new Scanner(System.in);
    private int Yposizione = 50;
    private int Xposizione = 50;
    private final int maxPanelY = 648,maxPanelX = 1260;
    private final int grandeza = 36;
    private BufferedImage IMG;
    private final String FileMap ="/personagi/personaggi_01.png";

    public Eroe(String nome, int forza, int velocita, int arcana, int destrezza, int hp, int mana) {
        super(nome, forza, velocita, arcana, destrezza, hp, mana);
        IMG = LoadSeve.GetFileIMG(FileMap);
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
        int area = Yposizione + grandeza;
        int posizione = Yposizione;
        if((posizione+=valore) > 0 && (area+=valore) < maxPanelY) {
            this.Yposizione += valore;
        }
    }
    public void movimentoX(int valore){
        int area = Xposizione + grandeza;
        int posizione = Xposizione;
        if((posizione+=valore) > 0 && (area+=valore) < maxPanelX) {
            this.Xposizione += valore;
        }
    }

    public void getIMGpley(Graphics g){
        g.drawImage(IMG.getSubimage(0, 0, 16, 16),Xposizione, Yposizione, 36, 36, null);
    }

}
