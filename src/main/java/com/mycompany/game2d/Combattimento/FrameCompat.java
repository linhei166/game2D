package com.mycompany.game2d.Combattimento;

import com.mycompany.game2d.Game2dForm;

import javax.swing.*;
import java.awt.*;

public class FrameCompat extends JFrame {
    private PanelCompat panelCompat;
    public FrameCompat(PanelCompat panelCompat){
        this.panelCompat = panelCompat;
        super.add(panelCompat);
        super.pack();
        super.setDefaultCloseOperation(EXIT_ON_CLOSE);
        super.setVisible(true);
    }
}
