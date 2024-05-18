/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.game2d.oggetto;

import com.mycompany.game2d.personaggi.Eroe;

/**
 *
 * @author Esposito.Lorenzo
 */
public class Bachetta extends Oggetto {

    private final int NDanno=50;

    public Bachetta(String nome, int quatita) {
        super(nome, quatita, "src/main/resources/imag/bachetta/bachetta_01.png",20);
    }

    @Override
    public int Danno(Eroe er,Oggetto og) {
        int mana=er.getMana();
        mana-=6;
        er.setMana(mana);
        return NDanno + er.getArcana()/10;
    }
}
