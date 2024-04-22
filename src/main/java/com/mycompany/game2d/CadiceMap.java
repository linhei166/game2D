package com.mycompany.game2d;

import java.awt.image.BufferedImage;

public class CadiceMap {
    private int tipo;
    private BufferedImage img;

    public CadiceMap(int tipo,BufferedImage img){
        this.tipo = tipo;
        this.img = img;

    }

    public BufferedImage getImg() {
        return img;
    }

    public void setImg(BufferedImage img) {
        this.img = img;
    }

    public int gettipo() {
        return tipo;
    }

    public void settipo(int tipo) {
        tipo = tipo;
    }
}
