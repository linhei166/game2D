package com.mycompany.game2d.input;

import com.mycompany.game2d.Combattimento.PanelCompat;

import java.awt.*;
import java.awt.event.*;

public class CompatInput implements KeyListener {

    PanelCompat compat;

    public CompatInput(PanelCompat compat){
        this.compat = compat;
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

        switch (e.getKeyCode()){
            case KeyEvent.VK_A -> compat.comand(-1);
            case KeyEvent.VK_D -> compat.comand(+1);
            case KeyEvent.VK_ENTER -> compat.comandaccet();

        }

    }
}
