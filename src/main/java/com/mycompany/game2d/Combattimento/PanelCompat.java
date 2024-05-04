package com.mycompany.game2d.Combattimento;

import javax.swing.*;
import java.awt.*;

public class PanelCompat extends JPanel {
    public PanelCompat(){
        Dimesione();
    }
    private void Dimesione(){
        Dimension size = new Dimension(1260,720);
        setMaximumSize(size);
        setMinimumSize(size);
        setPreferredSize(size);
        setBackground(Color.black);
    }
    @Override
    public void paint(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.white);
        g.fillRect(50,468,1160,108);
        g.setColor(Color.black);
        g.fillRect(60,478,1140,88);
    }

}
