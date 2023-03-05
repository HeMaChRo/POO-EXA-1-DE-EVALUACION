
package com.mycompany.examen_1ra_evaluacion_waffle;

import clases_examen.DatosIntegrantes;
import clases_examen.FIBONACCI;
import clases_examen.Password;
import clases_examen.Pelicula;
import clases_examen.TestCovid;
import clases_examen.calcularIMC;


public class EXAMEN_1RA_EVALUACION_WAFFLE {

    public static void main(String[] args) {
        
        //DATOS DEL EQUIPO
        
        DatosIntegrantes.ImprimirDatosEquipo();
        DatosIntegrantes.problemasResueltos();
        
        //Contraseña
        
        System.out.println("\nClase contraseña: \n");
        
        Password pass1 = new Password("1234", "Fulano");
        pass1.verificarAcceso("1235", "Fulano");
        pass1.verificarAcceso("1234", "Fulano");
        
        //Pelicula
        
        System.out.println("\nClase Pelicula: \n");
        
        Pelicula peli1 = new Pelicula();
        peli1.setEstudio("DreamWorks");
        peli1.setTitulo("El gato con botas 2");
        peli1.setRating(6);
        peli1.evaluarEdad();
        
        //Test COVID & IMC
        
        TestCovid test1 = new TestCovid();
        test1.setEdad(55);
        test1.setEnfermedad(false);
        test1.setPeso(85);
        test1.setEstatura(1.62);
        calcularIMC imc1 = new calcularIMC();        
        imc1.setEstat(test1.getEstatura());
        imc1.setPeso(test1.getPeso());
        test1.setIMC(imc1.getIMC());
        
        /*Héctor Chavira: Esta fue mi interpretación acerca de un 
        metodo privado calcular Imc, espero haber entendido la instruccion 
        porque se logra el objetivo pero no es necesario otra clase extra*/ 
        
        System.out.print("\nTest de covid: ");
        test1.calcularPersonaRiesgo();
        
        //FIBONACCI
        
        FIBONACCI fibo1 = new FIBONACCI();      
        fibo1.imprimirFIBONACCI();
        fibo1.setN(10);
        fibo1.setA2(2);
        fibo1.imprimirFIBONACCI();
        
        FIBONACCI fibo2 = new FIBONACCI(2, 5, 6);
        fibo2.imprimirFIBONACCI();
        
        
        
    }
}
