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
    private BufferedImage IMG;
    private CadiceMap[][] codemap;
    private final String FileMap ="/personagi/personaggi_01.png";
    private int posizioneX,posizioneY;
    private int comand = -1;

    private  boolean onComand = false;

    public Eroe(String nome, int forza, int velocita, int arcana, int destrezza, int hp, int mana, Game2dForm game2dForm, Oggetto og) {
        super(nome, forza, velocita, arcana, destrezza, hp, mana,og);
        UpdetEr(Xposizione,Yposizione);
        IMG = LoadSeve.GetFileIMG(FileMap);
        invetario.add(new pozionecura("Cura10",10));
    }
    public Eroe(String nome, int forza, int velocita, int arcana, int destrezza, int hp, int mana,int lv, Game2dForm game2dForm, Oggetto og,ArrayList<Oggetto> Inv, int x, int y) {
        super(nome, forza, velocita, arcana, destrezza, hp, mana,lv,og);
        UpdetEr(x, y);
        IMG = LoadSeve.GetFileIMG(FileMap);
        this.invetario=Inv;

    }
    private void UpdetEr(int x,int y){
        hitbox = new Rectangle(x,y,grandeza,grandeza);
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


    private boolean toca() {
        int areaX = hitbox.x + hitbox.width;
        int areaY = hitbox.y + hitbox.height;
        if (!codemap[(hitbox.y + posizioneY) / 36][(hitbox.x + posizioneX) / 36].isNonPassa()) {
            return false;
        } else if (!codemap[(areaY + posizioneY) / 36][(hitbox.x + posizioneX) / 36].isNonPassa()) {
            return false;
        } else if (!codemap[(hitbox.y + posizioneY) / 36][(areaX + posizioneX) / 36].isNonPassa()) {
            return false;
        } else if (!codemap[(areaY + posizioneY) / 36][(areaX + posizioneX) / 36].isNonPassa()) {
            return false;
        }
        return true;
    }
    public void getIMGpley(Graphics g){
        movimeto();
        g.drawImage(IMG.getSubimage(0, 0, 16, 16),hitbox.x, hitbox.y, 36, 36, null);
    }
    public String toFile(){
        String file = nome + "\n" + forza + "\n" + velocita + "\n" + arcana + "\n" + destrezza + "\n" + hp + "\n" + mana + "\n" + lv;
        file = file + Mano.toFile();
        file=file + "\n" + hitbox.x + "\n" + hitbox.y;
        for (int i=0;i<invetario.size();i++){
            file=file+invetario.get(i).toFile();
        }
        return file;
    }
}
