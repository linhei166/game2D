package com.mycompany.game2d;

import com.mycompany.game2d.personaggi.Eroe;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Esposito.lorenzo
 */
public class Opzioni extends javax.swing.JFrame {

    /**
     * Creates new form Opzioni
     */
    public Opzioni(Eroe er) {
        initComponents();
        jLabelValLv.setText(String.valueOf(er.getLv()));
        LabelNome.setText(er.getNome());
        LabelValVel.setText(String.valueOf(er.getVelocita()));
        LabelValDes.setText(String.valueOf(er.getDestrezza()));
        LabelValArc.setText(String.valueOf(er.getArcana()));
        LabelValFor.setText(String.valueOf(er.getForza()));
        LabelValHP.setText(String.valueOf(er.getHp()));
        LabelValMana.setText(String.valueOf(er.getMana()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LabelLingua = new javax.swing.JLabel();
        ComboLingue = new javax.swing.JComboBox<>();
        ButtonSelezionaLIngua = new javax.swing.JButton();
        LabelTitoloOpzione = new javax.swing.JLabel();
        ButtonSelezionaLIngua1 = new javax.swing.JButton();
        LabelNome = new javax.swing.JLabel();
        LabelValNome = new javax.swing.JLabel();
        jLabelLv = new javax.swing.JLabel();
        jLabelValLv = new javax.swing.JLabel();
        LabelForza = new javax.swing.JLabel();
        LabelArcana = new javax.swing.JLabel();
        LabelDestrzza = new javax.swing.JLabel();
        LabelHP = new javax.swing.JLabel();
        LabelVelocita = new javax.swing.JLabel();
        LabelMana = new javax.swing.JLabel();
        LabelValVel = new javax.swing.JLabel();
        LabelValFor = new javax.swing.JLabel();
        LabelValDes = new javax.swing.JLabel();
        LabelValArc = new javax.swing.JLabel();
        LabelValHP = new javax.swing.JLabel();
        LabelValMana = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LabelLingua.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        LabelLingua.setForeground(new java.awt.Color(232, 232, 232));
        LabelLingua.setText("Lingue");

        ComboLingue.setBackground(new java.awt.Color(84, 84, 84));
        ComboLingue.setForeground(new java.awt.Color(232, 232, 232));
        ComboLingue.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Italiano", "English" }));

        ButtonSelezionaLIngua.setBackground(new java.awt.Color(84, 84, 84));
        ButtonSelezionaLIngua.setForeground(new java.awt.Color(232, 232, 232));
        ButtonSelezionaLIngua.setText("Seleziona");
        ButtonSelezionaLIngua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSelezionaLInguaActionPerformed(evt);
            }
        });

        LabelTitoloOpzione.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        LabelTitoloOpzione.setForeground(new java.awt.Color(232, 232, 232));
        LabelTitoloOpzione.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelTitoloOpzione.setText("Opzioni Lingua");

        ButtonSelezionaLIngua1.setBackground(new java.awt.Color(84, 84, 84));
        ButtonSelezionaLIngua1.setForeground(new java.awt.Color(232, 232, 232));
        ButtonSelezionaLIngua1.setText("Salva");
        ButtonSelezionaLIngua1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSelezionaLIngua1ActionPerformed(evt);
            }
        });

        LabelNome.setForeground(new java.awt.Color(232, 232, 232));
        LabelNome.setText("Nome:");

        LabelValNome.setForeground(new java.awt.Color(232, 232, 232));
        LabelValNome.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        LabelValNome.setText("jLabel1");

        jLabelLv.setForeground(new java.awt.Color(232, 232, 232));
        jLabelLv.setText("Lv");

        jLabelValLv.setForeground(new java.awt.Color(232, 232, 232));
        jLabelValLv.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabelValLv.setText("jLabel2");

        LabelForza.setForeground(new java.awt.Color(232, 232, 232));
        LabelForza.setText("Forza");

        LabelArcana.setForeground(new java.awt.Color(232, 232, 232));
        LabelArcana.setText("Arcana");

        LabelDestrzza.setForeground(new java.awt.Color(232, 232, 232));
        LabelDestrzza.setText("Destrzza");

        LabelHP.setForeground(new java.awt.Color(232, 232, 232));
        LabelHP.setText("HP");

        LabelVelocita.setForeground(new java.awt.Color(232, 232, 232));
        LabelVelocita.setText("Velocita");

        LabelMana.setForeground(new java.awt.Color(232, 232, 232));
        LabelMana.setText("Mana");

        LabelValVel.setForeground(new java.awt.Color(232, 232, 232));
        LabelValVel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        LabelValVel.setText("5");

        LabelValFor.setForeground(new java.awt.Color(232, 232, 232));
        LabelValFor.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        LabelValFor.setText("5");

        LabelValDes.setForeground(new java.awt.Color(232, 232, 232));
        LabelValDes.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        LabelValDes.setText("5");

        LabelValArc.setForeground(new java.awt.Color(232, 232, 232));
        LabelValArc.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        LabelValArc.setText("5");

        LabelValHP.setForeground(new java.awt.Color(232, 232, 232));
        LabelValHP.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        LabelValHP.setText("10");

        LabelValMana.setForeground(new java.awt.Color(232, 232, 232));
        LabelValMana.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        LabelValMana.setText("10");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ButtonSelezionaLIngua1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelLv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(LabelNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LabelValHP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(LabelValDes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabelValLv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(LabelValNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(LabelValVel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(LabelValFor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(LabelValArc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(LabelValMana, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LabelTitoloOpzione, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(26, 26, 26)
                                    .addComponent(LabelLingua)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(ComboLingue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(ButtonSelezionaLIngua))
                                .addGroup(layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(LabelVelocita, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(LabelForza, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(LabelDestrzza, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(LabelArcana, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(LabelHP, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(LabelMana, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 22, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(LabelTitoloOpzione, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelLingua)
                    .addComponent(ComboLingue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonSelezionaLIngua))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ButtonSelezionaLIngua1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelLv)
                    .addComponent(jLabelValLv))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelValNome)
                    .addComponent(LabelNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LabelVelocita)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelForza)
                        .addGap(5, 5, 5)
                        .addComponent(LabelArcana)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelDestrzza)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelHP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelMana))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LabelValVel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelValFor)
                        .addGap(5, 5, 5)
                        .addComponent(LabelValArc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelValDes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelValHP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelValMana)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonSelezionaLInguaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSelezionaLInguaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonSelezionaLInguaActionPerformed

    private void ButtonSelezionaLIngua1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSelezionaLIngua1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonSelezionaLIngua1ActionPerformed

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
            java.util.logging.Logger.getLogger(Opzioni.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Opzioni.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Opzioni.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Opzioni.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonSelezionaLIngua;
    private javax.swing.JButton ButtonSelezionaLIngua1;
    private javax.swing.JComboBox<String> ComboLingue;
    private javax.swing.JLabel LabelArcana;
    private javax.swing.JLabel LabelDestrzza;
    private javax.swing.JLabel LabelForza;
    private javax.swing.JLabel LabelHP;
    private javax.swing.JLabel LabelLingua;
    private javax.swing.JLabel LabelMana;
    private javax.swing.JLabel LabelNome;
    private javax.swing.JLabel LabelTitoloOpzione;
    private javax.swing.JLabel LabelValArc;
    private javax.swing.JLabel LabelValDes;
    private javax.swing.JLabel LabelValFor;
    private javax.swing.JLabel LabelValHP;
    private javax.swing.JLabel LabelValMana;
    private javax.swing.JLabel LabelValNome;
    private javax.swing.JLabel LabelValVel;
    private javax.swing.JLabel LabelVelocita;
    private javax.swing.JLabel jLabelLv;
    private javax.swing.JLabel jLabelValLv;
    // End of variables declaration//GEN-END:variables
}
