package com.mycompany.game2d;

public class Entita {
    protected String nome;
    protected int forza,velocita,arcana, destrezza, hp, mana;

    public Entita(String nome, int forza, int velocita, int arcana, int destrezza, int hp, int mana) {
        this.nome = nome;
        this.forza = forza;
        this.velocita = velocita;
        this.arcana = arcana;
        this.destrezza = destrezza;
        this.hp = hp;
        this.mana = mana;
    }
    public void printShet(){
        System.out.println("Des\n"+destrezza+"hp"+hp);
    }
}
