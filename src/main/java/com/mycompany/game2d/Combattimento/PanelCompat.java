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
        g.clearRect(50,468,1150,5);
        g.clearRect(50,468,5,125);
        g.clearRect(50,588,1150,5);
        g.clearRect(1200,468,5,125);
        g.drawImage(IMG.getSubimage(0,0,16,16),1260/2-(100/2),100,100,100,null);
        g.setColor(new Color(128,0,0));
        g.fillRect(85,425,210,5);
        g.fillRect(85,425,5,30);
        g.fillRect(290,425,5,30);
        g.fillRect(85,455,210,5);
        g.setColor(Color.red);
        g.fillRect(90,430,200,25);
        g.setColor(new Color(128,0,0));
        g.fillRect(295,425,210,5);
        g.fillRect(295,425,5,30);
        g.fillRect(500,425,5,30);
        g.fillRect(295,455,210,5);
        g.setColor(Color.blue);
        g.fillRect(300,430,200,25);

    }

}
