/*
 * 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package basedatos;

import java.sql.ResultSet;

/**
 *
 * @author mgacosta
 */
public class Resultado {
    private boolean Ok;
    private int FilasAfectadas;
    private String Mensaje;
    private ResultSet Datos;
    
          
    
    public void SetOk(boolean Ok){this.Ok=Ok;}
    public void SetFilasAfectadas(int FilasAfectadas){this.FilasAfectadas=FilasAfectadas;}
    public void SetMensaje(String Mensaje){this.Mensaje=Mensaje;}
    public void SetDatos(ResultSet Datos){this.Datos=Datos;}
    
    
    public void Resultado(){};   
    public boolean GetOk(){return (Ok);}
    public String GetMensaje(){return (Mensaje);}
    public int GetFilasAfectadas(){return (FilasAfectadas);}
    public ResultSet GetDatos(){return (Datos);}
    
    
}
