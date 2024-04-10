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

    private void Dimesione(){
        Dimension size = new Dimension(maxX,maxY);
        setMaximumSize(size);
        setMinimumSize(size);
        setPreferredSize(size);
    }

    private void importImg(String nomeFile){
        IMG = LoadSeve.GetFileIMG(nomeFile);
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
        for (int i = 0 ; i <35 ; i++ ) {
            g.drawImage(IMG.getSubimage(34, 0, 34, 34), i*36, 0, 36, 36, null);
        }
        g.drawImage(IMG.getSubimage(34, 0, 34, 34),Xposizione, Yposizione, 36, 36, null);
        repaint();
    }

}
