/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package help.me.find.it.pkg2.pkg0;

import java.awt.Dimension;
import java.awt.Image;
import javax.swing.ImageIcon;
import maps.java.MapsJava;
import maps.java.StaticMaps;

/**
 *
 * @author Vichoh
 */
public class MapaUfroGoogleMpas extends javax.swing.JFrame {

    public int derechaV ;
    public int izquierdaV;
    
    public MapaUfroGoogleMpas() {
        initComponents();
        this.derechaV = 747838;
        this.izquierdaV = 616150;
        mapaGoogle.setIcon(tranformarVaribleImage());
    }

    public ImageIcon tranformarVaribleImage(){
        
        ImageIcon icono = new ImageIcon(mapa ());
        return icono;
    }
    
    public Image mapa (){
        StaticMaps mapaEstatico = new StaticMaps();
        try {
            Image resultadoMapa = mapaEstatico.getStaticMap(lonLAt(), 14,new Dimension(305,385),
                    1, StaticMaps.Format.png, StaticMaps.Maptype.satellite);
            return resultadoMapa;
        } catch (Exception e) {
            System.out.println("mapa");
             return null;
        }
        
    }
    
    public String lonLAt(){
        
        
        return "-38."+this.derechaV+","+" "+"-72."+this.izquierdaV; 
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        derecha = new javax.swing.JButton();
        mapaGoogle = new javax.swing.JLabel();
        izquierda = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        derecha.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        derecha.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        derecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                derechaActionPerformed(evt);
            }
        });

        mapaGoogle.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 204), 1, true));

        izquierda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                izquierdaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mapaGoogle, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(izquierda, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(212, 212, 212)
                        .addComponent(derecha, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(mapaGoogle, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(izquierda, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(derecha, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void derechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_derechaActionPerformed
        this.derechaV = derechaV+1000;
        mapaGoogle.setIcon(tranformarVaribleImage());
    }//GEN-LAST:event_derechaActionPerformed

    private void izquierdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_izquierdaActionPerformed
        this.izquierdaV = izquierdaV+1000;
        mapaGoogle.setIcon(tranformarVaribleImage());
    }//GEN-LAST:event_izquierdaActionPerformed

 
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
            java.util.logging.Logger.getLogger(MapaUfroGoogleMpas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MapaUfroGoogleMpas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MapaUfroGoogleMpas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MapaUfroGoogleMpas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MapaUfroGoogleMpas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton derecha;
    private javax.swing.JButton izquierda;
    private javax.swing.JLabel mapaGoogle;
    // End of variables declaration//GEN-END:variables
}
