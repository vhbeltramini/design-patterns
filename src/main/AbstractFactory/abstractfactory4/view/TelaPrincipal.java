package main.AbstractFactory.abstractfactory4.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 *
 * @author Kevin Kons
 */
public class TelaPrincipal extends javax.swing.JFrame {


    public TelaPrincipal() {
        initComponents();
        buttonGroup1.add(rbtGregos);
        buttonGroup1.add(rbtEgipcios);
        buttonGroup1.add(rbtChineses);

        tpLog.setEditable(false);
        
        ActionListener selecionaTipoDeCivilizacao = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
            }
        };
        
        rbtGregos.addActionListener(selecionaTipoDeCivilizacao);
        rbtEgipcios.addActionListener(selecionaTipoDeCivilizacao);
        rbtChineses.addActionListener(selecionaTipoDeCivilizacao);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        rbtGregos = new javax.swing.JRadioButton();
        rbtEgipcios = new javax.swing.JRadioButton();
        rbtChineses = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        lbLimitePopulacional = new javax.swing.JLabel();
        lbPopulacaoAtual = new javax.swing.JLabel();
        lbDinheiro = new javax.swing.JLabel();
        lbRound = new javax.swing.JLabel();
        btAddColhedor = new javax.swing.JButton();
        btAddLenhador = new javax.swing.JButton();
        btAddMinerador = new javax.swing.JButton();
        btIniciar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tpLog = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        rbtGregos.setText("Gregos");

        rbtEgipcios.setText("Eg\u00EDpcios");

        rbtChineses.setText("Chineses");

        jLabel5.setText("Civiliza\u00E7\u00E3o");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addComponent(rbtGregos, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rbtEgipcios, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(rbtChineses, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(41, 41, 41))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtGregos)
                    .addComponent(rbtEgipcios)
                    .addComponent(rbtChineses))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        lbLimitePopulacional.setText("Limite Populacional:");

        lbPopulacaoAtual.setText("Popula\u00E7\u00E3o Atual:");

        lbDinheiro.setText("Dinheiro:");

        lbRound.setText("Round:");

        btAddColhedor.setText("Colhedor $1");
        btAddColhedor.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btAddColhedorActionPerformed(evt);
            }
        });

        btAddLenhador.setText("Lenhador $2");
        btAddLenhador.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btAddLenhadorActionPerformed(evt);
            }
        });

        btAddMinerador.setText("Minerador");
        btAddMinerador.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btAddMineradorActionPerformed(evt);
            }
        });

        btIniciar.setText("Iniciar");
        btIniciar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btIniciarActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(tpLog);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbPopulacaoAtual)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbLimitePopulacional)
                                .addGap(69, 69, 69)
                                .addComponent(lbDinheiro)
                                .addGap(48, 48, 48)
                                .addComponent(lbRound)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btAddColhedor)
                        .addGap(18, 18, 18)
                        .addComponent(btAddLenhador)
                        .addGap(18, 18, 18)
                        .addComponent(btAddMinerador)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btIniciar))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbLimitePopulacional)
                    .addComponent(lbDinheiro)
                    .addComponent(lbRound))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbPopulacaoAtual)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAddColhedor)
                    .addComponent(btAddLenhador)
                    .addComponent(btAddMinerador)
                    .addComponent(btIniciar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btAddColhedorActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btAddColhedorActionPerformed
    }//GEN-LAST:event_btAddColhedorActionPerformed

    private void btIniciarActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btIniciarActionPerformed
        if(evt.getActionCommand() == "Iniciar") {
        } else {
        }
        
    }//GEN-LAST:event_btIniciarActionPerformed

    private void btAddLenhadorActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btAddLenhadorActionPerformed
    }//GEN-LAST:event_btAddLenhadorActionPerformed

    private void btAddMineradorActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btAddMineradorActionPerformed
    }//GEN-LAST:event_btAddMineradorActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAddColhedor;
    private javax.swing.JButton btAddLenhador;
    private javax.swing.JButton btAddMinerador;
    private javax.swing.JButton btIniciar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbDinheiro;
    private javax.swing.JLabel lbLimitePopulacional;
    private javax.swing.JLabel lbPopulacaoAtual;
    private javax.swing.JLabel lbRound;
    private javax.swing.JRadioButton rbtChineses;
    private javax.swing.JRadioButton rbtEgipcios;
    private javax.swing.JRadioButton rbtGregos;
    private javax.swing.JTextPane tpLog;
    // End of variables declaration//GEN-END:variables


}
