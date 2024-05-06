package com.mycompany.game2d;

import java.awt.image.BufferedImage;

public class CadiceMap {
    private int tipo;
    private boolean nonPassa = true;
    private BufferedImage img;
    private int posizioneX ,posizioneY;
    private final int grandeza=36;

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getPosizioneY() {
        return posizioneY;
    }

    public void setPosizioneY(int posizioneY) {
        this.posizioneY = posizioneY;
    }

    public int getPosizioneX() {
        return posizioneX;
    }

    public void setPosizioneX(int posizioneX) {
        this.posizioneX = posizioneX;
    }

    public int getGrandeza() {
        return grandeza;
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
        if (tipo == 6  || tipo == 8 || tipo == 2 || tipo == 7)
            nonPassa = false;

        this.tipo = tipo;
    }
    public boolean isNonPassa() {
        return nonPassa;
    }
}
