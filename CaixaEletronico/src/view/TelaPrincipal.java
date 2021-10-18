/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author douglas
 */
public class TelaPrincipal extends javax.swing.JFrame {
    TelaSaque ts = new TelaSaque();
    TelaDeposito td = new TelaDeposito();
    TelaSaldo tsal = new TelaSaldo();
    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnSaldo = new javax.swing.JButton();
        btnSaque = new javax.swing.JButton();
        btnDesposito = new javax.swing.JButton();
        FundoPrincipal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela Principal");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("AUTOATENDIMENTO");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 11, 306, 25));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/bank.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("POR FAVOR, APERTE O BOTÃO DA OPÇÃO DESEJADA !");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 42, 316, -1));

        btnSaldo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnSaldo.setForeground(new java.awt.Color(255, 255, 0));
        btnSaldo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/wallet.png"))); // NOI18N
        btnSaldo.setText("Saldo");
        btnSaldo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaldoActionPerformed(evt);
            }
        });
        getContentPane().add(btnSaldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 186, 160, 50));

        btnSaque.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnSaque.setForeground(new java.awt.Color(51, 204, 0));
        btnSaque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/saque.png"))); // NOI18N
        btnSaque.setText("SAQUE");
        btnSaque.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSaque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaqueActionPerformed(evt);
            }
        });
        getContentPane().add(btnSaque, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, 160, 50));

        btnDesposito.setBackground(new java.awt.Color(255, 255, 255));
        btnDesposito.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnDesposito.setForeground(new java.awt.Color(102, 102, 0));
        btnDesposito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/deposit.png"))); // NOI18N
        btnDesposito.setText("Depósito");
        btnDesposito.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDesposito.setOpaque(false);
        btnDesposito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDespositoActionPerformed(evt);
            }
        });
        getContentPane().add(btnDesposito, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 160, 50));

        FundoPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundo-login.png"))); // NOI18N
        getContentPane().add(FundoPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -5, 400, 410));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaqueActionPerformed
        this.dispose();
        ts.setVisible(true);
    }//GEN-LAST:event_btnSaqueActionPerformed

    private void btnDespositoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDespositoActionPerformed
        this.dispose();
        td.setVisible(true);
    }//GEN-LAST:event_btnDespositoActionPerformed

    private void btnSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaldoActionPerformed
        this.dispose();
        tsal.setVisible(true);
    }//GEN-LAST:event_btnSaldoActionPerformed

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
    private javax.swing.JLabel FundoPrincipal;
    private javax.swing.JButton btnDesposito;
    private javax.swing.JButton btnSaldo;
    private javax.swing.JButton btnSaque;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
