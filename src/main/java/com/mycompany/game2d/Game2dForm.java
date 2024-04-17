package com.mycompany.game2d;

import javax.swing.*;
import java.awt.*;
import java.lang.Thread;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Esposito.Lorenzo
 */
public class Game2dForm extends JFrame implements Runnable{
    private int Creation=20;
    private GameMap Gmap;
    private GamePanel Gpanel;
    protected Eroe er;
    private Thread gameThread;
    private final int gameTime = 120;
    /**
     * Creates new form Game2dForm
     */
    public Game2dForm() {
        initComponents();
        FrameCreazione.setSize(400, 500);
        er = new Eroe(null,0,0,0,0,0,0);
        FrameCreazione.getContentPane().setBackground(Color.BLACK);
        super.getContentPane().setBackground(Color.BLACK);
        super.setSize(400,300);
        FrameOpzione.setSize(300,200);
        FrameOpzione.getContentPane().setBackground(Color.BLACK);
        Gpanel = new GamePanel(this);
        Gmap = new GameMap(Gpanel);
        gamestart();

    }
    private void gamestart(){
        gameThread = new Thread(this);
        gameThread.start();
    }

    public void gameRead(Graphics g){
        er.getIMGpley(g);
    }

    @Override
    public void run() {
        double timeFreme = 1000000000.0/gameTime;
        long lastTime = System.nanoTime();
        long now = System.nanoTime();
        while (true){
            now = System.nanoTime();
            if(now - lastTime >= timeFreme){
                Gpanel.repaint();
                lastTime = now;
            }

        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FrameCreazione = new javax.swing.JFrame();
        LabelNome = new javax.swing.JLabel();
        TextFieldNome = new javax.swing.JTextField();
        LabelVelocita = new javax.swing.JLabel();
        ButtonConfremaCrea = new javax.swing.JButton();
        ButtonMenVel = new javax.swing.JButton();
        LabelValVel = new javax.swing.JLabel();
        ButtonpiuVel = new javax.swing.JButton();
        LabelCreazione = new javax.swing.JLabel();
        LabelForza = new javax.swing.JLabel();
        ButtonMenFor = new javax.swing.JButton();
        LabelValFor = new javax.swing.JLabel();
        ButtonpiuFor = new javax.swing.JButton();
        LabelValArc = new javax.swing.JLabel();
        ButtonpiuArc = new javax.swing.JButton();
        ButtonMenArc = new javax.swing.JButton();
        LabelArcana = new javax.swing.JLabel();
        LabelValDes = new javax.swing.JLabel();
        ButtonMenDes = new javax.swing.JButton();
        LabelDestrzza = new javax.swing.JLabel();
        ButtonpiuDes = new javax.swing.JButton();
        ButtonpiuHP = new javax.swing.JButton();
        LabelValHP = new javax.swing.JLabel();
        ButtonMenHP = new javax.swing.JButton();
        LabelHP = new javax.swing.JLabel();
        LabelValMana = new javax.swing.JLabel();
        ButtonpiuMana = new javax.swing.JButton();
        LabelMana = new javax.swing.JLabel();
        ButtonMenMana = new javax.swing.JButton();
        FrameOpzione = new javax.swing.JFrame();
        LabelLingua = new javax.swing.JLabel();
        ComboLingue = new javax.swing.JComboBox<>();
        ButtonSelezionaLIngua = new javax.swing.JButton();
        LabelTitoloOpzione = new javax.swing.JLabel();
        ButtonNuovaPartita = new javax.swing.JButton();
        ButtonContinuaPartita = new javax.swing.JButton();
        ButtonOpzione = new javax.swing.JButton();
        LabelTitolo = new javax.swing.JLabel();

        FrameCreazione.setBackground(new java.awt.Color(0, 0, 0));
        FrameCreazione.setPreferredSize(new java.awt.Dimension(400, 500));

        LabelNome.setForeground(new java.awt.Color(232, 232, 232));
        LabelNome.setText("Nome:");

        TextFieldNome.setBackground(new java.awt.Color(0, 0, 0));
        TextFieldNome.setForeground(new java.awt.Color(232, 232, 232));
        TextFieldNome.setText(" ");

        LabelVelocita.setForeground(new java.awt.Color(232, 232, 232));
        LabelVelocita.setText("Velocita");

        ButtonConfremaCrea.setBackground(new java.awt.Color(84, 84, 84));
        ButtonConfremaCrea.setForeground(new java.awt.Color(232, 232, 232));
        ButtonConfremaCrea.setText("Conferma");
        ButtonConfremaCrea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonConfremaCreaActionPerformed(evt);
            }
        });

        ButtonMenVel.setBackground(new java.awt.Color(84, 84, 84));
        ButtonMenVel.setForeground(new java.awt.Color(232, 232, 232));
        ButtonMenVel.setText("-");
        ButtonMenVel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonMenVelActionPerformed(evt);
            }
        });

        LabelValVel.setForeground(new java.awt.Color(232, 232, 232));
        LabelValVel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelValVel.setText("5");

        ButtonpiuVel.setBackground(new java.awt.Color(84, 84, 84));
        ButtonpiuVel.setForeground(new java.awt.Color(232, 232, 232));
        ButtonpiuVel.setText("+");
        ButtonpiuVel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonpiuVelActionPerformed(evt);
            }
        });

        LabelCreazione.setBackground(new java.awt.Color(0, 0, 0));
        LabelCreazione.setForeground(new java.awt.Color(232, 232, 232));

        LabelForza.setForeground(new java.awt.Color(232, 232, 232));
        LabelForza.setText("Forza");

        ButtonMenFor.setBackground(new java.awt.Color(84, 84, 84));
        ButtonMenFor.setForeground(new java.awt.Color(232, 232, 232));
        ButtonMenFor.setText("-");
        ButtonMenFor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonMenForActionPerformed(evt);
            }
        });

        LabelValFor.setForeground(new java.awt.Color(232, 232, 232));
        LabelValFor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelValFor.setText("5");

        ButtonpiuFor.setBackground(new java.awt.Color(84, 84, 84));
        ButtonpiuFor.setForeground(new java.awt.Color(232, 232, 232));
        ButtonpiuFor.setText("+");
        ButtonpiuFor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonpiuForActionPerformed(evt);
            }
        });

        LabelValArc.setForeground(new java.awt.Color(232, 232, 232));
        LabelValArc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelValArc.setText("5");

        ButtonpiuArc.setBackground(new java.awt.Color(84, 84, 84));
        ButtonpiuArc.setForeground(new java.awt.Color(232, 232, 232));
        ButtonpiuArc.setText("+");
        ButtonpiuArc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonpiuArcActionPerformed(evt);
            }
        });

        ButtonMenArc.setBackground(new java.awt.Color(84, 84, 84));
        ButtonMenArc.setForeground(new java.awt.Color(232, 232, 232));
        ButtonMenArc.setText("-");
        ButtonMenArc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonMenArcActionPerformed(evt);
            }
        });

        LabelArcana.setForeground(new java.awt.Color(232, 232, 232));
        LabelArcana.setText("Arcana");

        LabelValDes.setForeground(new java.awt.Color(232, 232, 232));
        LabelValDes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelValDes.setText("5");

        ButtonMenDes.setBackground(new java.awt.Color(84, 84, 84));
        ButtonMenDes.setForeground(new java.awt.Color(232, 232, 232));
        ButtonMenDes.setText("-");
        ButtonMenDes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonMenDesActionPerformed(evt);
            }
        });

        LabelDestrzza.setForeground(new java.awt.Color(232, 232, 232));
        LabelDestrzza.setText("Destrzza");

        ButtonpiuDes.setBackground(new java.awt.Color(84, 84, 84));
        ButtonpiuDes.setForeground(new java.awt.Color(232, 232, 232));
        ButtonpiuDes.setText("+");
        ButtonpiuDes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonpiuDesActionPerformed(evt);
            }
        });

        ButtonpiuHP.setBackground(new java.awt.Color(84, 84, 84));
        ButtonpiuHP.setForeground(new java.awt.Color(232, 232, 232));
        ButtonpiuHP.setText("+");
        ButtonpiuHP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonpiuHPActionPerformed(evt);
            }
        });

        LabelValHP.setForeground(new java.awt.Color(232, 232, 232));
        LabelValHP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelValHP.setText("10");

        ButtonMenHP.setBackground(new java.awt.Color(84, 84, 84));
        ButtonMenHP.setForeground(new java.awt.Color(232, 232, 232));
        ButtonMenHP.setText("-");
        ButtonMenHP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonMenHPActionPerformed(evt);
            }
        });

        LabelHP.setForeground(new java.awt.Color(232, 232, 232));
        LabelHP.setText("HP");

        LabelValMana.setForeground(new java.awt.Color(232, 232, 232));
        LabelValMana.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelValMana.setText("10");

        ButtonpiuMana.setBackground(new java.awt.Color(84, 84, 84));
        ButtonpiuMana.setForeground(new java.awt.Color(232, 232, 232));
        ButtonpiuMana.setText("+");
        ButtonpiuMana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonpiuManaActionPerformed(evt);
            }
        });

        LabelMana.setForeground(new java.awt.Color(232, 232, 232));
        LabelMana.setText("Mana");

        ButtonMenMana.setBackground(new java.awt.Color(84, 84, 84));
        ButtonMenMana.setForeground(new java.awt.Color(232, 232, 232));
        ButtonMenMana.setText("-");
        ButtonMenMana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonMenManaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout FrameCreazioneLayout = new javax.swing.GroupLayout(FrameCreazione.getContentPane());
        FrameCreazione.getContentPane().setLayout(FrameCreazioneLayout);
        FrameCreazioneLayout.setHorizontalGroup(
            FrameCreazioneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FrameCreazioneLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ButtonConfremaCrea)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FrameCreazioneLayout.createSequentialGroup()
                .addGroup(FrameCreazioneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FrameCreazioneLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LabelNome)
                        .addGap(40, 40, 40))
                    .addGroup(FrameCreazioneLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(FrameCreazioneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelVelocita, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelForza, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelDestrzza, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelArcana, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelHP, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelMana, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(FrameCreazioneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FrameCreazioneLayout.createSequentialGroup()
                        .addGroup(FrameCreazioneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FrameCreazioneLayout.createSequentialGroup()
                                .addComponent(ButtonMenVel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LabelValVel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ButtonpiuVel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(TextFieldNome))
                        .addGap(119, 119, 119)
                        .addComponent(LabelCreazione, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(FrameCreazioneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(FrameCreazioneLayout.createSequentialGroup()
                            .addComponent(ButtonMenDes, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(LabelValDes, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(ButtonpiuDes, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(FrameCreazioneLayout.createSequentialGroup()
                            .addGroup(FrameCreazioneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(ButtonMenMana, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ButtonMenHP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ButtonMenArc, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(FrameCreazioneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(FrameCreazioneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LabelValArc, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LabelValHP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(LabelValMana, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(FrameCreazioneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(ButtonpiuArc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ButtonpiuHP, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ButtonpiuMana, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(FrameCreazioneLayout.createSequentialGroup()
                        .addComponent(ButtonMenFor, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelValFor, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ButtonpiuFor, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19))
        );
        FrameCreazioneLayout.setVerticalGroup(
            FrameCreazioneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FrameCreazioneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(FrameCreazioneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelNome)
                    .addComponent(TextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelCreazione, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(FrameCreazioneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(FrameCreazioneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ButtonMenVel)
                        .addComponent(LabelVelocita))
                    .addGroup(FrameCreazioneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ButtonpiuVel)
                        .addComponent(LabelValVel)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(FrameCreazioneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(FrameCreazioneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ButtonMenFor)
                        .addComponent(LabelForza))
                    .addGroup(FrameCreazioneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ButtonpiuFor)
                        .addComponent(LabelValFor)))
                .addGap(5, 5, 5)
                .addGroup(FrameCreazioneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FrameCreazioneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ButtonMenArc)
                        .addComponent(LabelArcana))
                    .addGroup(FrameCreazioneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ButtonpiuArc)
                        .addComponent(LabelValArc)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(FrameCreazioneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ButtonpiuDes)
                    .addGroup(FrameCreazioneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ButtonMenDes)
                        .addComponent(LabelValDes)
                        .addComponent(LabelDestrzza)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(FrameCreazioneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FrameCreazioneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ButtonpiuHP)
                        .addComponent(LabelValHP))
                    .addGroup(FrameCreazioneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ButtonMenHP)
                        .addComponent(LabelHP)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(FrameCreazioneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FrameCreazioneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ButtonpiuMana)
                        .addComponent(LabelValMana))
                    .addGroup(FrameCreazioneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ButtonMenMana)
                        .addComponent(LabelMana)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 246, Short.MAX_VALUE)
                .addComponent(ButtonConfremaCrea)
                .addContainerGap())
        );

        FrameOpzione.setBackground(new java.awt.Color(0, 0, 0));

        LabelLingua.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        LabelLingua.setText("Lingue");

        ComboLingue.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Italiano", "English" }));

        ButtonSelezionaLIngua.setText("Seleziona");

        LabelTitoloOpzione.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        LabelTitoloOpzione.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelTitoloOpzione.setText("Opzioni Lingua");

        javax.swing.GroupLayout FrameOpzioneLayout = new javax.swing.GroupLayout(FrameOpzione.getContentPane());
        FrameOpzione.getContentPane().setLayout(FrameOpzioneLayout);
        FrameOpzioneLayout.setHorizontalGroup(
            FrameOpzioneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FrameOpzioneLayout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addGroup(FrameOpzioneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(LabelTitoloOpzione, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(FrameOpzioneLayout.createSequentialGroup()
                        .addComponent(LabelLingua)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ComboLingue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ButtonSelezionaLIngua)))
                .addGap(44, 44, 44))
        );
        FrameOpzioneLayout.setVerticalGroup(
            FrameOpzioneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FrameOpzioneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelTitoloOpzione, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(FrameOpzioneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelLingua)
                    .addComponent(ComboLingue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonSelezionaLIngua))
                .addContainerGap(93, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("La Terrra dei Fiordalsi");
        setBackground(Color.BLACK);

        ButtonNuovaPartita.setBackground(new java.awt.Color(84, 84, 84));
        ButtonNuovaPartita.setForeground(new java.awt.Color(232, 232, 232));
        ButtonNuovaPartita.setText("Nuova Partita");
        ButtonNuovaPartita.setToolTipText("");
        ButtonNuovaPartita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonNuovaPartitaActionPerformed(evt);
            }
        });

        ButtonContinuaPartita.setBackground(new java.awt.Color(84, 84, 84));
        ButtonContinuaPartita.setForeground(new java.awt.Color(232, 232, 232));
        ButtonContinuaPartita.setText("Continua Partita");

        ButtonOpzione.setBackground(new java.awt.Color(84, 84, 84));
        ButtonOpzione.setForeground(new java.awt.Color(232, 232, 232));
        ButtonOpzione.setText("Opzione");
        ButtonOpzione.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonOpzioneActionPerformed(evt);
            }
        });

        LabelTitolo.setBackground(new java.awt.Color(98, 44, 28));
        LabelTitolo.setFont(new java.awt.Font("Yu Gothic UI", 1, 36)); // NOI18N
        LabelTitolo.setForeground(new java.awt.Color(255, 255, 255));
        LabelTitolo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelTitolo.setText("La Terra dei Fiordalisi");
        LabelTitolo.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 255, 0)));
        LabelTitolo.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ButtonOpzione, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(ButtonNuovaPartita, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ButtonContinuaPartita, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(LabelTitolo))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(LabelTitolo)
                .addGap(50, 50, 50)
                .addComponent(ButtonNuovaPartita)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ButtonContinuaPartita)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ButtonOpzione)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonNuovaPartitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonNuovaPartitaActionPerformed
        // TODO add your handling code here:
        LabelCreazione.setText(String.valueOf(Creation));
        FrameCreazione.setVisible(true);
    }//GEN-LAST:event_ButtonNuovaPartitaActionPerformed

    private void ButtonMenVelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonMenVelActionPerformed
        // TODO add your handling code here:
        diminuisci(LabelValVel);
        
    }//GEN-LAST:event_ButtonMenVelActionPerformed

    private void ButtonConfremaCreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonConfremaCreaActionPerformed
        // TODO add your handling code here:
        int vel=Integer.parseInt(LabelValVel.getText());
        
        String nom = TextFieldNome.getText();
        er = new Eroe(nom,vel,vel,vel,vel,vel,vel);
        Gpanel.addKeyListener(new GameInput(er));
        Gmap.setVisible(true);
        Gpanel.requestFocus();
    }//GEN-LAST:event_ButtonConfremaCreaActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
         int vel;
         if(Creation>0){
             vel=Integer.parseInt(LabelValVel.getText())+1;
            LabelValVel.setText(String.valueOf(vel));
            Creation--;
            LabelCreazione.setText(String.valueOf(Creation));
         }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void ButtonOpzioneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonOpzioneActionPerformed
        // TODO add your handling code here:
        FrameOpzione.setVisible(true);
    }//GEN-LAST:event_ButtonOpzioneActionPerformed

    private void ButtonMenForActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonMenForActionPerformed
        // TODO add your handling code here:
        diminuisci(LabelValFor);
    }//GEN-LAST:event_ButtonMenForActionPerformed

    private void ButtonMenArcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonMenArcActionPerformed
        // TODO add your handling code here:
        diminuisci(LabelValArc);
    }//GEN-LAST:event_ButtonMenArcActionPerformed

    private void ButtonMenDesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonMenDesActionPerformed
        // TODO add your handling code here:
        diminuisci(LabelValDes);
    }//GEN-LAST:event_ButtonMenDesActionPerformed

    private void ButtonMenHPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonMenHPActionPerformed
        // TODO add your handling code here:
        diminuisci10(LabelValHP);
    }//GEN-LAST:event_ButtonMenHPActionPerformed

    private void ButtonMenManaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonMenManaActionPerformed
        // TODO add your handling code here:
        diminuisci10(LabelValMana);
    }//GEN-LAST:event_ButtonMenManaActionPerformed

    private void ButtonpiuForActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonpiuForActionPerformed
         // TODO add your handling code here:
         aumenta(LabelValFor);
    }//GEN-LAST:event_ButtonpiuForActionPerformed

    private void ButtonpiuVelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonpiuVelActionPerformed
        // TODO add your handling code here:
        aumenta(LabelValVel);
    }//GEN-LAST:event_ButtonpiuVelActionPerformed

    private void ButtonpiuHPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonpiuHPActionPerformed
        // TODO add your handling code here:
        aumenta10(LabelValHP);
    }//GEN-LAST:event_ButtonpiuHPActionPerformed

    private void ButtonpiuManaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonpiuManaActionPerformed
         // TODO add your handling code here:
         aumenta10(LabelValMana);
    }//GEN-LAST:event_ButtonpiuManaActionPerformed

    private void ButtonpiuArcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonpiuArcActionPerformed
        // TODO add your handling code here:
        aumenta(LabelValArc);
    }//GEN-LAST:event_ButtonpiuArcActionPerformed

    private void ButtonpiuDesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonpiuDesActionPerformed
        // TODO add your handling code here:
        aumenta(LabelValDes);
    }//GEN-LAST:event_ButtonpiuDesActionPerformed
    private void aumenta(javax.swing.JLabel la){
        if(Creation>0){
            int a = Integer.parseInt(la.getText());
            a++;
            Creation--;
            la.setText(String.valueOf(a));
            LabelCreazione.setText(String.valueOf(Creation));
        }
    }
    private void aumenta10(javax.swing.JLabel la){
        int a;
        if(Creation>0){
            a = Integer.parseInt(la.getText());
            a=a+10;
            Creation--;
            la.setText(String.valueOf(a));
            LabelCreazione.setText(String.valueOf(Creation));
        }
    }
    private void diminuisci(javax.swing.JLabel la){
        int a = Integer.parseInt(la.getText());
        if(a>5){
            a--;
            Creation++;
            la.setText(String.valueOf(a));
            LabelCreazione.setText(String.valueOf(Creation));
        }
    }
    private void diminuisci10(javax.swing.JLabel la){
        int a = Integer.parseInt(la.getText());
        if(a>10){
            a=a-10;
            Creation++;
            la.setText(String.valueOf(a));
            LabelCreazione.setText(String.valueOf(Creation));
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Game2dForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Game2dForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Game2dForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Game2dForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Game2dForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonConfremaCrea;
    private javax.swing.JButton ButtonContinuaPartita;
    private javax.swing.JButton ButtonMenArc;
    private javax.swing.JButton ButtonMenDes;
    private javax.swing.JButton ButtonMenFor;
    private javax.swing.JButton ButtonMenHP;
    private javax.swing.JButton ButtonMenMana;
    private javax.swing.JButton ButtonMenVel;
    private javax.swing.JButton ButtonNuovaPartita;
    private javax.swing.JButton ButtonOpzione;
    private javax.swing.JButton ButtonSelezionaLIngua;
    private javax.swing.JButton ButtonpiuArc;
    private javax.swing.JButton ButtonpiuDes;
    private javax.swing.JButton ButtonpiuFor;
    private javax.swing.JButton ButtonpiuHP;
    private javax.swing.JButton ButtonpiuMana;
    private javax.swing.JButton ButtonpiuVel;
    private javax.swing.JComboBox<String> ComboLingue;
    private javax.swing.JFrame FrameCreazione;
    private javax.swing.JFrame FrameOpzione;
    private javax.swing.JLabel LabelArcana;
    private javax.swing.JLabel LabelCreazione;
    private javax.swing.JLabel LabelDestrzza;
    private javax.swing.JLabel LabelForza;
    private javax.swing.JLabel LabelHP;
    private javax.swing.JLabel LabelLingua;
    private javax.swing.JLabel LabelMana;
    private javax.swing.JLabel LabelNome;
    private javax.swing.JLabel LabelTitolo;
    private javax.swing.JLabel LabelTitoloOpzione;
    private javax.swing.JLabel LabelValArc;
    private javax.swing.JLabel LabelValDes;
    private javax.swing.JLabel LabelValFor;
    private javax.swing.JLabel LabelValHP;
    private javax.swing.JLabel LabelValMana;
    private javax.swing.JLabel LabelValVel;
    private javax.swing.JLabel LabelVelocita;
    private javax.swing.JTextField TextFieldNome;
    // End of variables declaration//GEN-END:variables
}
