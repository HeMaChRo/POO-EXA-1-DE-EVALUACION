
package clases_examen;

import java.util.Scanner;

/**
 *
 * @author campa
 */
public class Pelicula {
    private String título;
    private String estudio;
    private int rating;
    
    public String getTitulo(){
        return título;  
    }
    public void setTitulo(String titulo){
        título = titulo;  
    }
    public String getEstudio(){
        return estudio;  
    }
    public void setEstudio(String estud){
        estudio = estud;  
    }
    public int getRating(){
        return rating;  
    }
    public void setRating(int ratin){
        rating = ratin;  
    }
    public void imprimirDatos(){
        System.out.println("Título: " + título);
        System.out.println("Estudio: " + estudio);
        System.out.println("Rating:" + rating);
    }
    public void evaluarEdad(){
        int edad = 0;
        Scanner pato = new Scanner(System.in);
        System.out.println("Introduzca su edad");
        edad = pato.nextInt();
        if(rating <= edad){
            System.out.println("Puedes ver la pelicula");
        }else{
            System.out.println("No puedes ver la pelicula");
        }
    }
}