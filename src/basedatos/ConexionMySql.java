/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package basedatos;
import basedatos.Clientes;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ConexionMySql {
    public String db="BDMoises";
    public String url="jdbc:mysql://69.51.64.80/"+db;
    public String user="root";
    public String pass="";
    public ConexionMySql(){
    }
    public Connection Conectar(){
        Connection link = null;
        try
        {
            Class.forName("org.gjt.mm.mysql.Driver");       
            link = DriverManager.getConnection(this.url, this.user, this.pass);
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
            
        }
          return link;  
    }
    
    public Resultado Guardar(Clientes Cli){
          
     Resultado result=new Resultado();   
     ConexionMySql mysql = new ConexionMySql();
     Connection cn=mysql.Conectar();
         
     String sSQL="";
     //String mensaje="";
     String ID,Nombre,Apellido1,Apellido2,Telefono;
     //Id=this.txtID.getText();
     ID=Cli.GetID();
     Nombre=Cli.GetNombre();
     Apellido1=Cli.GetApellido1();
     Apellido2=Cli.GetApellido2();
     Telefono=Cli.GetTelefono();
        //  Cli.GetID=""
     
    if ( ID.length()==0){
          sSQL="INSERT INTO Clientes(Nombre,Apellido1,Apellido2,Telefono) VALUES (?,?,?,?)";
          //mensaje="Los datos se han insertado de forma correcta.";
     }
     else{
          sSQL="UPDATE Clientes SET Nombre = ?,Apellido1=?,Apellido2=?,Telefono=? WHERE ID=" +ID;
          //mensaje="Los datos se han actualizado de forma correcta.";
     }
    
        try {
            PreparedStatement pst=cn.prepareStatement(sSQL);
            pst.setString(1, Nombre);
            pst.setString(2, Apellido1);
            pst.setString(3, Apellido2);
            pst.setString(4, Telefono);
            int n = pst.executeUpdate();
            if (n>0){
            //    JOptionPane.showMessageDialog(this,  mensaje, "Insertar", JOptionPane.INFORMATION_MESSAGE);
                result.SetOk(true);
                result.SetFilasAfectadas(n);
            }
        } catch (SQLException ex) {
          // JOptionPane.showMessageDialog(this,  ex, "Insertar", JOptionPane.INFORMATION_MESSAGE);
            result.SetOk(false);
            result.SetMensaje(ex.getMessage());
        }
       
     return (result);
    }
    
    public Resultado Borrar(Clientes Cli){
      Resultado result=new Resultado();                             
      ConexionMySql mysql = new ConexionMySql();
      Connection cn=mysql.Conectar();
      String sSQL="DELETE FROM Clientes WHERE ID ="+ Cli.GetID();
      try {
          Statement st=cn.createStatement();
          int delete= st.executeUpdate(sSQL);
          if (delete==1){
            // JOptionPane.showMessageDialog(this,  "El elemento se borro correcamente.", "Borrar", JOptionPane.INFORMATION_MESSAGE);   
              result.SetOk(true);
              result.SetFilasAfectadas(delete);
         }
     } 
    catch (SQLException ex) {
         result.SetOk(false);
         result.SetMensaje(ex.getMessage());
           // JOptionPane.showMessageDialog(this,  ex, "Eliminar", JOptionPane.INFORMATION_MESSAGE);   
    }

   Cli.SetID("");
   return result;           
         
    }
    
  public  Resultado BuscarPorID(Clientes Cli){
    Resultado result=new Resultado();
    ConexionMySql mysql = new ConexionMySql();
    Connection cn=mysql.Conectar();
    String sSQL="Select * FROM Clientes WHERE ID ="+ Cli.GetID();
    
        try {
            Statement st=cn.createStatement();
            ResultSet rs= st.executeQuery(sSQL);
            result.SetOk(true);
            result.SetDatos(rs);
            
        } catch (SQLException ex) {
            result.SetOk(false);
            result.SetMensaje(ex.toString());
        }        
    return result;            
}
    
  public  Resultado BuscarPorNombre(Clientes Cli){
    Resultado result=new Resultado();
    ConexionMySql mysql = new ConexionMySql();
    Connection cn=mysql.Conectar();
    String sSQL="Select * FROM Clientes WHERE Nombre LIKE '%"+ Cli.GetNombre()+ "%'";
    
        try {
            Statement st=cn.createStatement();
            ResultSet rs= st.executeQuery(sSQL);
            result.SetOk(true);
            result.SetDatos(rs);
            
        } catch (SQLException ex) {
            result.SetOk(false);
            result.SetMensaje(ex.toString());
        }        
    return result;            
}
}
