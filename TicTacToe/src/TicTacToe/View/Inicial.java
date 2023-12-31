/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package TicTacToe.View;

import javax.swing.JLabel;

/**
 *
 * @author ADMIN
 */
public class Inicial extends javax.swing.JFrame {

    /**
     * Creates new form Tela
     */
    public Inicial() {
        initComponents();

    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();
        jogar = new javax.swing.JButton();
        Créditos = new javax.swing.JButton();
        Imagem = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Title.setFont(new java.awt.Font("League Spartan SemiBold", 0, 48)); // NOI18N
        Title.setText("TIC TAC TOE");
        Title.setToolTipText("");
        Title.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Title.setAlignmentX(0.5F);
        Title.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Title.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 406, -1, -1));

        jogar.setFont(new java.awt.Font("League Spartan", 0, 12)); // NOI18N
        jogar.setText("Jogar");
        jogar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jogarActionPerformed(evt);
            }
        });
        jPanel1.add(jogar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 130, 30));

        Créditos.setFont(new java.awt.Font("League Spartan", 0, 12)); // NOI18N
        Créditos.setText("Créditos");
        Créditos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Créditos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CréditosActionPerformed(evt);
            }
        });
        jPanel1.add(Créditos, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 280, 130, 30));

        Imagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TicTacToe/Resources/TicTacToeInicial.png"))); // NOI18N
        jPanel1.add(Imagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 400));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CréditosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CréditosActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Creditos c = new Creditos();
        c.setVisible(true);
    }//GEN-LAST:event_CréditosActionPerformed

    private void jogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jogarActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Jogo jogo = new Jogo();
        jogo.setVisible(true);
    }//GEN-LAST:event_jogarActionPerformed

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
            java.util.logging.Logger.getLogger(Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Créditos;
    private javax.swing.JLabel Imagem;
    private javax.swing.JLabel Title;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jogar;
    // End of variables declaration//GEN-END:variables
}
