/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package help.me.find.it.pkg2.pkg0;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Vichoh
 */
public class UfroMapa extends javax.swing.JFrame {

    /**
     * Creates new form ufroMapa
     */
    public UfroMapa() {
        initComponents();
        jLabel2.setOpaque(true);
        seleccion.setOpaque(true);
        googleMaps.setOpaque(true);
        botonesTransparentes ();
    }

   public void botonesTransparentes (){
       electrica.setOpaque(false);
       electrica.setContentAreaFilled(false);
       electrica.setBorderPainted(false);
       dcf.setOpaque(false);
       dcf.setContentAreaFilled(false);
       dcf.setBorderPainted(false); 
       ra.setOpaque(false);
       ra.setContentAreaFilled(false);
       ra.setBorderPainted(false);
       r.setOpaque(false);
       r.setContentAreaFilled(false);
       r.setBorderPainted(false);
       e.setOpaque(false);
       e.setContentAreaFilled(false);
       e.setBorderPainted(false);
       d.setOpaque(false);
       d.setContentAreaFilled(false);
       d.setBorderPainted(false);
       dis.setOpaque(false);
       dis.setContentAreaFilled(false);
       dis.setBorderPainted(false);
       biblioteca.setOpaque(false);
       biblioteca.setContentAreaFilled(false);
       biblioteca.setBorderPainted(false);
       o.setOpaque(false);
       o.setContentAreaFilled(false);
       o.setBorderPainted(false);
       n.setOpaque(false);
       n.setContentAreaFilled(false);
       n.setBorderPainted(false);
       lugarU.setOpaque(false);
       lugarU.setContentAreaFilled(false);
       lugarU.setBorderPainted(false);
       lugarS.setOpaque(false);
       lugarS.setContentAreaFilled(false);
       lugarS.setBorderPainted(false);
       lugarM.setOpaque(false);
       lugarM.setContentAreaFilled(false);
       lugarM.setBorderPainted(false);
       lugarE.setOpaque(false);
       lugarE.setContentAreaFilled(false);
       lugarE.setBorderPainted(false);
       
   }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        electrica = new javax.swing.JButton();
        dcf = new javax.swing.JButton();
        ra = new javax.swing.JButton();
        r = new javax.swing.JButton();
        e = new javax.swing.JButton();
        d = new javax.swing.JButton();
        dis = new javax.swing.JButton();
        biblioteca = new javax.swing.JButton();
        n = new javax.swing.JButton();
        o = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        googleMaps = new javax.swing.JButton();
        lugarE = new javax.swing.JButton();
        lugarM = new javax.swing.JButton();
        lugarS = new javax.swing.JButton();
        lugarU = new javax.swing.JButton();
        seleccion = new javax.swing.JButton();
        validacion = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ayuda = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        electrica.setBorderPainted(false);
        electrica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                electricaActionPerformed(evt);
            }
        });
        getContentPane().add(electrica, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 280, 20, 60));

        dcf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dcfActionPerformed(evt);
            }
        });
        getContentPane().add(dcf, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 280, 20, 60));

        ra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                raActionPerformed(evt);
            }
        });
        getContentPane().add(ra, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 240, 50, 20));

        r.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rActionPerformed(evt);
            }
        });
        getContentPane().add(r, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 300, 40, 20));

        e.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eActionPerformed(evt);
            }
        });
        getContentPane().add(e, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 260, 20, 50));

        d.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dActionPerformed(evt);
            }
        });
        getContentPane().add(d, new org.netbeans.lib.awtextra.AbsoluteConstraints(363, 340, 60, 10));

        dis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                disActionPerformed(evt);
            }
        });
        getContentPane().add(dis, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, 20, 20));

        biblioteca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bibliotecaActionPerformed(evt);
            }
        });
        getContentPane().add(biblioteca, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 160, 30, 40));

        n.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nActionPerformed(evt);
            }
        });
        getContentPane().add(n, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 360, 10, 30));

        o.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oActionPerformed(evt);
            }
        });
        getContentPane().add(o, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 360, 20, 40));

        jList1.setForeground(new java.awt.Color(0, 102, 204));
        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "FcoSalazar", "Uruguay", "LasEncinas", "Montevideo" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, 100, 50));

        jLabel2.setBackground(new java.awt.Color(0, 102, 204));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("¿A dode estas?");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 140, 30));

        googleMaps.setBackground(new java.awt.Color(0, 102, 204));
        googleMaps.setForeground(new java.awt.Color(255, 255, 255));
        googleMaps.setText("Mapa google");
        googleMaps.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                googleMapsActionPerformed(evt);
            }
        });
        getContentPane().add(googleMaps, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, -1, -1));
        getContentPane().add(lugarE, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 20, 20));
        getContentPane().add(lugarM, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, 20, 20));
        getContentPane().add(lugarS, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 490, 20, 20));
        getContentPane().add(lugarU, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 130, 20, 20));

        seleccion.setBackground(new java.awt.Color(0, 102, 204));
        seleccion.setForeground(new java.awt.Color(255, 255, 255));
        seleccion.setText("Seleccionar");
        seleccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleccionActionPerformed(evt);
            }
        });
        getContentPane().add(seleccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 80, -1, -1));

        validacion.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        validacion.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(validacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 80, 190, 20));

        jLabel3.setBackground(new java.awt.Color(0, 102, 204));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Vichoh\\Documents\\NetBeansProjects\\help.me.find.it.2.0\\src\\help\\me\\find\\it\\pkg2\\pkg0\\mapas\\lugar.jpg")); // NOI18N
        jLabel3.setText(": Lugar donde te encuentras ");
        jLabel3.setOpaque(true);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 460, 190, 30));

        jLabel4.setBackground(new java.awt.Color(0, 102, 204));
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Vichoh\\Documents\\NetBeansProjects\\help.me.find.it.2.0\\src\\help\\me\\find\\it\\pkg2\\pkg0\\mapas\\lugarllegada.jpg")); // NOI18N
        jLabel4.setText(" :Lugar donde quieres llegar");
        jLabel4.setOpaque(true);
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 490, 190, 30));

        ayuda.setIcon(new javax.swing.ImageIcon("C:\\Users\\Vichoh\\Documents\\NetBeansProjects\\help.me.find.it.2.0\\src\\help\\me\\find\\it\\pkg2\\pkg0\\mapas\\ayuda.jpg")); // NOI18N
        ayuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ayudaActionPerformed(evt);
            }
        });
        getContentPane().add(ayuda, new org.netbeans.lib.awtextra.AbsoluteConstraints(643, 10, 20, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Vichoh\\Documents\\NetBeansProjects\\help.me.find.it.2.0\\src\\help\\me\\find\\it\\pkg2\\pkg0\\mapas\\mapaBueno.jpg")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 730, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void googleMapsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_googleMapsActionPerformed
        MapaUfroGoogleMpas mapaG = new MapaUfroGoogleMpas();
        mapaG.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_googleMapsActionPerformed

    private void seleccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seleccionActionPerformed
        String valida = jList1.getSelectedValue();
        if(valida == null){
            validacion.setText("Porfavor seleccione una opcion");
        }else{
            validacion.setText(null);
        ImageIcon imagenLugar = new ImageIcon("/C:\\Users\\Vichoh\\Documents\\NetBeansProjects\\help.me.find.it.2.0\\src\\help\\me\\find\\it\\pkg2\\pkg0\\mapas/lugar.jpg");
        lugarU.setIcon(null); 
        lugarE.setIcon(null);
        lugarM.setIcon(null);
        lugarS.setIcon(null);
        if (jList1.getSelectedValue().equalsIgnoreCase("Uruguay")) {
            lugarU.setIcon(imagenLugar);     
        }if(jList1.getSelectedValue().equalsIgnoreCase("FcoSalazar")){
            lugarS.setIcon(imagenLugar); 
        }if (jList1.getSelectedValue().equalsIgnoreCase("LasEncinas")) {
            lugarE.setIcon(imagenLugar); 
        }if (jList1.getSelectedValue().equalsIgnoreCase("Montevideo")) {
            lugarM.setIcon(imagenLugar); 
        }
        }
    }//GEN-LAST:event_seleccionActionPerformed

    private void disActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_disActionPerformed
        String valida = jList1.getSelectedValue();
        if(valida == null){
            JOptionPane.showMessageDialog(null, "Porfavor elija una opcion y presiona el boton Seleccionar");
        }else{
            
        String nombreEdificio = "Dis";
        RecorridoEdificios recorridoDis = new RecorridoEdificios();
        recorridoDis.asignaImagen(recorridoDis.nombreMapaEdifico(jList1.getSelectedValue(), nombreEdificio));
        recorridoDis.setVisible(true);
        }
    }//GEN-LAST:event_disActionPerformed

    private void rActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rActionPerformed
        String valida = jList1.getSelectedValue();
        if(valida == null){
            JOptionPane.showMessageDialog(null, "Porfavor elija una opcion y presiona el boton Seleccionar");
        }else{
        String nombreEdificio = "R";
        RecorridoEdificios recorridoR = new RecorridoEdificios();
        recorridoR.asignaImagen(recorridoR.nombreMapaEdifico(jList1.getSelectedValue(), nombreEdificio));
        recorridoR.setVisible(true);
        }
    }//GEN-LAST:event_rActionPerformed

    private void raActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_raActionPerformed
        String valida = jList1.getSelectedValue();
        if(valida == null){
            JOptionPane.showMessageDialog(null, "Porfavor elija una opcion y presiona el boton Seleccionar");
        }else{
        String nombreEdificio = "RA";
        RecorridoEdificios recorridoRA = new RecorridoEdificios();
        recorridoRA.asignaImagen(recorridoRA.nombreMapaEdifico(jList1.getSelectedValue(), nombreEdificio));
        recorridoRA.setVisible(true);
        }
    }//GEN-LAST:event_raActionPerformed

    private void bibliotecaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bibliotecaActionPerformed
        String valida = jList1.getSelectedValue();
        if(valida == null){
            JOptionPane.showMessageDialog(null, "Porfavor elija una opcion y presiona el boton Seleccionar");
        }else{JOptionPane.showMessageDialog(null, "Cargando...");}
    }//GEN-LAST:event_bibliotecaActionPerformed

    private void nActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nActionPerformed
        String valida = jList1.getSelectedValue();
        if(valida == null){
            JOptionPane.showMessageDialog(null, "Porfavor elija una opcion y presiona el boton Seleccionar");
        }else{JOptionPane.showMessageDialog(null, "Cargando...");}
    }//GEN-LAST:event_nActionPerformed

    private void oActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oActionPerformed
        String valida = jList1.getSelectedValue();
        if(valida == null){
            JOptionPane.showMessageDialog(null, "Porfavor elija una opcion y presiona el boton Seleccionar");
        }else{JOptionPane.showMessageDialog(null, "Cargando...");}
    }//GEN-LAST:event_oActionPerformed

    private void eActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eActionPerformed
        String valida = jList1.getSelectedValue();
        if(valida == null){
            JOptionPane.showMessageDialog(null, "Porfavor elija una opcion y presiona el boton Seleccionar");
        }else{JOptionPane.showMessageDialog(null, "Cargando...");}
    }//GEN-LAST:event_eActionPerformed

    private void dActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dActionPerformed
        String valida = jList1.getSelectedValue();
        if(valida == null){
            JOptionPane.showMessageDialog(null, "Porfavor elija una opcion y presiona el boton Seleccionar");
        }else{JOptionPane.showMessageDialog(null, "Cargando...");}
    }//GEN-LAST:event_dActionPerformed

    private void electricaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_electricaActionPerformed
        String valida = jList1.getSelectedValue();
        if(valida == null){
            JOptionPane.showMessageDialog(null, "Porfavor elija una opcion y presiona el boton Seleccionar");
        }else{JOptionPane.showMessageDialog(null, "Cargando...");}
    }//GEN-LAST:event_electricaActionPerformed

    private void dcfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dcfActionPerformed
        String valida = jList1.getSelectedValue();
        if(valida == null){
            JOptionPane.showMessageDialog(null, "Porfavor elija una opcion y presiona el boton Seleccionar");
            
        }else{
        JOptionPane.showMessageDialog(null, "Cargando...");}
    }//GEN-LAST:event_dcfActionPerformed

    private void ayudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ayudaActionPerformed
      JOptionPane.showMessageDialog(null, "1° selecione una opcion \n2° presione el boton seleccionar"
              + " \n3° presione sobre la imagen el edificio al cual desea dirigirse");
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
            java.util.logging.Logger.getLogger(UfroMapa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UfroMapa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UfroMapa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UfroMapa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UfroMapa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ayuda;
    private javax.swing.JButton biblioteca;
    private javax.swing.JButton d;
    private javax.swing.JButton dcf;
    private javax.swing.JButton dis;
    private javax.swing.JButton e;
    private javax.swing.JButton electrica;
    private javax.swing.JButton googleMaps;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton lugarE;
    private javax.swing.JButton lugarM;
    private javax.swing.JButton lugarS;
    private javax.swing.JButton lugarU;
    private javax.swing.JButton n;
    private javax.swing.JButton o;
    private javax.swing.JButton r;
    private javax.swing.JButton ra;
    private javax.swing.JButton seleccion;
    private javax.swing.JLabel validacion;
    // End of variables declaration//GEN-END:variables
}
