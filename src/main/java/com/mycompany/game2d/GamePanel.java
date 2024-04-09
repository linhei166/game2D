package com.mycompany.game2d;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.event.MouseInputAdapter;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;

public class GamePanel extends JPanel {

    private  int Xposizione = 5,Yposizione = 5;
    private int maxY,maxX;
    private LoadSeve loadSeve;
    private BufferedImage IMG;

    public GamePanel(){

    importImg();

    }

    private void importImg(){
        InputStream is = getClass().getResourceAsStream("/images/png.png");
        try {
            IMG = ImageIO.read(is);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public void movimentoY(int valore){
        int y = Yposizione;
        if (y+valore >=5 && y+valore <= super.getHeight())
            this.Yposizione += valore;

    }
    public void movimentoX(int valore){
        int x = Xposizione;
        if (x+valore >=5 && x+valore <= super.getWidth())
            this.Xposizione += valore;
    }

    @Override
    public void paint(Graphics g){
        super.paintComponent(g);
        g.drawImage(IMG,0,0,null);
        repaint();
    }

}
