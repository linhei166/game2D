/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.game2d.oggetto;

/**
 *
 * @author Esposito.Lorenzo
 */

public abstract class Oggetto {

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuatita() {
        return quatita;
    }

    public void setQuatita(int quatita) {
        this.quatita = quatita;
    }

    public Oggetto(String nome, int quatita, String texture) {
        this.nome = nome;
        this.quatita = quatita;
        this.texture = texture;
    }
    protected String nome;
    protected int quatita;
    protected final String texture;
    public String getTexture() {
        return texture;
    }
}
