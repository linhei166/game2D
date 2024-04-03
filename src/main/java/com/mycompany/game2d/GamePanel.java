package com.mycompany.game2d;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {

    private  int Xposizione = 0,Yposizione = 0;

    public GamePanel(){
        addKeyListener(new GameInput(this));
    }

    public void movimentoX(int valole){
        this.Xposizione += valole;
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
