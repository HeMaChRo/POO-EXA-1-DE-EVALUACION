
package clases_examen;


public class FichaBibliografica {
    
    private String autor;
    private String titulo;
    private String editorial;
    private String lugar;
    private String edicion;
    private String año;
    private String paginas;
    
    public FichaBibliografica(){
        autor = "";
        titulo = "";
        editorial = "";
        lugar = "";
        edicion = "";
        año = "";
        paginas = "";
    }

    public FichaBibliografica(String aut, String tit, String edit, String lug, String edic, String añ, String pag) {
        autor = aut;
        titulo = tit;
        editorial = edit;
        lugar = lug;
        edicion = edic;
        año = añ;
        paginas = pag;
    }
    
    

    public String getAutor(){
        return autor;
    }   
    public void setAutor(String val){
        autor = val;
    }
    
    public String getTitulo(){
        return titulo;
    }   
    public void setTitulo(String val){
        titulo = val;
    }
    
    public String getEditorial(){
        return editorial;
    }   
    public void setEditorial(String val){
        editorial = val;
    }
    
    public String getLugar(){
        return lugar;
    }   
    public void setLugar(String val){
        lugar = val;
    }
    
    public String getEdicion(){
        return edicion;
    }   
    public void setEdicion(String val){
        edicion = val;
    }
    
    public String getAño(){
        return año ;
    }   
    public void setAño(String val){
        año = val;
    }
    
    public String getPaginas(){
        return paginas ;
    }   
    public void setPaginas(String val){
        paginas = val;
    }
        
    public void imprimirDatos(){
        System.out.println(autor+", "+edicion+"("+año+"). "+titulo+". "+lugar+": "+editorial);
    }
}
    

