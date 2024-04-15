package com.mycompany.game2d;

import javax.swing.*;

public class GameMap extends JFrame {


    public GameMap (GamePanel Gpanel) {
        super.add(Gpanel);
        super.pack();
        super.setLocationRelativeTo(null);
        super.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }


    
}
