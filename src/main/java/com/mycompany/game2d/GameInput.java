package com.mycompany.game2d;

import com.mycompany.game2d.GamePanel;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GameInput implements KeyListener {

    Eroe pley;

    public GameInput(Eroe pley){
        this.pley = pley;
    }

    @Override
    public void keyTyped(KeyEvent e) {//questo si fa effeto quando dopo di essere premuto e mandato la messagio al sistema

    }

    @Override
    public void keyPressed(KeyEvent e) {//questo si fa effeto quando e premuto il tasto
        switch (e.getKeyCode()){
            case KeyEvent.VK_W:
                pley.movimentoY(-5);
                break;
            case KeyEvent.VK_D:
                pley.movimentoX(+5);
                break;
            case KeyEvent.VK_S:
                pley.movimentoY(+5);
                break;
            case KeyEvent.VK_A:
                pley.movimentoX(-5);
                break;
            case KeyEvent.VK_ESCAPE:
                System.out.println("esc");
                break;
            case KeyEvent.VK_B:
                System.out.println("inventerio");
                break;
            case KeyEvent.VK_E:
                System.out.println("effetua la movimento");
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {//questo si fa effeto dopo lasciato il tasto

    }
}
