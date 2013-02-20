/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package basedatos;

/**
 *
 * @author mgacosta
 */
public class Clientes {
    private String ID;
    private String Nombre;
    private String Apellido1;
    private String Apellido2;
    private String Telefono;
    
     public Clientes(){
         
     }
             
    public Clientes(String ID,String Nombre,String Apellido1,
                    String Apellido2, String Telefono){
        
        this.ID=ID;
        this.Nombre=Nombre;
        this.Apellido1= Apellido1;
        this.Apellido2=Apellido2;
        this.Telefono=Telefono;
    }
    
    public void SetID(String ID){this.ID=ID;}
    public void SetNombre(String Nombre){this.Nombre=Nombre;}
    public void SetApellido1(String Apellido1){this.Apellido1=Apellido1;}
    public void SetApellido2(String Apellido2){this.Apellido2=Apellido2;}
    public void SetTelefono(String Telefono){this.Telefono=Telefono;}
    
    public String GetID(){return (ID);}
    public String GetNombre(){return (Nombre);}
    public String GetApellido1(){return (Apellido1);}
    public String GetApellido2(){return (Apellido2);}
    public String GetTelefono(){return (Telefono);}
}
