package com.mycompany.game2d;

import javax.swing.*;
import javax.swing.event.MouseInputAdapter;
import java.awt.*;

public class GamePanel extends JPanel {

    private  int Xposizione = 5,Yposizione = 5;


    public GamePanel(){

    }

    public void movimentoY(int valore){
        int y = Yposizione;
        if (y+valore >=5 && y+valore <= 405) {
            this.Yposizione += valore;
        }
    }
    public void movimentoX(int valore){
        int x = Xposizione;
        if (x+valore >=5 && x+valore <= 725) {
            this.Xposizione += valore;

        }
    }

    @Override
    public void paint(Graphics g){
        super.paint(g);

        g.fillOval( Xposizione,Yposizione,50,50);
        repaint();
    }

}
