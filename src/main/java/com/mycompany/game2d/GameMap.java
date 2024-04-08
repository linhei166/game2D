package com.mycompany.game2d;

import javax.swing.*;

public class GameMap extends JFrame {

    public GameMap (GamePanel Gpanel) {
        super.add(Gpanel);
        super.setSize(800,500);
        super.setLocationRelativeTo(null);
        super.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        super.setVisible(true);
    }

}
