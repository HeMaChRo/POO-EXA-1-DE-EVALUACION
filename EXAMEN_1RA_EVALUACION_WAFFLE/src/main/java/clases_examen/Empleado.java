package clases_examen;

/**
 *
 * @author KarimAP
 */
public class Empleado {

    private String Nombre;
    private String Apellido;
    private String Direccion;
    private int Ano_de_ingreso;
    private double Salario;

    public Empleado() {
        Nombre = "";
        Apellido = "";
        Direccion = "";
        Salario = 0.0;
    }

    public Empleado(String Nom, String Ape, String Dire, int Ano, double Sala) {
        Nombre = Nom;
        Apellido = Ape;
        Direccion = Dire;
        Ano_de_ingreso = Ano;
        Salario = Sala;

    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String valor) {
        Nombre = valor;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String valor) {
        Apellido = valor;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String valor) {
        Direccion = valor;
    }

    public int getAno_de_ingreso() {
        return Ano_de_ingreso;
    }

    public void setAno_de_ingreso(int valor) {
        Ano_de_ingreso = valor;
    }

    public double getSalario() {
        return Salario;
    }

    public void setSalario(double valor) {
        Salario = valor;
    }

    public void CalcularVacaciones() {
        
        int expLab, AñoAc = 2023, vacaciones = 0;        
        expLab = AñoAc - Ano_de_ingreso;
        int R = expLab / 5;       
        
        if(expLab > 0){
            vacaciones = 6;           
            if(expLab > 0 && expLab < 5){
               vacaciones = 6 + ((2 * expLab)-2);
            }if(expLab >= 5){
                vacaciones = 6 + ((2 * expLab)-2) + (2 * R);
            }  
        }
        
        System.out.println("Dias de vacaciones: "+vacaciones);
   
    }

    public void ImprimirDatos() {
        System.out.println("Nombre: " + Nombre);
        System.out.println("Apellido: " + Apellido);
        System.out.println("Direccion: " + Direccion);
        System.out.println("Salario: " + Salario);
        CalcularVacaciones();

    }
}
