
package clases_examen;


public class calcularIMC {
    
    private double IMC;
    private int peso;
    private double estatura;
    
    private double calcularImc(){
        IMC = peso /(estatura * estatura);
        return IMC;
        
    }
    
    public double getIMC(){
        return calcularImc();
    }
    
    public void setPeso(int val){
        peso = val;
    }  
    public void setEstat(double val){
        estatura = val;
    }  
    
}
