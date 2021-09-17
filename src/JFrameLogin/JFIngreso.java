/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JFrameLogin;

import Fuentes.Conexion;
import Fuentes.Usuario;
import Módulo.JFModuloAdmi;
import Módulo.JFModuloGerente;
import javax.swing.JOptionPane;

/**
 *
 * @author KelvinOjeda
 */
public class JFIngreso extends javax.swing.JFrame {
    JFModuloAdmi jfmoduloAdmi;
    JFModuloGerente jfmoduloGenente;
    private Conexion conexion ;
    
    public JFIngreso() {
        conexion =  new Conexion("Equimeta", "123");
        conexion.crearConexion();
        initComponents();
        this.setLocationRelativeTo(null);
        this.jfmoduloAdmi = new JFModuloAdmi();
        this.jfmoduloGenente= new JFModuloGerente();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTFUserName = new javax.swing.JTextField();
        jCBCargo = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jTFPassword = new javax.swing.JPasswordField();
        jBIngreso = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SIG-EQUIM");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Username:");

        jLabel2.setText("Password:");

        jCBCargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opción", "Administrador", "Gerente general" }));
        jCBCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBCargoActionPerformed(evt);
            }
        });

        jLabel3.setText("Cargo:");

        jBIngreso.setText("Ingreso");
        jBIngreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBIngresoActionPerformed(evt);
            }
        });

        jBSalir.setText("Salir");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jCBCargo, 0, 172, Short.MAX_VALUE)
                            .addComponent(jTFUserName)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(36, 36, 36)
                        .addComponent(jTFPassword)))
                .addContainerGap(66, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jBIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCBCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTFUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTFPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jBSalir, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(jBIngreso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(23, 23, 23))
        );

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logn.png"))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("INGRESO DE CREDENCIALES");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 49, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(jLabel4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addGap(26, 26, 26)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(73, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBIngresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBIngresoActionPerformed

        switch(this.jCBCargo.getSelectedIndex()){
            case 0:{
                JOptionPane.showMessageDialog(null, "Debe seleccionar un cargo", "Error", JOptionPane.ERROR_MESSAGE);
                break;
            }
            case 1:{
                if(conexion.existeRegistro("Clave", "NUMCEDULA='"+this.jTFUserName.getText()+"'")){
                    String usuario = conexion.obtenerRegistro("CLAVE c, EMPLEADO e", "c.NUMCEDULA = e.NUMCEDULA and e.NUMCEDULA = '"+jTFUserName.getText()+"'", "e.NUMCEDULA");
                    String clave = conexion.obtenerRegistro("CLAVE c ,EMPLEADO e", "c.NUMCEDULA = e.NUMCEDULA and c.NUMCEDULA ='"+jTFUserName.getText()+"'", "c.CLAVE");
                    String cargo = conexion.obtenerRegistro("CLAVE c ,EMPLEADO e", "c.NUMCEDULA = e.NUMCEDULA and c.NUMCEDULA ='"+jTFUserName.getText()+"'", "e.CARGO");
                    //System.out.println(usuario+" "+ clave +" "+ cargo);
                    if(usuario.compareTo(this.jTFUserName.getText())==0 && cargo.compareTo("Administrador")==0 && clave.compareTo(this.jTFPassword.getText())==0){
                        this.jfmoduloAdmi.setVisible(true);
                    this.setVisible(false);
                    }else{
                    JOptionPane.showMessageDialog(null, "Credenciales incorrectas","Error",JOptionPane.ERROR_MESSAGE);
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "el usuario no existe","Error",JOptionPane.ERROR_MESSAGE);
                    }
                break;
            }
            case 2:{
                String usuario1 = conexion.obtenerRegistro("CLAVE c ,EMPLEADO e", "c.NUMCEDULA = e.NUMCEDULA and e.NUMCEDULA ='"+jTFUserName.getText()+"'", "e.NUMCEDULA");
                String clave1 = conexion.obtenerRegistro("CLAVE c ,EMPLEADO e", "c.NUMCEDULA = e.NUMCEDULA and c.NUMCEDULA ='"+jTFUserName.getText()+"'", "c.CLAVE");
                String cargo1 = conexion.obtenerRegistro("CLAVE c ,EMPLEADO e", "c.NUMCEDULA = e.NUMCEDULA and c.NUMCEDULA ='"+jTFUserName.getText()+"'", "e.CARGO");
                if(cargo1.compareTo("Gerente general")==0 && clave1.compareTo(this.jTFPassword.getText())==0 && usuario1.compareTo(this.jTFUserName.getText())==0){
                    this.jfmoduloGenente.setVisible(true);
                this.setVisible(false);
                }else{
                 JOptionPane.showMessageDialog(null, "Credenciales incorrectas","Error",JOptionPane.ERROR_MESSAGE);
                }
                    
                break;
            }
        }
      
    }//GEN-LAST:event_jBIngresoActionPerformed

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
       System.exit(0);
    }//GEN-LAST:event_jBSalirActionPerformed

    private void jCBCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBCargoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBCargoActionPerformed

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
            java.util.logging.Logger.getLogger(JFIngreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFIngreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFIngreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFIngreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFIngreso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBIngreso;
    private javax.swing.JButton jBSalir;
    private javax.swing.JComboBox<String> jCBCargo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jTFPassword;
    private javax.swing.JTextField jTFUserName;
    // End of variables declaration//GEN-END:variables
}
