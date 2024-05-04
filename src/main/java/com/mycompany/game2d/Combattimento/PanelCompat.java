package com.mycompany.game2d.Combattimento;

import com.mycompany.game2d.input.CompatInput;

import javax.swing.*;
import java.awt.*;

public class PanelCompat extends JPanel {
    private CompatInput compatInput;
    public PanelCompat(){
        Dimesione();
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

    }
    @Override
    public void paint(Graphics g){
        super.paintComponent(g);
        g.clearRect(50,468,1160,108);
        g.setColor(Color.black);
        g.fillRect(60,478,1140,88);
    }

}
