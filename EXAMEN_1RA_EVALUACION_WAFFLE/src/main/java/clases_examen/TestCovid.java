

package clases_examen;

public class TestCovid {
    
    private int edad;
    private boolean enfermedadCronica;
    private int peso;
    private double estatura;
    private double IMC;
    
    
    public int getEdad(){
        return edad;
    }    
    public void setEdad(int ed){
        edad = ed;
    }
    
    public boolean getEnfermedad(){
        return enfermedadCronica;
    }    
    public void setEnfermedad(boolean ef){
        enfermedadCronica = ef;
    }
    
    public int getPeso(){
        return peso;
    }    
    public void setPeso(int pes){
        peso = pes;
    }
    
    public double getEstatura(){
        return estatura;
    }    
    public void setEstatura(double est){
        estatura = est;
    }
    public void setIMC(double val){
        IMC = val;
    }
    
    public void calcularPersonaRiesgo(){
        
        boolean riesgo = false;        
                
        if(edad >= 65){
            riesgo = true;
        }
        if(enfermedadCronica == true){
            riesgo = true;
        }        
                
        if(IMC>30){
            riesgo = true;
        }
        
        if(riesgo == true){
            System.out.println("PERSONA DE RIESGO\n");
        }else{
            System.out.println("PERSONA SIN RIESGO\n");
        }
        
        
    }
    
  /*
    Agregar un método calcularPersonaRiesgo, que nos devuelva una cadena
    “PERSONA DE RIESGO”, SI LA PERSONA TIENE RIESGOS POR COVID, o
    “PERSONA SIN RIESGO”, en caso contrario. (15 PUNTOS)
    iv. Una persona es de riesgo elevado por COVID si TIENE CUALQUIERA de las
    siguientes condiciones:
        • Su edad es mayor o igual a 65 años
        • Tiene una enfermedad crónica
        • Su índice de Masa Corporal (IMC) es mayor a 30 (obesidad). El IMC
        se calcula:
    Peso en kg
    Estatura en metros

    v. Debe crear un método privado en la clase calcularIMC, que le permita
    hacer la operación del IMC, y que se use dentro del método 
    */
    
        
}
