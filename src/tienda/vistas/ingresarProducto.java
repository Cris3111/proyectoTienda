/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tienda.vistas;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Time;
import java.util.Date;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import tienda.conexionBD.conexion;

/**
 *
 * @author Cristian
 */
public class ingresarProducto extends javax.swing.JFrame {

    /**
     * Creates new form ingresarProducto
     */
    public ingresarProducto() {
        initComponents();
        this.getListaFamiliaProducto();
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
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cantidad = new javax.swing.JTextField();
        costo = new javax.swing.JTextField();
        proveedor = new javax.swing.JTextField();
        nit = new javax.swing.JTextField();
        telefono = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        observaciones = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        ComboBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Cantidad De Compra:");

        jLabel2.setText("Costo de compra:");

        jLabel3.setText("Nombre Proveedor:");

        jLabel4.setText("Nit:");

        jLabel5.setText("Telefono:");

        jLabel6.setText("Observaciones:");

        cantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantidadActionPerformed(evt);
            }
        });

        costo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                costoActionPerformed(evt);
            }
        });

        proveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proveedorActionPerformed(evt);
            }
        });

        observaciones.setColumns(20);
        observaciones.setRows(5);
        jScrollPane1.setViewportView(observaciones);

        jButton1.setText("jButton1");

        jButton2.setText("Guardar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel7.setText("Producto a Comprar:");

        ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addComponent(jButton1)
                .addGap(61, 61, 61)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(proveedor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                                        .addComponent(nit, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(telefono, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(cantidad)
                                        .addComponent(costo))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(93, 93, 93))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jLabel7)
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(costo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(proveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(nit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void costoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_costoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_costoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int codigoFamilia = 0;
        int idProducto = 0;
        
        //Date fechaEntrada = new Date();
        Date fechaEntrada = new java.util.Date(); // Crear una java.util.Date
            // Convertir java.util.Date a java.sql.Date
        java.sql.Date sqlFechaEntrada = new java.sql.Date(fechaEntrada.getTime());
         Time horaEntrada = Time.valueOf("00:00:00");
        try{
            conexion conexion = new conexion();
            conexion.conectar();
            String consultaProducto = " select p.ID_Producto id , p.ID_Familia_Producto idFamilia  from productos p where p.ID_Producto = ? ";
            
             PreparedStatement statementSelect;
             statementSelect = conexion.conectar().prepareStatement (consultaProducto);
             
            
            
            String codigoProducto = ComboBox.getSelectedItem().toString();
             Pattern patron = Pattern.compile("\\d+");
             Matcher matcher = patron.matcher(codigoProducto);
            String numeroExtraido = "";
        if (matcher.find()) {
            numeroExtraido = matcher.group();
            System.out.println("Numero extraido: " + numeroExtraido);
        } else {
            System.out.println("Numero no encontrado en la cadena.");
        }
         statementSelect.setString(1, numeroExtraido);
         ResultSet consulta = statementSelect.executeQuery();
         while(consulta.next()){
            idProducto = consulta.getInt("id");
            codigoFamilia= consulta.getInt("idFamilia");
            System.out.println(" ID FAMILIA: "+ consulta.getInt("idFamilia"));
         }
          
         String query = " INSERT INTO tienda.entradas_producto\n" +
                        "( Correlativo_por_lote_de_entrada, ID_Familia_producto, ID_producto, Cantidad_de_compra,\n" +
                        "Valor_por_compra_entrada, Fecha_de_movimiento_entrada, Hora_de_movimiento_entrada, `Nombre del proveedor_entrada`,\n" +
                        "NIT_proveedor_entrada, Telefono_proveedor_entrada, Observaciones_entrada)\n" +
                        "VALUES( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) ";
         
         
          PreparedStatement statement;
             statement = conexion.conectar().prepareStatement (query);
             
             statement.setString(1,"LOTE 2");
             statement.setInt(2,codigoFamilia);
             statement.setInt(3,idProducto);
             statement.setInt(4, Integer.parseInt(cantidad.getText()));
             statement.setFloat(5, Integer.parseInt(costo.getText()));
             statement.setDate(6, sqlFechaEntrada);
             statement.setTime(7, horaEntrada);
             statement.setString(8,proveedor.getText());
             statement.setString(9,nit.getText());
             statement.setString(10,telefono.getText());
             statement.setString(11,observaciones.getText());
            
             int res = statement.executeUpdate();
             if(res>0){ 
                 this.limpiarDatos();
                JOptionPane.showMessageDialog(null, "Carga Satisfactoria");
                conexion.cerrarConexion();
            }else{
                 this.limpiarDatos();
                JOptionPane.showMessageDialog(null, "ERROR AL GUARDAR LA INFORMACION");
                conexion.cerrarConexion();
            }
         
        }catch(Exception error){
            this.limpiarDatos();
            System.out.println(error);
        }
        
        
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void cantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cantidadActionPerformed

    private void proveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_proveedorActionPerformed

     public void getListaFamiliaProducto(){
       String query = "select  p.ID_Producto id, p.Descripcion_Producto nombre from productos p";
        try{
             //creo la conexion
            conexion conexion = new conexion();
            //conexion.conectar();
            PreparedStatement statement;
             statement= conexion.conectar().prepareStatement (query);
           
            ResultSet consulta = statement.executeQuery();
            //DataTable dataTable = new DataTable();
            Vector<String> datos = new Vector<>();
            //JComboBox<String> comboBox = new JComboBox<>(datos);
            while(consulta.next()){
                    consulta.getInt("id");
                    consulta.getString("nombre");
                 datos.add(consulta.getInt("id")+"-"+consulta.getString("nombre"));
            }
            ComboBox.setModel(new DefaultComboBoxModel<>(datos));
       }catch(Exception error){
            JOptionPane.showMessageDialog(null,error);
         }
       
   }
     
       // metodo limpiar 
        public void limpiarDatos(){ 
        cantidad.setText("");
        costo.setText("");
        proveedor.setText("");
        nit.setText("");
        telefono.setText("");   
        observaciones.setText("");
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
            java.util.logging.Logger.getLogger(ingresarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ingresarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ingresarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ingresarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ingresarProducto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBox;
    private javax.swing.JTextField cantidad;
    private javax.swing.JTextField costo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nit;
    private javax.swing.JTextArea observaciones;
    private javax.swing.JTextField proveedor;
    private javax.swing.JTextField telefono;
    // End of variables declaration//GEN-END:variables
}
