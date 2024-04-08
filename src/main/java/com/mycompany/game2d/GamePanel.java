package com.mycompany.game2d;

import javax.swing.*;
import javax.swing.event.MouseInputAdapter;
import java.awt.*;

public class GamePanel extends JPanel {

    private  int Xposizione = 5,Yposizione = 5;
    private int maxY,maxX;


    public GamePanel(){



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
        super.paint(g);
        g.setColor(Color.red);
        g.fillOval( Xposizione,Yposizione,50,50);

        repaint();
    }

}
