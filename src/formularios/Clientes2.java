/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;

import basedatos.ConexionMySql;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author mgacosta
 */ 
public class Clientes2 extends javax.swing.JFrame {
    basedatos.Resultado result;
    ConexionMySql mysql = new ConexionMySql();
    DefaultTableModel modelo;
    String accion;
    String Id_Actualizar;
    /**
     * Creates new form Clientes2
     */
    public Clientes2() {
        initComponents();
         accion="nuevo";
        CargarClientes("");
    }
 void CargarClientes(String Valor){
    String[] titulos = {"ID","Nombre","Apellido 1","Apellido 2","Telefono"};
    String[] registro = new String[5];
    modelo= new DefaultTableModel(null,titulos);
    basedatos.Clientes Cli=new basedatos.Clientes();
    Cli.SetNombre(Valor);
    result= mysql.BuscarPorNombre(Cli);              
     if (result.GetOk())  {
        try {
            ResultSet rs=result.GetDatos();
            while (rs.next())
            {
                   registro[0]=rs.getString("ID");
                   registro[1]=rs.getString("Nombre");
                   registro[2]=rs.getString("Apellido1");
                   registro[3]=rs.getString("Apellido2");
                   registro[4]=rs.getString("Telefono");
                   
                   modelo.addRow(registro);
            }  
            tblClientes.setModel(modelo);       
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,  ex, 
                         "Error - Buscar", 
                         JOptionPane.INFORMATION_MESSAGE);
        }
     }    
     else{
         JOptionPane.showMessageDialog(this,  result.GetMensaje(), 
                         "Error - Buscar", 
                         JOptionPane.INFORMATION_MESSAGE);
     }
}
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        mnuEditar = new javax.swing.JMenuItem();
        mnuEliminar = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtApellido1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtApellido2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        cmdEditar = new javax.swing.JButton();
        cmdGuardar = new javax.swing.JButton();
        cmdCancelar = new javax.swing.JButton();
        cmdEliminar = new javax.swing.JButton();
        cmdSalir = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblClientes = new javax.swing.JTable();
        txtBuscar = new javax.swing.JTextField();
        cmdBuscar = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        mnuEditar.setText("Editar");
        mnuEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuEditarActionPerformed(evt);
            }
        });
        jPopupMenu1.add(mnuEditar);

        mnuEliminar.setText("Eliminar");
        mnuEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuEliminarActionPerformed(evt);
            }
        });
        jPopupMenu1.add(mnuEliminar);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos del Cliente"));

        jLabel1.setText("Nombre");

        jLabel2.setText("1 Apellido");

        jLabel3.setText("2 Apellido");

        jLabel4.setText("Telefono");

        cmdEditar.setText("Nuevo");
        cmdEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdEditarActionPerformed(evt);
            }
        });

        cmdGuardar.setText("Guardar");
        cmdGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdGuardarActionPerformed(evt);
            }
        });

        cmdCancelar.setText("Cancelar");

        cmdEliminar.setText("Eliminar");

        cmdSalir.setText("Salir");
        cmdSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(22, 22, 22)
                                    .addComponent(txtTelefono)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtApellido2, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                                    .addComponent(txtApellido1)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cmdEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmdGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmdCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmdEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmdSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtApellido1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtApellido2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdEditar)
                    .addComponent(cmdGuardar)
                    .addComponent(cmdCancelar)
                    .addComponent(cmdEliminar)
                    .addComponent(cmdSalir))
                .addGap(0, 6, Short.MAX_VALUE))
        );

        jLabel5.setText("Nombre");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Busqueda"));

        tblClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblClientes.setComponentPopupMenu(jPopupMenu1);
        jScrollPane2.setViewportView(tblClientes);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                .addContainerGap())
        );

        cmdBuscar.setText("Buscar");
        cmdBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmdBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(19, 19, 19))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdGuardarActionPerformed
        // TODO add your handling code here:
       
        basedatos.Clientes Cli=new basedatos.Clientes("",
                                    txtNombre.getText(),
                                    txtApellido1.getText(),
                                    txtApellido2.getText(),
                                    txtTelefono.getText());
        if (accion.equals("nuevo")){
            Cli.SetID("");
        }
        else{
             Cli.SetID(Id_Actualizar);
        }
        result=mysql.Guardar(Cli);
        if (result.GetOk())  {
            JOptionPane.showMessageDialog(this,  result.GetFilasAfectadas() + 
                            " Registro(s) fue guardado correctamente.", "Guardar", 
                            JOptionPane.INFORMATION_MESSAGE);
            CargarClientes("");
        }
        else{
            JOptionPane.showMessageDialog(this,  result.GetMensaje(), 
                                "Error - Guardar", 
                                JOptionPane.INFORMATION_MESSAGE);
        }
       
        
//////////     ConexionMySql mysql = new ConexionMySql();
//////////     Connection cn=mysql.Conectar();
//////////         
//////////     String sSQL="";
//////////     String mensaje="";
//////////     String Nombre,Apellido1,Apellido2,Telefono;
//////////     //Id=this.txtID.getText();
//////////     Nombre=this.txtNombre.getText();
//////////     Apellido1=this.txtApellido1.getText();
//////////     Apellido2=this.txtApellido2.getText();
//////////     Telefono=this.txtTelefono.getText();
//////////          
//////////    if (accion.equals("nuevo")){
//////////          sSQL="INSERT INTO Clientes(Nombre,Apellido1,Apellido2,Telefono) VALUES (?,?,?,?)";
//////////          mensaje="Los datos se han insertado de forma correcta.";
//////////     }
//////////     else{
//////////          sSQL="UPDATE Clientes SET Nombre = ?,Apellido1=?,Apellido2=?,Telefono=? WHERE ID=" + Id_Actualizar;
//////////          mensaje="Los datos se han actualizado de forma correcta.";
//////////     }
//////////    
//////////        try {
//////////            PreparedStatement pst=cn.prepareStatement(sSQL);
//////////            pst.setString(1, Nombre);
//////////            pst.setString(2, Apellido1);
//////////            pst.setString(3, Apellido2);
//////////            pst.setString(4, Telefono);
//////////            int n = pst.executeUpdate();
//////////            if (n>0){
//////////                JOptionPane.showMessageDialog(this,  mensaje, "Insertar", JOptionPane.INFORMATION_MESSAGE);
//////////                 CargarClientes("");
//////////            }
//////////        } catch (SQLException ex) {
//////////           JOptionPane.showMessageDialog(this,  ex, "Insertar", JOptionPane.INFORMATION_MESSAGE);
//////////        }
//////////     
        
        
        
    }//GEN-LAST:event_cmdGuardarActionPerformed

    private void cmdSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdSalirActionPerformed
        // TODO add your handling code here:
         this.dispose();
    }//GEN-LAST:event_cmdSalirActionPerformed

    private void mnuEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuEditarActionPerformed
        // TODO add your handling code here:
                
        accion="editar";
        int filaSele;
        String ID;
        try{
           filaSele=this.tblClientes.getSelectedRow(); 
           if (filaSele==-1){
               JOptionPane.showMessageDialog(this, "Seleccione una fila ", "Grid", JOptionPane.INFORMATION_MESSAGE);
           }
           else{
              // accion="modificar";
               modelo= (DefaultTableModel) this.tblClientes.getModel();
               ID = (String) modelo.getValueAt(filaSele, 0);
               Id_Actualizar=ID;
             //  habilitar();
               BuscarClientesID(ID);
              // habilitar();
           }
        }
          catch (Exception e) 
        {
            JOptionPane.showMessageDialog(this, e, "Grid", JOptionPane.INFORMATION_MESSAGE);
        }     
    }//GEN-LAST:event_mnuEditarActionPerformed

    private void cmdEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdEditarActionPerformed
        // TODO add your handling code here:
        
     accion="nuevo";
     txtNombre.setText("");
     txtApellido1.setText("");
     txtApellido2.setText("");
     txtTelefono.setText("");
        
    }//GEN-LAST:event_cmdEditarActionPerformed

    private void mnuEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuEliminarActionPerformed
        // TODO add your handling code here:
           
        int filaSele;
        String ID;
        try{
            
           filaSele=this.tblClientes.getSelectedRow(); 
           if (filaSele==-1){
               JOptionPane.showMessageDialog(this, "Seleccione una fila ", "Grid", JOptionPane.INFORMATION_MESSAGE);
           }
           else{
               accion="borrar";
               modelo= (DefaultTableModel) this.tblClientes.getModel();
               ID = (String) modelo.getValueAt(filaSele, 0);
               basedatos.Clientes Cli=new basedatos.Clientes();
               Cli.SetID(ID);
              
              result= mysql.Borrar(Cli);              
              if (result.GetOk())  {
                    JOptionPane.showMessageDialog(this,  result.GetFilasAfectadas() + 
                            " Registro(s) fue borrado correctamente.", "Borrar", 
                            JOptionPane.INFORMATION_MESSAGE);
                    CargarClientes("");
              }
             else{
                    JOptionPane.showMessageDialog(this,  result.GetMensaje(), 
                                "Error - Borrar", 
                                JOptionPane.INFORMATION_MESSAGE);
              }
               
               
               
////////               ConexionMySql mysql = new ConexionMySql();
////////               Connection cn=mysql.Conectar();
////////               String sSQL="DELETE FROM Clientes WHERE ID ="+ ID;
////////              try {
////////                    Statement st=cn.createStatement();
////////                    int delete= st.executeUpdate(sSQL);
////////                    if (delete==1){
////////                        CargarClientes("");
////////                        JOptionPane.showMessageDialog(this,  "El elemento se borro correcamente.", "Borrar", JOptionPane.INFORMATION_MESSAGE);   
////////                   }
////////             } 
////////            catch (SQLException ex) {
////////                    JOptionPane.showMessageDialog(this,  ex, "Eliminar", JOptionPane.INFORMATION_MESSAGE);   
////////            }
           Id_Actualizar="";
         }
        }
          catch (Exception e) 
        {
            JOptionPane.showMessageDialog(this,  e, "Borrar", JOptionPane.INFORMATION_MESSAGE);   
        }
         
        
    }//GEN-LAST:event_mnuEliminarActionPerformed

    private void cmdBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdBuscarActionPerformed
        // TODO add your handling code here:
         CargarClientes(this.txtBuscar.getText());
    }//GEN-LAST:event_cmdBuscarActionPerformed
void BuscarClientesID(String ID){
    
    
     basedatos.Clientes Cli=new basedatos.Clientes();
     Cli.SetID(ID);
              
     result= mysql.BuscarPorID(Cli);              
     if (result.GetOk())  {
        try {
            while (result.GetDatos().next())
            {
                   //ID=rs.getString("ID");
                  this.txtNombre.setText(result.GetDatos().getString("Nombre"));
                  this.txtApellido1.setText(result.GetDatos().getString("Apellido1"));
                  this.txtApellido2.setText(result.GetDatos().getString("Apellido2"));
                  this.txtTelefono.setText(result.GetDatos().getString("Telefono"));
             }
        } catch (SQLException ex) {
            Logger.getLogger(Clientes2.class.getName()).log(Level.SEVERE, null, ex);
        }
           
            
     }    
     
     else{
         JOptionPane.showMessageDialog(this,  result.GetMensaje(), 
                         "Error - Buscar", 
                         JOptionPane.INFORMATION_MESSAGE);
     }
}   
    
    
//    ConexionMySql mysql = new ConexionMySql();
//    Connection cn=mysql.Conectar();
//    String sSQL="";
//    String Nombre="",Apellido1="",Apellido2="",Telefono="";
//    sSQL="Select * FROM Clientes WHERE ID ="+ ID;
    
//        try {
//            Statement st=cn.createStatement();
//            ResultSet rs= st.executeQuery(sSQL);
//             while (rs.next())
//            {
//             //ID=rs.getString("ID");
//             Nombre=rs.getString("Nombre");
//             Apellido1=rs.getString("Apellido1");
//             Apellido2=rs.getString("Apellido2");
//             Telefono=rs.getString("Telefono");
//            }
//            this.txtNombre.setText(Nombre);
//            this.txtApellido1.setText(Apellido1);
//            this.txtApellido2.setText(Apellido2);
//            this.txtTelefono.setText(Telefono);
//            
//        } catch (SQLException ex) {
//         JOptionPane.showMessageDialog(this,  ex, "Buscar", JOptionPane.INFORMATION_MESSAGE);   
//        }
 // Id_Actualizar=vID;

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
            java.util.logging.Logger.getLogger(Clientes2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Clientes2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Clientes2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Clientes2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Clientes2().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdBuscar;
    private javax.swing.JButton cmdCancelar;
    private javax.swing.JButton cmdEditar;
    private javax.swing.JButton cmdEliminar;
    private javax.swing.JButton cmdGuardar;
    private javax.swing.JButton cmdSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JMenuItem mnuEditar;
    private javax.swing.JMenuItem mnuEliminar;
    private javax.swing.JTable tblClientes;
    private javax.swing.JTextField txtApellido1;
    private javax.swing.JTextField txtApellido2;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
