/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sewa_Mobil;

/**
 *
 * @author ACER
 */
public class halaman_utama extends javax.swing.JFrame {

    /**
     * Creates new form halaman_utama
     */
    public halaman_utama() {
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

        hal_login = new Sewa_Mobil.ButtonImage();
        exit = new Sewa_Mobil.ButtonImage();
        daftar_akun = new Sewa_Mobil.ButtonImage();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        hal_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hal_loginActionPerformed(evt);
            }
        });
        getContentPane().add(hal_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 350, 290, 110));

        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        getContentPane().add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 100, 110));

        daftar_akun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                daftar_akunActionPerformed(evt);
            }
        });
        getContentPane().add(daftar_akun, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 470, 370, 130));

        jLabel1.setBackground(new java.awt.Color(255, 51, 51));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GAMBAR/hal_utama.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 910));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void hal_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hal_loginActionPerformed
        // TODO add your handling code here:
        hal_login ha = new hal_login();
        ha.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_hal_loginActionPerformed

    private void daftar_akunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_daftar_akunActionPerformed
        // TODO add your handling code here:
        daftar_akun ha = new daftar_akun();
        ha.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_daftar_akunActionPerformed

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
            java.util.logging.Logger.getLogger(halaman_utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(halaman_utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(halaman_utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(halaman_utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new halaman_utama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Sewa_Mobil.ButtonImage daftar_akun;
    private Sewa_Mobil.ButtonImage exit;
    private Sewa_Mobil.ButtonImage hal_login;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}