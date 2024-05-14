package com.mycompany.game2d.Combattimento;

import com.mycompany.game2d.FrameMappa;
import com.mycompany.game2d.input.CompatInput;
import com.mycompany.game2d.input.LoadSeve;
import com.mycompany.game2d.personaggi.Eroe;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class PanelCompat extends JPanel {
    private BufferedImage IMGBotton;
    private BufferedImage IMG;
    private JLabel comento;
    private final int posizioneC_x_1 = 50 , posizioneC_y_1 = 468 ,posizioneC_x_2 = 1200 ,posizioneC_y_2 = 588;
    private final int posizioneS_x_1 = 90 , posizioneS_y_1 = 430 ,posizioneM_x_1 = 300 ,posizioneM_y_1 = 430;
    private int scelt = 0;
    private Eroe er;
    private FrameMappa mappa;

    public PanelCompat(Eroe er , FrameMappa mappa){
        this.er = er;
        this.mappa = mappa;
        Dimesione();
        comento = new JLabel("prova");
        comento.setForeground(Color.white);
        comento.setVisible(true);
    }

    private void Dimesione(){
        Dimension size = new Dimension(1260,720);
        setMaximumSize(size);
        setMinimumSize(size);
        setPreferredSize(size);
        setBackground(Color.black);
        IMG = LoadSeve.GetFileIMG("/personagi/personaggi_02.png");

    }
    public void comand(int i){
        if (scelt + i >=0 && scelt+ i <=2)
            scelt = scelt + i;
    }

    private void Updet(Graphics g){
        Updetarea(g);
        Updetbotton(g);
    }

    private void Updetarea(Graphics g){
        g.clearRect(posizioneC_x_1,posizioneC_y_1,1150,5);
        g.clearRect(posizioneC_x_1,posizioneC_y_1,5,125);
        g.clearRect(posizioneC_x_1,posizioneC_y_2,1150,5);
        g.clearRect(posizioneC_x_2,posizioneC_y_1,5,125);
        g.drawImage(IMG.getSubimage(0,0,16,16),getWidth()/2-(100/2),100,100,100,null);
        g.setColor(new Color(128,0,0));
        g.fillRect(posizioneS_x_1-5,posizioneS_y_1-5,210,5);
        g.fillRect(posizioneS_x_1-5,posizioneS_y_1-5,5,30);
        g.fillRect(posizioneS_x_1+200,posizioneS_y_1-5,5,30);
        g.fillRect(posizioneS_x_1-5,posizioneS_y_1+25,210,5);
        g.setColor(Color.red);
        g.fillRect(90,430,200,25);
        g.setColor(new Color(128,0,0));
        g.fillRect(posizioneM_x_1-5,posizioneM_y_1-5,210,5);
        g.fillRect(posizioneM_x_1-5,posizioneM_y_1-5,5,30);
        g.fillRect(posizioneM_x_1+200,posizioneM_y_1-5,5,30);
        g.fillRect(posizioneM_x_1-5,posizioneM_y_1+25,210,5);
        g.setColor(Color.blue);
        g.fillRect(posizioneM_x_1,posizioneM_y_1,200,25);
    }

    private void Updetbotton(Graphics g){
        if (scelt == 0) {
            IMGBotton = LoadSeve.GetFileCombat("/atacco_Ativ.png");
            g.drawImage(IMGBotton, 200, 620, 150, 75, null);
        }
        else {
            IMGBotton = LoadSeve.GetFileCombat("/atacco_nonAtiv.png");
            g.drawImage(IMGBotton, 200, 620, 150, 75, null);
        }

        if (scelt == 1) {
            IMGBotton = LoadSeve.GetFileCombat("/inventario_Ativ.png");
            g.drawImage(IMGBotton, 950, 620, 150, 75, null);
        }
        else {
            IMGBotton = LoadSeve.GetFileCombat("/inventario_nonAtiv.png");
            g.drawImage(IMGBotton, 950, 620, 150, 75, null);
        }
        if (scelt == 2) {
            IMGBotton = LoadSeve.GetFileCombat("/scapa_Ativ.png");
            g.drawImage(IMGBotton, 555, 620, 150, 75, null);
        }
        else {
            IMGBotton = LoadSeve.GetFileCombat("/scapa_nonAtiv.png");
            g.drawImage(IMGBotton, 555, 620, 150, 75, null);
        }
    }

    private void evantAtac(){

    }
    private void eventIvent(){
        mappa.getInventario().setVisible(true);
    }
    private void eventScap(){

    }

    public void comandaccet(){
        if (scelt == 0) {

        }
        if (scelt == 1){
            eventIvent();
        }
        if (scelt == 2){

        }
    }

    @Override
    public void paint(Graphics g){
        super.paintComponent(g);
        Updet(g);

    }

}
