/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.game2d;

import com.mycompany.game2d.Combattimento.FrameCompat;
import com.mycompany.game2d.Combattimento.PanelCompat;
import com.mycompany.game2d.personaggi.Eroe;

import javax.swing.*;
import java.awt.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Esposito.Lorenzo
 */
public class FrameMappa extends javax.swing.JFrame implements Runnable {
    private FrameInventario Inventario;
    private Game2dForm game2dForm;
    private Eroe er;
    private Thread loop;
    private final int gameTime = 120;
    private final int gameSistema = 200;
    private FrameCompat frameCompat;
    private File f=new File("src" + File.separator +"save.txt");
    /**
     * Creates new form FrameMappa
     */
    public FrameMappa(Game2dForm game2dForm ,Eroe er) {
        this.game2dForm = game2dForm;
        this.er = er;
        super.getContentPane().setBackground(Color.BLACK);
        initComponents();
        LabelNomeEroe.setText(er.getNome());
        Updatebars();
        jLabel2.setText(String.valueOf(er.getLv()));
    }
    public void Updatebars(){
        ProgressBarMana.setMaximum(er.getArcana());
        ProgressBarHP.setMaximum(er.getHp());
        ProgressBarMana.setValue(er.getArcana());
        ProgressBarHP.setValue(er.getHp());
        jLabel2.setText(String.valueOf(er.getLv()));
    }
    private void starLoop(){
        loop = new Thread(this);
        loop.start();
    }
    @Override
    public void run() {
        double timeFreme = 1000000000.0/gameTime;
        double timeSistema = 1000000000.0/gameSistema;
        long lastTime = System.nanoTime();
        double deltaU = 0;
        double deltaF = 0;
        while (true){
            long currentTime = System.nanoTime();
            deltaU += (currentTime - lastTime)/timeSistema;
            deltaF += (currentTime - lastTime)/timeFreme;
            if (deltaU >= 1){
                deltaU--;
            }
            if(deltaF >= 1){
                frameCompat.repaint();
                deltaF--;
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

        PanelfGioco = new GamePanel(game2dForm);
        ButtonDoungeon = new javax.swing.JButton();
        LabelName = new javax.swing.JLabel();
        LabelMana = new javax.swing.JLabel();
        LabelHP = new javax.swing.JLabel();
        ButtonInventario = new javax.swing.JButton();
        ProgressBarMana = new javax.swing.JProgressBar();
        LabelEXP = new javax.swing.JLabel();
        ProgressBarHP = new javax.swing.JProgressBar();
        ButtonOpzioni = new javax.swing.JButton();
        LabelNomeEroe = new javax.swing.JLabel();
        ProgressBarEXP = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("La Terrra dei Fiordalsi");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout PanelfGiocoLayout = new javax.swing.GroupLayout(PanelfGioco);
        PanelfGioco.setLayout(PanelfGiocoLayout);
        PanelfGiocoLayout.setHorizontalGroup(
            PanelfGiocoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        PanelfGiocoLayout.setVerticalGroup(
            PanelfGiocoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 194, Short.MAX_VALUE)
        );

        ButtonDoungeon.setBackground(new java.awt.Color(84, 84, 84));
        ButtonDoungeon.setForeground(new java.awt.Color(232, 232, 232));
        ButtonDoungeon.setText("ENTRA");
        ButtonDoungeon.setFocusable(false);
        ButtonDoungeon.setMaximumSize(new java.awt.Dimension(95, 23));
        ButtonDoungeon.setMinimumSize(new java.awt.Dimension(95, 23));
        ButtonDoungeon.setPreferredSize(new java.awt.Dimension(95, 23));
        ButtonDoungeon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonDoungeonActionPerformed(evt);
            }
        });

        LabelName.setForeground(new java.awt.Color(232, 232, 232));
        LabelName.setText("NOME:");

        LabelMana.setForeground(new java.awt.Color(232, 232, 232));
        LabelMana.setText("MANA");

        LabelHP.setForeground(new java.awt.Color(232, 232, 232));
        LabelHP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelHP.setText("HP");

        ButtonInventario.setBackground(new java.awt.Color(84, 84, 84));
        ButtonInventario.setForeground(new java.awt.Color(232, 232, 232));
        ButtonInventario.setText("INVENTARIO");
        ButtonInventario.setFocusable(false);
        ButtonInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonInventarioActionPerformed(evt);
            }
        });

        ProgressBarMana.setBackground(new java.awt.Color(84, 84, 84));
        ProgressBarMana.setForeground(new java.awt.Color(0, 0, 204));
        ProgressBarMana.setToolTipText("");
        ProgressBarMana.setValue(100);
        ProgressBarMana.setStringPainted(true);

        LabelEXP.setForeground(new java.awt.Color(232, 232, 232));
        LabelEXP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelEXP.setText("EXP");

        ProgressBarHP.setBackground(new java.awt.Color(84, 84, 84));
        ProgressBarHP.setForeground(new java.awt.Color(204, 0, 0));
        ProgressBarHP.setToolTipText("");
        ProgressBarHP.setValue(100);
        ProgressBarHP.setStringPainted(true);

        ButtonOpzioni.setBackground(new java.awt.Color(84, 84, 84));
        ButtonOpzioni.setForeground(new java.awt.Color(232, 232, 232));
        ButtonOpzioni.setText("OPZIONI");
        ButtonOpzioni.setFocusable(false);
        ButtonOpzioni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonOpzioniActionPerformed(evt);
            }
        });

        LabelNomeEroe.setForeground(new java.awt.Color(232, 232, 232));
        LabelNomeEroe.setText("jLabel5");

        ProgressBarEXP.setBackground(new java.awt.Color(255, 255, 255));
        ProgressBarEXP.setForeground(new java.awt.Color(153, 212, 0));
        ProgressBarEXP.setToolTipText("");
        ProgressBarEXP.setStringPainted(true);

        jLabel1.setForeground(new java.awt.Color(232, 232, 232));
        jLabel1.setText("LV:");

        jLabel2.setForeground(new java.awt.Color(232, 232, 232));
        jLabel2.setText("jLabel2");

        jButton1.setText("Salva");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    jButton1ActionPerformed(evt);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelfGioco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ButtonOpzioni, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ButtonInventario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ButtonDoungeon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LabelEXP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LabelMana, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LabelName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LabelHP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(ProgressBarHP, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
                    .addComponent(ProgressBarEXP, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ProgressBarMana, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(LabelNomeEroe, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelfGioco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ButtonDoungeon, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ButtonInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ButtonOpzioni, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabelName)
                            .addComponent(LabelNomeEroe)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabelMana)
                            .addComponent(ProgressBarMana, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabelHP)
                            .addComponent(ProgressBarHP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ProgressBarEXP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelEXP))))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonDoungeonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonDoungeonActionPerformed
        // TODO add your handling code here:
        LevelUp LU = new LevelUp();
        LU.SetFrameMap(this);
        LU.setEr(er);
        LU.setVisible(true);

    }//GEN-LAST:event_ButtonDoungeonActionPerformed

    private void ButtonInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonInventarioActionPerformed
        // TODO add your handling code here:
        Inventario = new FrameInventario(er);
        Inventario.setVisible(true);
    }//GEN-LAST:event_ButtonInventarioActionPerformed

    private void ButtonOpzioniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonOpzioniActionPerformed
        // TODO add your handling code here:
        frameCompat = new FrameCompat(new PanelCompat());
        starLoop();
        this.setVisible(false);
    }//GEN-LAST:event_ButtonOpzioniActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) throws IOException {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        FileWriter fw = new FileWriter(f);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(er.toFile());
        bw.flush();
    }//GEN-LAST:event_jButton1ActionPerformed
    
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
            java.util.logging.Logger.getLogger(FrameMappa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameMappa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameMappa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameMappa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonDoungeon;
    private javax.swing.JButton ButtonInventario;
    private javax.swing.JButton ButtonOpzioni;
    private javax.swing.JLabel LabelEXP;
    private javax.swing.JLabel LabelHP;
    private javax.swing.JLabel LabelMana;
    private javax.swing.JLabel LabelName;
    private javax.swing.JLabel LabelNomeEroe;
    private javax.swing.JPanel PanelfGioco;
    private javax.swing.JProgressBar ProgressBarEXP;
    private javax.swing.JProgressBar ProgressBarHP;
    private javax.swing.JProgressBar ProgressBarMana;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
