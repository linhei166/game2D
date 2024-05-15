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
public class Arco extends Oggetto {

    private final int NDanno=40;

    public Arco(String nome, int quatita) {
        super(nome, quatita, "src/main/resources/imag/arco/arco_01.png",10);
    }

    @Override
    public int Danno(Eroe er) {
        return NDanno + er.getDestrezza()/10;
    }
}
