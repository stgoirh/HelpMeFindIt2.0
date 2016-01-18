/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package help.me.find.it.pkg2.pkg0;

import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Vichoh
 */
public class MicrosDisponiblesJFrame extends javax.swing.JFrame {
    
    
    private ArrayList <Micros> microsDisponiblesFinal = new ArrayList();
    private ArrayList <Micros> microsDisponiblesSubidas = new ArrayList();
    private ArrayList <Micros> micros = new ArrayList();
    private String parteNombreMapa;
   
    public MicrosDisponiblesJFrame() {
        initComponents();
        jLabel1.setOpaque(true);
        jLabel2.setOpaque(true);
        jLabel3.setOpaque(true);
        Micros microUno = new Micros("Linea8variante", 0);
        Micros microDos = new Micros("Linea2variante", 1);
        Micros microTres = new Micros ("Linea1troncal",2);
        Micros microCuatro = new Micros ("Linea7troncal",3);
        micros.add(microUno);
        micros.add(microDos);
        micros.add(microTres);
        micros.add(microCuatro);
       
    }
    
    public void validacionComparacion(){
         if (microsDisponiblesFinal.isEmpty()) {
            JFrameSubidasDestinos ventana = new JFrameSubidasDestinos();
            ventana.setVisible(true);
         
            this.setVisible(false);
            
        }
    }

    public void setParteNombreMapa(String parteNombreMapa) {
        this.parteNombreMapa = parteNombreMapa;
    }

    
    
    public String nombreMapa(){
        System.out.println(microsDisponibles.getSelectedValue());
        System.out.println(this.parteNombreMapa);
        return "/C:\\Users\\Vichoh\\Documents\\NetBeansProjects\\help.me.find.it.2.0\\src\\help\\me\\find\\it\\pkg2\\pkg0\\mapas/"
                +microsDisponibles.getSelectedValue()+this.parteNombreMapa+".jpg";
        
    }
    
    
   public void comparacionSubidas(String eleccionSubida){
       for (int i = 0; i < micros.size(); i++) {
           for (int j = 0; j < micros.get(i).getParadareosSubidas().size(); j++) {
               System.out.println(eleccionSubida);
               System.out.println(micros.get(i).getParadareosSubidas().get(j));
               if(eleccionSubida.equalsIgnoreCase(micros.get(i).getParadareosSubidas().get(j))){
                   System.out.println("guardado");
                   microsDisponiblesSubidas.add(micros.get(i));
                   j = micros.get(i).getParadareosSubidas().size();
               }
           }
       }
   }
    
     public void comparacionDestino(String eleccionDestino){
       for (int i = 0; i < microsDisponiblesSubidas.size(); i++) {
           System.out.println(eleccionDestino);
           System.out.println(microsDisponiblesSubidas.get(i).getDestino());
               if(eleccionDestino.equalsIgnoreCase(microsDisponiblesSubidas.get(i).getDestino())){
                   System.out.println("guardado");
                    microsDisponiblesFinal.add(microsDisponiblesSubidas.get(i));
                   
               }
           }
        
         
      for (int i = 0; i < microsDisponiblesFinal.size(); i++) {
             System.out.println(microsDisponiblesFinal.get(i).getLinea());
       }
     }
     
     public ArrayList <String> asignacionLineas (){
        ArrayList <String> array = new ArrayList();
        for (int i = 0; i < microsDisponiblesFinal.size(); i++) {
             array.add(microsDisponiblesFinal.get(i).getLinea());
             //System.out.println(microsDisponiblesFinal.get(i).getLinea());
             
             }
        
        return array;
     }
     
     public DefaultListModel transformarArraylist(ArrayList <String> arrays){
        //Crear un objeto DefaultListModel
        DefaultListModel listModel = new DefaultListModel();
        //Recorrer el contenido del ArrayList
        for(int i=0; i<arrays.size(); i++) {
        //Añadir cada elemento del ArrayList en el modelo de la lista
            listModel.add(i, arrays.get(i));
        }
            
        return  listModel;
    }
     public void llenarJlist(){
         microsDisponibles.setModel(transformarArraylist(asignacionLineas()));
     }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        microsDisponibles = new javax.swing.JList<>();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        mapa = new javax.swing.JLabel();
        botonMapa = new javax.swing.JButton();
        volverMenu = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 102, 204));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Micros Disponibles");

        microsDisponibles.setForeground(new java.awt.Color(0, 102, 204));
        jScrollPane1.setViewportView(microsDisponibles);

        jLabel2.setBackground(new java.awt.Color(0, 102, 204));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Informacion");

        mapa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mapa.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 204), 2, true));
        mapa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mapaMouseClicked(evt);
            }
        });

        botonMapa.setBackground(new java.awt.Color(0, 102, 204));
        botonMapa.setForeground(new java.awt.Color(255, 255, 255));
        botonMapa.setText("Mapa");
        botonMapa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMapaActionPerformed(evt);
            }
        });

        volverMenu.setBackground(new java.awt.Color(0, 102, 204));
        volverMenu.setForeground(new java.awt.Color(255, 255, 255));
        volverMenu.setText("Menu");
        volverMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverMenuActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(0, 102, 204));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Vichoh\\Documents\\NetBeansProjects\\help.me.find.it.2.0\\src\\help\\me\\find\\it\\pkg2\\pkg0\\mapas\\53.jpg")); // NOI18N
        jLabel3.setText("                   HELP ME FIND IT !");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(botonMapa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(volverMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(mapa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mapa, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonMapa)
                    .addComponent(volverMenu))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonMapaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMapaActionPerformed
        
        String valida2 = microsDisponibles.getSelectedValue();
        if( valida2 == null){
            JOptionPane.showMessageDialog(null, "Porfavor Marque una opcion");
        }else{
            
        System.out.println(nombreMapa());
        ImageIcon imagen = new ImageIcon(nombreMapa());
        mapa.setIcon(imagen);
        }
    }//GEN-LAST:event_botonMapaActionPerformed

    private void volverMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverMenuActionPerformed
        Menu menu = new Menu();
        menu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_volverMenuActionPerformed

    private void mapaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mapaMouseClicked
        ZoomMapa zoom = new ZoomMapa();
        zoom.asignaImagen(zoom.nombreMapaZoom(microsDisponibles.getSelectedValue(), parteNombreMapa));
        zoom.setVisible(true);
        
    }//GEN-LAST:event_mapaMouseClicked

    
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
            java.util.logging.Logger.getLogger(MicrosDisponiblesJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MicrosDisponiblesJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MicrosDisponiblesJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MicrosDisponiblesJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MicrosDisponiblesJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonMapa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel mapa;
    private javax.swing.JList<String> microsDisponibles;
    private javax.swing.JButton volverMenu;
    // End of variables declaration//GEN-END:variables
}
