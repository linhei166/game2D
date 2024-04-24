package com.mycompany.game2d;

public class Entita {

    public Entita(String nome, int forza, int velocita, int arcana, int destrezza, int hp, int mana, Oggetto Mano) {
        this.nome = nome;
        this.forza = forza;
        this.velocita = velocita;
        this.arcana = arcana;
        this.destrezza = destrezza;
        this.hp = hp;
        this.mana = mana;
        this.Mano = Mano;
    }
    protected String nome;
    protected int forza,velocita,arcana, destrezza, hp, mana;
    protected Oggetto Mano;
   
    public void printShet(){
        System.out.println("Des\n"+destrezza+"hp"+hp);
    }

    public Oggetto getMano() {
        return Mano;
    }
}
