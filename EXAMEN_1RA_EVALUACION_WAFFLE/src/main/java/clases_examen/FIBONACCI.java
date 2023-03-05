
package clases_examen;


public class FIBONACCI {
    private int a1;
    private int a2;
    private int n;
    
    public FIBONACCI(int A1, int A2, int N){
        a1 = A1;
        a2 = A2;
        n = N;
    }
    
    public FIBONACCI(){
        a1 = 1;
        a2 = 1;
        n = 6;
    }
    
    
    public int getA1(){
        return a1;
    }    
    public void setA1(int val){
        a1 = val;
    }
    
    public int getA2(){
        return a2;
    }    
    public void setA2(int val){
        a2 = val;
    }
    
    public int getN(){
        return n;
    }    
    public void setN(int val){
        n = val;
    }
    
    public void imprimirFIBONACCI(){
        int a = 0,aR, aR2;
        aR = a1;
        aR2 = a2;
            System.out.print(a1 +" - ");
        for (int i = 0; i < n; i++) {
            
            System.out.print(a2 + " - ");
            a = a1 + a2;
            a1= a2;
            a2 = a;            
        }
        
        System.out.println(a);
        
        a1 = aR;
        a2 = aR2;        
        
    }
    
}
