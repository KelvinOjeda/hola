/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JFInventarioK;


import Fuentes.Conexion;
import Fuentes.Maquina;
import JFEmpleado.*;
import JFrameLogin.JFIngreso;
import Módulo.JFModuloAdmi;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class JFRegistrarMaquina extends javax.swing.JFrame {

    Maquina maquina;
    private final Conexion conexion ;
    public JFRegistrarMaquina() {
        conexion =  new Conexion("Equimeta", "123");
        conexion.crearConexion();
        initComponents();
        this.jTFEstado.enable(false);
        this.jTFEstado.setText("Disponible");
        actualizarCombo();
        this.setLocationRelativeTo(null);

    }
    


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        JTFCodigoMaquina = new javax.swing.JTextField();
        jTPeso = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTFDimensiones = new javax.swing.JTextField();
        jBRegistrar = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jBNuevo = new javax.swing.JButton();
        jTFEstado = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTFPrecio = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jCBEmpleado = new javax.swing.JComboBox<>();
        jCBNombreDeMaquina = new javax.swing.JComboBox<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MÓDULO INVENTARIO");
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setToolTipText("");

        jLabel2.setText("Peso:");

        jLabel4.setText("Nombre de Máquina:");

        jLabel5.setText("Código de máquina:");

        jLabel6.setText("Estado:");

        JTFCodigoMaquina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFCodigoMaquinaActionPerformed(evt);
            }
        });

        jLabel9.setText("Dimensiones:");

        jBRegistrar.setText("REGISTRAR");
        jBRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBRegistrarActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setText("REGISTRAR MÁQUINA");

        jBNuevo.setText("NUEVO");
        jBNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNuevoActionPerformed(evt);
            }
        });

        jLabel13.setText("Precio:");

        jLabel14.setText("Empleado Responsable");

        jCBEmpleado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jCBNombreDeMaquina.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una Opción", "Sapo", "Compactado", "Vibrador", "Taladro" }));
        jCBNombreDeMaquina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBNombreDeMaquinaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(94, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addComponent(jLabel9)
                            .addComponent(jLabel4)
                            .addComponent(jLabel13)
                            .addComponent(jLabel6))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JTFCodigoMaquina)
                            .addComponent(jTPeso)
                            .addComponent(jTFDimensiones)
                            .addComponent(jTFPrecio)
                            .addComponent(jTFEstado, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                            .addComponent(jCBNombreDeMaquina, javax.swing.GroupLayout.Alignment.TRAILING, 0, 188, Short.MAX_VALUE)))
                    .addComponent(jLabel12))
                .addGap(272, 272, 272))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(jBRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addComponent(jBNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(jLabel14)
                        .addGap(18, 18, 18)
                        .addComponent(jCBEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTFCodigoMaquina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jTFDimensiones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jTFEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jCBNombreDeMaquina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jTFPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jCBEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(88, 88, 88)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jMenu1.setText("Menú");

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        jMenuItem2.setText("Actualizar Máquina");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        jMenuItem3.setText("Listar Máquina");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(71, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
       JFListarMaquina jfConsultar = new JFListarMaquina();
        jfConsultar.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void JTFCodigoMaquinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFCodigoMaquinaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFCodigoMaquinaActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        JFActualizarMaquina jfActualizar=new JFActualizarMaquina();
        jfActualizar.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jBRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRegistrarActionPerformed
        maquina= new Maquina();
        maquina.setDimesiones(this.jTFDimensiones.getText());
        maquina.setCodigo(this.JTFCodigoMaquina.getText());
        maquina.setEstado(this.jTFEstado.getText());
        maquina.setConexion(conexion);
        maquina.setNombre_maquina(this.jCBNombreDeMaquina.getSelectedItem().toString());
        
        maquina.setId_empleadoresponsable(this.jCBEmpleado.getSelectedItem().toString());
            if(!maquina.validarCodigo()){
                if (maquina.validarDimesiones() ){
                    if( this.jCBNombreDeMaquina.getSelectedIndex()!=0 ){
                        if(maquina.isFloat(this.jTFPrecio.getText())){
                            if(maquina.isFloat(this.jTPeso.getText()) ){
                                
                                    if(this.jCBEmpleado.getSelectedIndex()!=0){
                                        maquina.setPrecio(Float.parseFloat(this.jTFPrecio.getText()));
                                        maquina.setPeso(Float.parseFloat(this.jTPeso.getText()));            
                                        maquina.insertarMaquina();
                                        JOptionPane.showMessageDialog(rootPane, "Se ha registrado la máquina con éxito");
                                    }else{
                                        JOptionPane.showMessageDialog(null, "Seleccione un empleado", null, JOptionPane.ERROR_MESSAGE);
                                        jCBEmpleado.setSelectedIndex(0);
                                    }                            
                            }else{
                                JOptionPane.showMessageDialog(null, "Ingrese un valor válido en Peso", null, JOptionPane.ERROR_MESSAGE);
                                jTPeso.setText("");
                            }
                        }else{
                                JOptionPane.showMessageDialog(null, "Ingrese un valor válido en Precio", null, JOptionPane.ERROR_MESSAGE);
                                jTFPrecio.setText("");
                             }
                    }else{
                                JOptionPane.showMessageDialog(null, "Ingrese un Nombre válido", null, JOptionPane.ERROR_MESSAGE);
                                jCBNombreDeMaquina.setSelectedIndex(0);
                            }
                }else{
                   JOptionPane.showMessageDialog(null, "Ingrese dimesiones válidas", null, JOptionPane.ERROR_MESSAGE);
                   jTFDimensiones.setText("");
                }
            }else{
                JOptionPane.showMessageDialog(null, "Ingrese Código válido", null, JOptionPane.ERROR_MESSAGE);
                   jTFDimensiones.setText("");
            }
        
    }//GEN-LAST:event_jBRegistrarActionPerformed

    private void jBNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNuevoActionPerformed
        limpiarDatos();
    }//GEN-LAST:event_jBNuevoActionPerformed

    private void jCBNombreDeMaquinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBNombreDeMaquinaActionPerformed

    }//GEN-LAST:event_jCBNombreDeMaquinaActionPerformed
/* Metodo para inicializar los combos*/
     public void actualizarCombo() {
        /*Variables locales:*/
        int contadorEmpleado = 0;

        
        /*Actualizamos el ComboBox de Empleado:*/
        jCBEmpleado.removeAllItems();
        jCBEmpleado.addItem("Seleccione una opción");
        
        ArrayList<String> comboMaquina = this.conexion.obtenerItems("EMPLEADO", "NUMCEDULA");
        for(String auxiliar: comboMaquina) {
            jCBEmpleado.insertItemAt(auxiliar, ++contadorEmpleado);
        }
    }
     /* Metodo para inicializar todos los datos*/
     public void limpiarDatos(){
         jCBNombreDeMaquina.setSelectedIndex(0);
         jTFDimensiones.setText("");
         jTPeso.setText("");
         JTFCodigoMaquina.setText("");
         jCBEmpleado.setSelectedIndex(0);
         jTFPrecio.setText("");
     }
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
            java.util.logging.Logger.getLogger(JFRegistrarMaquina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFRegistrarMaquina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFRegistrarMaquina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFRegistrarMaquina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFRegistrarMaquina().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField JTFCodigoMaquina;
    private javax.swing.JButton jBNuevo;
    private javax.swing.JButton jBRegistrar;
    private javax.swing.JComboBox<String> jCBEmpleado;
    private javax.swing.JComboBox<String> jCBNombreDeMaquina;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTFDimensiones;
    private javax.swing.JTextField jTFEstado;
    private javax.swing.JTextField jTFPrecio;
    private javax.swing.JTextField jTPeso;
    // End of variables declaration//GEN-END:variables
}
