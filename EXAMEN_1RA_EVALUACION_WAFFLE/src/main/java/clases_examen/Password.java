
package clases_examen;


public class Password {
    
    private String usuario;
    private String contraseña;
    
    public Password(){
        usuario = "";
        contraseña = "";
    }
    
    public Password(String pass, String user){
        usuario = user;
        contraseña = pass;
    }
    
    public void setUsuario(String val){
        usuario = val;
    }
    public void setContraseña(String val){
        usuario = val;
    }
    
    public void verificarAcceso(String contra, String usua){
        boolean acceso = false;
        
        if(usuario == usua && contraseña == contra){
            acceso = true;
        }
        
        System.out.println("Acceso: " +acceso);
    }
    
}
    
        
   

    
    

