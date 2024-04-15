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
                System.out.println("peromuto");
                break;
            case KeyEvent.VK_D:
                pley.movimentoX(+5);
                System.out.println("peromuto");
                break;
            case KeyEvent.VK_S:
                pley.movimentoY(+5);
                System.out.println("peromuto");
                break;
            case KeyEvent.VK_A:
                pley.movimentoX(-5);
                System.out.println("peromuto");
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {//questo si fa effeto dopo lasciato il tasto

    }
}
