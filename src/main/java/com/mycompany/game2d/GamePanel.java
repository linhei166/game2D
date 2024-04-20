package com.mycompany.game2d;


import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;


public class GamePanel extends JPanel {

    private final int maxY = 648,maxX = 1260;
    private final String FileMap ="/terreni/terra_01.png";
    private BufferedImage IMG;
    private Game2dForm game;

    public GamePanel(Game2dForm game){
        importImg(FileMap);
        Dimesione();
        this.game = game;
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

    @Override
    public void paint(Graphics g){
        super.paint(g);

        for (int i = 0 ; i <35 ; i++ )
            for (int k=0 ; k < 18 ; k++)
                g.drawImage(IMG.getSubimage(0, 0, 16, 16), i*36, k*36, 36, 36, null);

        game.gameRead(g);
    }

    }

