package com.mycompany.game2d;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.Scanner;
public class Eroe extends Entita{

    Scanner in = new Scanner(System.in);
    private final int Yposizione = 50;
    private final int Xposizione = 50;
    private final int maxPanelY = 648,maxPanelX = 1260;
    private final int grandeza = 36;
    private BufferedImage IMG;
    private Rectangle hitbox;
    private CadiceMap[][] codemap;
    private final String FileMap ="/personagi/personaggi_01.png";

    public Eroe(String nome, int forza, int velocita, int arcana, int destrezza, int hp, int mana,Game2dForm game2dForm) {
        super(nome, forza, velocita, arcana, destrezza, hp, mana);
        hitbox = new Rectangle(Xposizione,Yposizione,grandeza,grandeza);
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
        if((valore+hitbox.y) > 0 &&(valore+hitbox.y+ hitbox.height) < maxPanelY&& toca(valore)) {
            hitbox.y += valore;
        }
    }
    public void movimentoX(int valore){

            if ((valore+hitbox.x) > 5 &&(valore+hitbox.x+ hitbox.width) < (maxPanelX-5) &&toca(valore)){
                hitbox.x += valore;
            }
    }

    public void setCodeMap(CadiceMap[][] codeMap){
        this.codemap = codeMap;
    }

    private boolean toca(int valore){
        int areaX = hitbox.x + hitbox.width;
        int areaY = hitbox.y + hitbox.height;
        if(!codemap[(hitbox.y+valore)/36][(hitbox.x+valore)/36].isNonPassa()){
            return false;
        }
        else if(!codemap[(areaY+valore)/36][(hitbox.x+valore)/36].isNonPassa()){
            return false;
        }
        else if(!codemap[(hitbox.y+valore)/36][(areaX+valore)/36].isNonPassa()){
            return false;
        }
        else if(!codemap[(areaY+valore)/36][(areaX+valore)/36].isNonPassa()){
            return false;
        }
        return true;
    }

    public void getIMGpley(Graphics g){
        g.drawImage(IMG.getSubimage(0, 0, 16, 16),hitbox.x, hitbox.y, 36, 36, null);
    }

}
