
package help.me.find.it.pkg2.pkg0;

import java.awt.Color;
import javax.swing.JOptionPane;


public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        jLabel2.setOpaque(true);
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        edificiosUfro = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        recorridoMicro = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        ayuda = new javax.swing.JButton();
        logo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        edificiosUfro.setIcon(new javax.swing.ImageIcon("C:\\Users\\Vichoh\\Documents\\NetBeansProjects\\help.me.find.it.2.0\\src\\help\\me\\find\\it\\pkg2\\pkg0\\mapas\\ufro.png")); // NOI18N
        edificiosUfro.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 204), 2, true));
        edificiosUfro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edificiosUfroActionPerformed(evt);
            }
        });
        getContentPane().add(edificiosUfro, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 235, 156, 101));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 215, 285, -1));

        recorridoMicro.setIcon(new javax.swing.ImageIcon("C:\\Users\\Vichoh\\Documents\\NetBeansProjects\\help.me.find.it.2.0\\src\\help\\me\\find\\it\\pkg2\\pkg0\\mapas\\micro150x100.jpg")); // NOI18N
        recorridoMicro.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 204), 2, true));
        recorridoMicro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                recorridoMicroMouseReleased(evt);
            }
        });
        recorridoMicro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recorridoMicroActionPerformed(evt);
            }
        });
        getContentPane().add(recorridoMicro, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 97, 155, 100));

        jLabel1.setText("V 0.2");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, -1, 25));

        ayuda.setIcon(new javax.swing.ImageIcon("C:\\Users\\Vichoh\\Documents\\NetBeansProjects\\help.me.find.it.2.0\\src\\help\\me\\find\\it\\pkg2\\pkg0\\mapas\\ayuda.jpg")); // NOI18N
        ayuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ayudaActionPerformed(evt);
            }
        });
        getContentPane().add(ayuda, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, 20, 20));

        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setIcon(new javax.swing.ImageIcon("C:\\Users\\Vichoh\\Documents\\NetBeansProjects\\help.me.find.it.2.0\\src\\help\\me\\find\\it\\pkg2\\pkg0\\mapas\\70.jpg")); // NOI18N
        getContentPane().add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 70));

        jLabel2.setBackground(new java.awt.Color(0, 102, 255));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("HELP ME FIND IT !");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 70));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void recorridoMicroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recorridoMicroActionPerformed
        JFrameSubidasDestinos ventana = new JFrameSubidasDestinos();
        ventana.setVisible(true);
        
    
        this.setVisible(false);
    }//GEN-LAST:event_recorridoMicroActionPerformed

    private void edificiosUfroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edificiosUfroActionPerformed
        UfroMapa ufroMapa = new UfroMapa();
        ufroMapa.setVisible(true);
        
        this.setVisible(false);
    }//GEN-LAST:event_edificiosUfroActionPerformed

    private void recorridoMicroMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_recorridoMicroMouseReleased
        
    }//GEN-LAST:event_recorridoMicroMouseReleased

    private void ayudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ayudaActionPerformed
           JOptionPane.showMessageDialog(null, "Al presionar el boton superior accederas a buscar micros \n El Boton inferior sabras el camino al edifico que te quieres dirigir ");
    }//GEN-LAST:event_ayudaActionPerformed

    
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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ayuda;
    private javax.swing.JButton edificiosUfro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel logo;
    private javax.swing.JButton recorridoMicro;
    // End of variables declaration//GEN-END:variables
}
