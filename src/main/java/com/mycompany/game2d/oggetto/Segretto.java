/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.game2d.oggetto;

import com.mycompany.game2d.oggetto.Oggetto;
import com.mycompany.game2d.personaggi.Eroe;

/**
 *
 * @author Esposito.Lorenzo
 */
public class Segretto extends Oggetto {
    public Segretto(String nome, int quatita) {
        super(nome, quatita, "src/main/resources/imag/segreto/segreto_01.png",40);
    }

    @Override
    public int Danno(Eroe er,Oggetto og) {
        return 100;
    }
}
