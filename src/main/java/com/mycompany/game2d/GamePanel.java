package com.mycompany.game2d;

import javax.swing.*;
import javax.swing.event.MouseInputAdapter;
import java.awt.*;

public class GamePanel extends JPanel {

    private  int Xposizione = 5,Yposizione = 5;


    public GamePanel(){
        addKeyListener(new GameInput(this));
    }

    }
    public void movimentoY(int valole){
        this.Yposizione += valole;
    }

    @Override
    public void paint(Graphics g){
        super.paint(g);

        g.fillOval(50 + Xposizione,50 + Yposizione,50,50);

    }

}
