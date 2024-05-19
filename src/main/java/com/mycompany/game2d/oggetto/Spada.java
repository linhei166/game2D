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
public class Spada extends Oggetto {
    private final int NDanno=40;
    public Spada(String nome, int quantita) {
        super(nome, quantita, "src/main/resources/imag/spada/spada_01.png",0);
    }

    @Override
    public int Danno(Entita er, Oggetto og) {
        return NDanno + er.getForza()/10;
    }
}
