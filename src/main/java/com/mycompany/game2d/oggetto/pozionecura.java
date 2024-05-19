/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.game2d.oggetto;

import com.mycompany.game2d.personaggi.Entita;
import com.mycompany.game2d.personaggi.Eroe;

/**
 *
 * @author Esposito.Lorenzo
 */
public class pozionecura  extends Oggetto {
    public pozionecura(String nome, int quatita) {
        super(nome, quatita, "src/main/resources/imag/pozioni/pozionecura.png",30);
    }

    @Override
    public int Danno(Entita er, Oggetto og) {
        int qua=og.getQuatita();
        int hp=er.getHp();
        int missHp0=er.getHpMax()-10;
        if(missHp0<hp){
             er.setHp(er.getHpMax());
        }else{
             hp+=10;
             er.setHp(hp);
        }
        qua--;
        og.setQuatita(qua--);
        return 0;
    }

}
//hpm=hpm-dannno
//barra mostro.sethpm