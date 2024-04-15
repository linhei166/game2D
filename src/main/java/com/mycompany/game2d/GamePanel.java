package com.mycompany.game2d;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;

public class GamePanel extends JPanel {

    private  int Xposizione = 5,Yposizione = 5;
    private final int maxY = 792,maxX = 1260;
    private final String FileMap ="materiali_map.jpg";
    private BufferedImage IMG;
    private Eroe pley;

    public GamePanel(){
        pley= null;
        importImg(FileMap);
        Dimesione();
    }

    public void addEroe(Eroe pley){
        this.pley = pley;
    }

    private void importImg() {
        InputStream is = getClass().getResourceAsStream("/images/png.png");
        try {
            IMG = ImageIO.read(is);
        } catch (IOException e) {
            e.printStackTrace();
        }
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


    public void paint(){
        Graphics g = this.getGraphics();

        for (int i = 0 ; i <35 ; i++ ) {
            g.drawImage(IMG.getSubimage(34, 0, 34, 34), i*36, 0, 36, 36, null);
        }
        g.drawImage(IMG.getSubimage(34, 0, 34, 34),Xposizione, Yposizione, 36, 36, null);
        repaint();
    }

    }

