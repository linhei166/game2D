package com.mycompany.game2d.Combattimento;

import com.mycompany.game2d.input.CompatInput;
import com.mycompany.game2d.input.LoadSeve;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class PanelCompat extends JPanel {
    private CompatInput compatInput;
    private BufferedImage IMG;
    private JLabel comento;
    private final int posizioneC_x_1 = 50 , posizioneC_y_1 = 468 ,posizioneC_x_2 = 1200 ,posizioneC_y_2 = 588;
    private final int posizioneS_x_1 = 90 , posizioneS_y_1 = 430 ,posizioneM_x_1 = 300 ,posizioneM_y_1 = 430;

    public PanelCompat(){
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
        compatInput = new CompatInput();
        addMouseListener(compatInput);
        addMouseMotionListener(compatInput);
        IMG = LoadSeve.GetFileIMG("/personagi/personaggi_02.png");
    }
    @Override
    public void paint(Graphics g){
        super.paintComponent(g);
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

}
