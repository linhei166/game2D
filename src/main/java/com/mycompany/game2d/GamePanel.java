package com.mycompany.game2d;


import com.mycompany.game2d.input.LoadSeve;

import javax.swing.*;
import java.awt.*;
import java.io.*;


public class GamePanel extends JPanel {

    private final int maxY = 648,maxX = 1260;
    private final int caselaY =18,caselaX = 35;
    private File file;
    private BufferedReader fileRead;
    private Game2dForm game;
    private CadiceMap[][] codeMap;
    public GamePanel(Game2dForm game){
        codeMap = new CadiceMap[caselaY][caselaX];
        file = new File("src/main/resources/MapCode/mapCode01.txt");
        try {
            fileRead = new BufferedReader(new FileReader(file));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        for (int i = 0 ; i < caselaY ; i++)
            for (int k = 0 ; k < caselaX ; k++) {
                codeMap[i][k] = new CadiceMap();
            }
        this.game = game;
        importImg();
        Dimesione();


    }

    private void Dimesione(){
        Dimension size = new Dimension(maxX,maxY);
        setMaximumSize(size);
        setMinimumSize(size);
        setPreferredSize(size);
    }

    private void importImg(){
        for (int i = 0 ; i < caselaY ; i++){
            String line;
            try {
                line =fileRead.readLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            for (int k = 0 ; k < caselaX ; k++) {

                codeMap[i][k].settipo(Integer.parseInt(String.valueOf(line.charAt(k))));
                codeMap[i][k].setPosizioneX(k*36);
                codeMap[i][k].setPosizioneY(i*36);
                switch (codeMap[i][k].gettipo()){

                    case 1:
                        codeMap[i][k].setImg(LoadSeve.GetFileIMG("/terreni/terra_01.png"));
                        break;
                    case 2:
                        codeMap[i][k].setImg(LoadSeve.GetFileIMG("/albero/albero_01.png"));
                        break;
                    case 3:
                        codeMap[i][k].setImg(LoadSeve.GetFileIMG("/mare/mare_01.png"));
                        break;
                    case 4:
                        codeMap[i][k].setImg(LoadSeve.GetFileIMG("/terreni/terra_06.png"));
                        break;
                    case 5:
                        codeMap[i][k].setImg(LoadSeve.GetFileIMG("/terreni/terra_05.png"));
                        break;
                    case 6:
                        codeMap[i][k].setImg(LoadSeve.GetFileIMG("/mare/mare_05.png"));
                        break;
                    case 7:
                        codeMap[i][k].setImg(LoadSeve.GetFileIMG("/mare/mare_08.png"));
                        break;
                    case 8:
                        codeMap[i][k].setImg(LoadSeve.GetFileIMG("/mare/mare_06.png"));
                        break;
                }
            }
            game.setCodeMap(codeMap);
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
        game.CotorloCombat();
    }

    }

