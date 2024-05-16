package com.mycompany.game2d.personaggi;

import com.mycompany.game2d.input.LoadSeve;
import com.mycompany.game2d.oggetto.Oggetto;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Nemico extends Entita{

    private BufferedImage IMG;
    public Nemico(String nome, int forza, int velocita, int arcana, int destrezza, int hp, int mana, Oggetto Mano) {
        super(nome, forza, velocita, arcana, destrezza, hp, mana, Mano);
        UpdetPosizione();
        IMG = LoadSeve.GetFileIMG("/personagi/personaggi_02.png");
    }

    private void UpdetPosizione(){
        hitbox = new Rectangle(900,60,grandeza,grandeza);
    }

    public void getregenerImg(Graphics g){
        g.drawImage(IMG, hitbox.x, hitbox.y,36,36, null);
    }

    public BufferedImage getIMG() {
        return IMG;
    }
}
