/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.game2d;

import java.awt.image.BufferedImage;

/**
 *
 * @author Esposito.Lorenzo
 */
public class Spada extends Oggetto {

    
    private final String texture ="/albero/albero_04.png";
    

    public Spada(String nome, int quatita) {
        super(nome, quatita);
       
    }

    public String getTexture() {
        return texture;
    }
   
    
}
