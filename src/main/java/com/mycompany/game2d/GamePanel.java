package com.mycompany.game2d;


import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class GamePanel extends JPanel {

    private final int maxY = 648,maxX = 1260;
    private final int caselaY =18,caselaX = 35;
    private BufferedImage IMG;
    private Game2dForm game;
    private CadiceMap[][] codeMap;
    public GamePanel(Game2dForm game){
        codeMap = new CadiceMap[caselaY][caselaX];
        for (int i = 0 ; i < caselaY ; i++)
            for (int k = 0 ; k < caselaX ; k++) {
                codeMap[i][k] = new CadiceMap();
            }
        importImg();
        Dimesione();
        this.game = game;
    }

    private void Dimesione(){
        Dimension size = new Dimension(maxX,maxY);
        setMaximumSize(size);
        setMinimumSize(size);
        setPreferredSize(size);
    }

    private void importImg(){
        for (int i = 0 ; i < caselaY ; i++)
            for (int k = 0 ; k < caselaX ; k++) {
                codeMap[i][k].setImg(LoadSeve.GetFileIMG("/terreni/terra_01.png"));
                codeMap[i][k].settipo(1);
            }
    }

    @Override
    public void paint(Graphics g){
        super.paint(g);

        for (int i = 0 ; i <caselaY ; i++ )
            for (int k=0 ; k < caselaX ; k++) {
                g.drawImage(codeMap[i][k].getImg().getSubimage(0, 0, 16, 16), k * 36, i * 36, 36, 36, null);
            }
        game.gameRead(g);
    }

    }

