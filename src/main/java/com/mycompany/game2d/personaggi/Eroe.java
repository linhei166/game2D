package com.mycompany.game2d.personaggi;

import com.mycompany.game2d.CadiceMap;
import com.mycompany.game2d.Game2dForm;
import com.mycompany.game2d.input.LoadSeve;
import com.mycompany.game2d.oggetto.Oggetto;
import com.mycompany.game2d.oggetto.pozionecura;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Scanner;
public class Eroe extends Entita {

    public ArrayList<Oggetto> getInvetario() {
        return invetario;
    }

    Scanner in = new Scanner(System.in);
    ArrayList<Oggetto> invetario=new ArrayList<Oggetto>();
    private final int Yposizione = 50;
    private final int Xposizione = 50;
    private final int maxPanelY = 648,maxPanelX = 1260;
    private final int grandeza = 36;
    private BufferedImage IMG;
    private Rectangle hitbox;
    private CadiceMap[][] codemap;
    private final String FileMap ="/personagi/personaggi_01.png";
    private int posizioneX,posizioneY;
    private int comand = -1;
    private  boolean onComand = false;

    public Eroe(String nome, int forza, int velocita, int arcana, int destrezza, int hp, int mana, Game2dForm game2dForm, Oggetto og) {
        super(nome, forza, velocita, arcana, destrezza, hp, mana,og);
        hitbox = new Rectangle(Xposizione,Yposizione,grandeza,grandeza);
        IMG = LoadSeve.GetFileIMG(FileMap);
        invetario.add(new pozionecura("Cura10",10));
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
        posizioneY = valore;
        if((valore+hitbox.y) > 0 &&(valore+hitbox.y+ hitbox.height) < maxPanelY&& toca()) {
            hitbox.y += valore;
        }
        posizioneY = 0;
    }
    public void movimentoX(int valore){
            posizioneX = valore;
            if ((valore+hitbox.x) > 5 &&(valore+hitbox.x+ hitbox.width) < (maxPanelX-5) &&toca()){
                hitbox.x += valore;
            }
            posizioneX = 0;
    }

    public void setCodeMap(CadiceMap[][] codeMap){
        this.codemap = codeMap;
    }
    public void setComand(int comand){
        this.comand = comand;
        onComand = true;
    }

    public void setOffComand(boolean offComand){
        onComand = offComand;
    }

    private void movimeto(){

        if (onComand)
            switch (comand){
                case 0:
                    movimentoY(-5);
                    break;
                case 1:
                    movimentoX(+5);
                    break;
                case 2:
                    movimentoY(+5);
                    break;
                case 3:
                    movimentoX(-5);
                    break;
            }

    }


    private boolean toca(){
        int areaX = hitbox.x + hitbox.width;
        int areaY = hitbox.y + hitbox.height;
        if(!codemap[(hitbox.y+posizioneY)/36][(hitbox.x+posizioneX)/36].isNonPassa()){
            return false;
        }
        else if(!codemap[(areaY+posizioneY)/36][(hitbox.x+posizioneX)/36].isNonPassa()){
            return false;
        }
        else if(!codemap[(hitbox.y+posizioneY)/36][(areaX+posizioneX)/36].isNonPassa()){
            return false;
        }
        else if(!codemap[(areaY+posizioneY)/36][(areaX+posizioneX)/36].isNonPassa()){
            return false;
        }
        return true;
    }



    public void getIMGpley(Graphics g){
        movimeto();
        g.drawImage(IMG.getSubimage(0, 0, 16, 16),hitbox.x, hitbox.y, 36, 36, null);
    }

}
