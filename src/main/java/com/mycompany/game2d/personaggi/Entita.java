package com.mycompany.game2d.personaggi;

import com.mycompany.game2d.oggetto.Oggetto;

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
        this.lv=0;
        modificHPMAX();
        modificManaMax();
    }
    public Entita(String nome, int forza, int velocita, int arcana, int destrezza, int hp, int mana,int lv, Oggetto Mano) {
        this.nome = nome;
        this.forza = forza;
        this.velocita = velocita;
        this.arcana = arcana;
        this.destrezza = destrezza;
        this.hp = hp;
        this.mana = mana;
        this.Mano = Mano;
        this.lv=lv;
        modificHPMAX();
        modificManaMax();
    }
    public void levelUp(int forza, int velocita, int arcana, int destrezza, int hp, int mana){
        this.forza = forza;
        this.velocita = velocita;
        this.arcana = arcana;
        this.destrezza = destrezza;
        this.hp = hp;
        this.mana = mana;
        modificHPMAX();
        modificManaMax();
        lv++;

    }



    protected String nome;
    protected int forza,velocita,arcana, destrezza, hp, mana ,hpMax,manaMax;
    protected int lv;
    protected Oggetto Mano;
    private void modificHPMAX(){
        hpMax = hp;
    }
    private void modificManaMax(){manaMax = mana;}

    public int getHpMax() {
        return hpMax;
    }

    public int getManaMax() {
        return manaMax;
    }

    public void printShet(){
        System.out.println("Des\n"+destrezza+"hp"+hp);
    }

    public void setMano(Oggetto mano) {
        Mano = mano;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getForza() {
        return forza;
    }

    public void setForza(int forza) {
        this.forza = forza;
    }

    public int getVelocita() {
        return velocita;
    }

    public void setVelocita(int velocita) {
        this.velocita = velocita;
    }

    public int getArcana() {
        return arcana;
    }

    public void setArcana(int arcana) {
        this.arcana = arcana;
    }

    public int getDestrezza() {
        return destrezza;
    }

    public void setDestrezza(int destrezza) {
        this.destrezza = destrezza;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public Oggetto getMano() {
        return Mano;
    }
    public int Danno(int danno){
        hp=hp-danno;
        if(hp>0){
            return 0;
        }
        return hp;
    }
    public int getLv() {
        return lv;
    }

    public void setLv(int lv) {
        this.lv = lv;
    }
}
