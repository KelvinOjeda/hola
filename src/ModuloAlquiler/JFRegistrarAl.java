
package ModuloAlquiler;

import Fuentes.Conexion;
import Fuentes.Factura;
import Fuentes.Fecha;
import Fuentes.Maquina;
import JFCliente.JFRegistrarCliente;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class JFRegistrarAl extends javax.swing.JFrame {
   private String cliente;
   private int i=0;
   private final Conexion conexion ;
   private DefaultTableModel tabla;
   private ArrayList<Maquina> maquinas= new ArrayList<Maquina>();
   private DateTimeFormatter dtf;
   private Factura factura = new Factura();
   
    public JFRegistrarAl() {
        initComponents();
        //Se crea la Conexion con la base de Datos
        conexion =  new Conexion("Equimeta", "123");
        conexion.crearConexion();
        //Se deshabilitan los campos que se llenan automaticamente
        jTFUnitario.enable(false);
        jTFEntrega.enable(false);
        jTFIVA.enable(false);
        jTFTotal.enable(false);
        jTFPrestamo.enable(false);
        //Se inicializa los ConboBox
        actualizarComboCliente();
        limpiarDatos();
        this.setLocationRelativeTo(this);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLProducto = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jBNuevoCliente = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jCod = new javax.swing.JLabel();
        jLNom = new javax.swing.JLabel();
        jLPre = new javax.swing.JLabel();
        jTFUnitario = new javax.swing.JTextField();
        jBIngresar = new javax.swing.JButton();
        jBEliminar = new javax.swing.JButton();
        jComboBoxCodigoMaquina = new javax.swing.JComboBox<>();
        jComboBoxIDCliente = new javax.swing.JComboBox<>();
        jCBNombre = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablaRegistrar = new javax.swing.JTable();
        jLabel50 = new javax.swing.JLabel();
        jTFIVA = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTFTotal = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTFPrestamo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jCBGarantia = new javax.swing.JComboBox<>();
        jTFEntrega = new javax.swing.JTextField();
        jTFDias = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jBAlquiler = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("REGISTRAR ALQUILER");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setToolTipText("");

        jLProducto.setText("PRODUCTO:");

        jLabel5.setText("Número de identificación del Cliente:");

        jBNuevoCliente.setText("Nuevo Cliente");
        jBNuevoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNuevoClienteActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setText("REGISTRAR ALQUILER");

        jLabel7.setText("DATOS:");

        jCod.setText("Cod. Máquina:");

        jLNom.setText("Nombre:");

        jLPre.setText("Precio Unitario:");

        jTFUnitario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFUnitarioActionPerformed(evt);
            }
        });

        jBIngresar.setText("Ingresar");
        jBIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBIngresarActionPerformed(evt);
            }
        });

        jBEliminar.setText("Cancelar");
        jBEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarActionPerformed(evt);
            }
        });

        jComboBoxCodigoMaquina.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opción" }));
        jComboBoxCodigoMaquina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCodigoMaquinaActionPerformed(evt);
            }
        });

        jComboBoxIDCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jCBNombre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una Opción", "Sapo", "Compactador", "Vibrador", "Taladro" }));
        jCBNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBNombreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxIDCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jCod)
                                    .addComponent(jLNom))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jComboBoxCodigoMaquina, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jCBNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jBIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBNuevoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLProducto)
                                    .addComponent(jLabel7)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(392, 392, 392)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jBEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLPre)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTFUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(169, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(286, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addGap(272, 272, 272))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel12)
                .addGap(12, 12, 12)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jBNuevoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxIDCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLProducto)
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLNom)
                    .addComponent(jCBNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLPre)
                    .addComponent(jTFUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxCodigoMaquina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCod))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
        );

        jTablaRegistrar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Código", "Cantidad:", "Nombre:", "Valor Unitario:", "Valor total"
            }
        ));
        jScrollPane1.setViewportView(jTablaRegistrar);

        jLabel50.setText("IVA 12%:");

        jTFIVA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFIVAActionPerformed(evt);
            }
        });

        jLabel1.setText("Fecha del Alquiler:");

        jTFTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFTotalActionPerformed(evt);
            }
        });

        jLabel2.setText("Fecha de Entrega:");

        jLabel10.setText("Total:");

        jTFPrestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFPrestamoActionPerformed(evt);
            }
        });

        jLabel3.setText("Días del Alquiler");

        jCBGarantia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cheque", "Efectivo", "Letra de cambio" }));
        jCBGarantia.setToolTipText("");
        jCBGarantia.setName("Seleccione Garantia"); // NOI18N
        jCBGarantia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBGarantiaActionPerformed(evt);
            }
        });

        jTFEntrega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFEntregaActionPerformed(evt);
            }
        });

        jTFDias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFDiasActionPerformed(evt);
            }
        });

        jLabel6.setText("Seleccione el tipo de garantia:");

        jBAlquiler.setText("Realizar Alquiler y Factura");
        jBAlquiler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAlquilerActionPerformed(evt);
            }
        });

        jMenu1.setText("Menú");

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        jMenuItem4.setText("Consultar Alquiler");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuItem1.setText("Menú Principal");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 754, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42))
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel6))
                        .addGap(339, 339, 339)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFDias, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel50)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTFIVA, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTFPrestamo)
                                    .addComponent(jCBGarantia, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(42, 42, 42)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)))))
                    .addComponent(jBAlquiler, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTFIVA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10)
                        .addComponent(jTFTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel50))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jCBGarantia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jTFDias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jTFPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(jBAlquiler, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBNuevoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNuevoClienteActionPerformed
        /* Permite el cambio de JFrame al modulo Cliente*/
      JFRegistrarCliente registrarCliente = new  JFRegistrarCliente();   
      this.setVisible(false);
      registrarCliente.setVisible(true);
      registrarCliente.toFront();
      
    }//GEN-LAST:event_jBNuevoClienteActionPerformed

    private void jTFUnitarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFUnitarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFUnitarioActionPerformed

    private void jBIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBIngresarActionPerformed
        
        //Se obtienen los valores Seleccionados en el ComboBox
        cliente= jComboBoxIDCliente.getSelectedItem().toString();
        String id_maquina = jComboBoxCodigoMaquina.getSelectedItem().toString();
        //Se verifica si se han selecionado valores en los campos cantidad-cliente-maquina
        if( jComboBoxIDCliente.getSelectedIndex() != 0
                && jComboBoxCodigoMaquina.getSelectedIndex() != 0) {               
            //Se crea una lista con los campos de cada Maquina
            Maquina maquina= new Maquina(id_maquina); 
            maquina.setConexion(conexion);
            //Se obtiene el nombre de la Maquina y su precio
            maquina.obtenerMaquinaCompleto();
            //Se ingresa una maquina en una lista de maquinas
            if (verificarMaquinas(maquina)){
                maquinas.add(maquina);
                //se llena la tabla
                llenarTabla(maquina);
                actualizarComboMaquina();
            }
            else 
                JOptionPane.showMessageDialog(null, "Maquina ya ingresada", null, JOptionPane.ERROR_MESSAGE);
            
            factura.setMaquinas(maquinas);
            // se calcula el total ,subtotal e impuesto
            factura.calcularSubTotal();
            factura.calcularImpuesto();
            factura.calcularTotal();
            System.out.println(factura.getSubtotal());
            //se muestra el valor del IVA
            jTFIVA.setText(factura.getImpuesto()+"");
            //Se muestra el Valor total
            jTFTotal.setText(factura.getValorTotal()+"");
            
            
            
        }
        else {
            JOptionPane.showMessageDialog(null, "Los datos seleccionados son incorrectos.", null, JOptionPane.ERROR_MESSAGE);
            limpiarDatos();
        }
        dtf= DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        jTFPrestamo.setText(dtf.format(LocalDateTime.now()));
        

    }//GEN-LAST:event_jBIngresarActionPerformed

    private void jBEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarActionPerformed
        //Se inicializa todos los campos
        limpiarDatos();
        
    }//GEN-LAST:event_jBEliminarActionPerformed

    private void jTFIVAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFIVAActionPerformed
        
    }//GEN-LAST:event_jTFIVAActionPerformed

    private void jTFTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFTotalActionPerformed

    private void jTFPrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFPrestamoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFPrestamoActionPerformed

    private void jCBGarantiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBGarantiaActionPerformed

    }//GEN-LAST:event_jCBGarantiaActionPerformed

    private void jTFEntregaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFEntregaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFEntregaActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        //Se abre el JFConsultar
        JFConsultarAl jfc = new JFConsultarAl();
        jfc.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
      //Se abre el Menu Principal de Alquiler
        JFMenuAlquiler jfAlquiler = new JFMenuAlquiler();
        jfAlquiler.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jComboBoxCodigoMaquinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCodigoMaquinaActionPerformed
        if (this.jComboBoxCodigoMaquina.getSelectedIndex() != 0 && this.jComboBoxCodigoMaquina.getSelectedItem()!=null){
        String maquina = jComboBoxCodigoMaquina.getSelectedItem().toString();
        //Se obtiene el nombre de la Maquina y su precio
        String nombreMaquina = conexion.obtenerRegistro("Maquina", "Codigo="+maquina, "NOMBRE__MAQUINA");
        String precio = conexion.obtenerRegistro("Maquina", "Codigo="+maquina,"PRECIODEALQUILER");
        //se muestra los datos obtenidos en los campos nombre y preciounitario
        jTFUnitario.setText(precio);       
            
        }
          
      
    }//GEN-LAST:event_jComboBoxCodigoMaquinaActionPerformed

    private void jBAlquilerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAlquilerActionPerformed
       Fecha fechaEntrega=new Fecha(jTFEntrega.getText());
        if (maquinas!=null ){
            if( isNumeric(this.jTFDias.getText())){    
                    factura.setFactura(this.cliente, jCBGarantia.getSelectedItem().toString(),Integer.parseInt(this.jTFDias.getText()));
                    factura.setConexion(conexion);
                    factura.insertarFactura(); 
                    factura.insertarFacturaDetalles();
                    factura.obtenerNumeroFactura();
                    if(conexion.existeRegistro("Factura", "NUMERO_FACTURA="+"'"+factura.getNumeroFactura()+"'")){
                        JFfactura jffactura = new JFfactura();
                        jffactura.setFactura(factura.generarFactura(),(DefaultTableModel)jTablaRegistrar.getModel());
                        jffactura.setVisible(true);
                        jTFEntrega.setText(conexion.sumaFecha(jTFDias.getText()));
                    }else{
                         JOptionPane.showMessageDialog(null, "Ingreso incorrecto, intentelo de nuevo", null, JOptionPane.ERROR_MESSAGE);
               
                    }
            }else{
               JOptionPane.showMessageDialog(null, "Días de alquiler inválido \n ingrese un número entero", null, JOptionPane.ERROR_MESSAGE); 
            }
        }
                    
                    
                    
                
        else 
                JOptionPane.showMessageDialog(null,"No se ha ingresado Maquinas" , null, JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_jBAlquilerActionPerformed

    private void jCBNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBNombreActionPerformed
        actualizarComboMaquina();
    }//GEN-LAST:event_jCBNombreActionPerformed

    private void jTFDiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFDiasActionPerformed
       if( !isNumeric(this.jTFDias.getText())){ 
           JOptionPane.showMessageDialog(null, "Días de alquiler inválido \n ingrese un número entero", null, JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jTFDiasActionPerformed
/*Método para actualizar la tabla:*/
     
    public void llenarTabla(Maquina maquina){
        int j;
        j=0;
        tabla = (DefaultTableModel) jTablaRegistrar.getModel();
        tabla.setRowCount(i+1);
        String cabezera[]= {"Código","Nombre","Valor Unitario"};
        tabla.setColumnIdentifiers(cabezera);
        ArrayList<String> campos= new ArrayList<String>();
        campos.add(maquina.getCodigo());
        campos.add(maquina.getNombre_maquina());
        campos.add(maquina.getPrecio()+"");      
        /* Se asigna a un objeto tabla los registros que se van ingresando */
        for(String aux:campos){
                tabla.setValueAt(aux,i, j++);
        }      
        i++;
        jTablaRegistrar.setModel(tabla);
        
       
                     

    }
    /* Metodo para inicializar los combos*/
     public void actualizarComboCliente() {
        /*Variables locales:*/
        
        int contadorCliente =0;
        
        /* Actualizamos el ComboBox de Cliente */
        jComboBoxIDCliente.removeAllItems();
        jComboBoxIDCliente.addItem("Seleccione una opción");
        
        ArrayList<String> comboCliente = conexion.obtenerItems("Cliente", "ID_Cliente");
        for(String auxiliar: comboCliente) {
            jComboBoxIDCliente.insertItemAt(auxiliar, ++contadorCliente);
        }
    }
     public void actualizarComboMaquina(){
         int contadorMaquina = 0;
        /*Actualizamos el ComboBox de Maquina:*/
        jComboBoxCodigoMaquina.removeAllItems();
        jComboBoxCodigoMaquina.addItem("Seleccione una opción");
        String condicion = "estado='Disponible' and nombre_maquina='"+this.jCBNombre.getSelectedItem().toString()+"'";
        ArrayList<String> comboMaquina = conexion.obtenerItemsCondicon("Maquina", "Codigo","estado='Disponible' and NOMBRE__MAQUINA='"+this.jCBNombre.getSelectedItem().toString()+"'");
        for(String auxiliar: comboMaquina) {
            jComboBoxCodigoMaquina.insertItemAt(auxiliar, ++contadorMaquina);
        }
     }
     /* Metodo para inicializar todos los datos*/
     public void limpiarDatos(){

         jTFUnitario.setText("");
         jTFIVA.setText("");
         jTFTotal.setText("");
         jTFPrestamo.setText("");
         jTFDias.setText("");
         jTFEntrega.setText("");
         jComboBoxCodigoMaquina.setSelectedIndex(0);
         jComboBoxIDCliente.setSelectedIndex(0);
         tabla= new DefaultTableModel(0,0);
        String cabezera[]= {"Código","Nombre","Valor Unitario"};
        tabla.setColumnIdentifiers(cabezera);
        maquinas=new ArrayList<>();
        jTablaRegistrar.setModel(tabla);
        this.i=0;
        this.dtf=null;
        
     }
     public boolean verificarMaquinas(Maquina maquina){
         boolean aux = true;
         for (Maquina maquina1 : maquinas) {
             System.out.println(!maquina1.getCodigo().equals(maquina.getCodigo()));    
             System.out.println(maquina1.getCodigo()+" "+maquina.getCodigo());
             aux=aux && !maquina1.getCodigo().equals(maquina.getCodigo());
            }
         return aux;
     }
     private static boolean isNumeric(String cadena){
	try {
		Integer.parseInt(cadena);
                if(Integer.parseInt(cadena)>0)
                    return true;
                else 
                    return false;
	} catch (NumberFormatException nfe){
		return false;
	}
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
            java.util.logging.Logger.getLogger(JFRegistrarAl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFRegistrarAl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFRegistrarAl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFRegistrarAl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFRegistrarAl().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAlquiler;
    private javax.swing.JButton jBEliminar;
    private javax.swing.JButton jBIngresar;
    private javax.swing.JButton jBNuevoCliente;
    private javax.swing.JComboBox<String> jCBGarantia;
    private javax.swing.JComboBox<String> jCBNombre;
    private javax.swing.JLabel jCod;
    private javax.swing.JComboBox<String> jComboBoxCodigoMaquina;
    private javax.swing.JComboBox<String> jComboBoxIDCliente;
    private javax.swing.JLabel jLNom;
    private javax.swing.JLabel jLPre;
    private javax.swing.JLabel jLProducto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFDias;
    private javax.swing.JTextField jTFEntrega;
    private javax.swing.JTextField jTFIVA;
    private javax.swing.JTextField jTFPrestamo;
    private javax.swing.JTextField jTFTotal;
    private javax.swing.JTextField jTFUnitario;
    private javax.swing.JTable jTablaRegistrar;
    // End of variables declaration//GEN-END:variables
}
