/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

/**
 *
 * @author Farg-
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnProductos = new javax.swing.JButton();
        btnCarrito = new javax.swing.JButton();
        btnFavoritos = new javax.swing.JButton();
        btnPerfil = new javax.swing.JButton();
        btnAfiliados = new javax.swing.JButton();
        btnViajes = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImages(null);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnProductos.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnProductos.setText("Productos");
        btnProductos.setToolTipText("");
        btnProductos.setBorder(null);
        btnProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductosActionPerformed(evt);
            }
        });
        getContentPane().add(btnProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 30, 110, 40));

        btnCarrito.setBackground(new java.awt.Color(0, 0, 0));
        btnCarrito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/CARRITO.png"))); // NOI18N
        btnCarrito.setBorder(null);
        btnCarrito.setBorderPainted(false);
        btnCarrito.setContentAreaFilled(false);
        getContentPane().add(btnCarrito, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 20, -1, -1));

        btnFavoritos.setBackground(new java.awt.Color(0, 0, 0));
        btnFavoritos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/FAVORITOS.png"))); // NOI18N
        btnFavoritos.setBorder(null);
        btnFavoritos.setBorderPainted(false);
        btnFavoritos.setContentAreaFilled(false);
        getContentPane().add(btnFavoritos, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 20, -1, -1));

        btnPerfil.setBackground(new java.awt.Color(0, 0, 0));
        btnPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/PERFIL.png"))); // NOI18N
        btnPerfil.setBorder(null);
        btnPerfil.setContentAreaFilled(false);
        btnPerfil.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnPerfil.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        getContentPane().add(btnPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 20, -1, -1));

        btnAfiliados.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnAfiliados.setText("Afiliados");
        btnAfiliados.setToolTipText("");
        btnAfiliados.setBorder(null);
        btnAfiliados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAfiliadosActionPerformed(evt);
            }
        });
        getContentPane().add(btnAfiliados, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 30, 110, 40));

        btnViajes.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnViajes.setText("Viajes");
        btnViajes.setToolTipText("");
        btnViajes.setBorder(null);
        btnViajes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViajesActionPerformed(evt);
            }
        });
        getContentPane().add(btnViajes, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, 110, 40));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/HOME.jpg"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnViajesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViajesActionPerformed
        FlightWindow ventana1 = new FlightWindow();
        ventana1.show();

    }//GEN-LAST:event_btnViajesActionPerformed

    private void btnProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductosActionPerformed
        ProductsWindow ventana2 = new ProductsWindow();
        ventana2.show();
    }//GEN-LAST:event_btnProductosActionPerformed

    private void btnAfiliadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAfiliadosActionPerformed
        AffiliatesWindow ventana3 = new AffiliatesWindow();
        ventana3.show();
    }//GEN-LAST:event_btnAfiliadosActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton btnAfiliados;
    private javax.swing.JButton btnCarrito;
    private javax.swing.JButton btnFavoritos;
    private javax.swing.JButton btnPerfil;
    private javax.swing.JButton btnProductos;
    private javax.swing.JButton btnViajes;
    // End of variables declaration//GEN-END:variables
}
