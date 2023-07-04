
/**
 * Write a description of class Libreria here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class Libreria {
    private final String sello;
    private String nombreLibreria;
    private String direccion;
    private ArrayList cliente;
    
    public Libreria(String sello,String nombrelibreria,String direccion){
        if(sello != null) this.sello = sello;
        else this.sello= ""; 
        setNombreLibreria(nombreLibreria);
        setDireccion(direccion);        
        cliente = cliente = new ArrayList();
    }
    
    public String getSello(){
        return sello;
    }
    
    public String getNombreLibreria(){
        return nombreLibreria;
    }
    public void setNombreLibreria(String nombreLibreria){
        if(nombreLibreria != null){
            this.nombreLibreria = nombreLibreria;
        }else{
            this.nombreLibreria = "";
        }        
    }
    
    public String getDireccion(){
        return direccion;
    }
    public void setDireccion(String direccion){
        if(direccion != null){
            this.direccion = direccion;
        }else{
            this.direccion = "";
        }        
    }
        
    public double calcularPromedioGeneral(){
        double promedio = 0;
        for(int i = 0; i < cliente.size(); i++){
            promedio += ((Cliente)cliente.get(i)).calcularPromedio();
        }

        return promedio / 3;
    }
    
    public void adicionarCliente(String id, String nombre, String tiempo, double librosuno, double librosdos)throws Exception{
        cliente.add(new EstudiantePrimaria(id, nombre, tiempo, librosuno, librosdos));
    }
    
    public void adicionarCliente(String id, String nombre, String tiempo, double librosuno, double librosdos, double librostres)throws Exception{
        cliente.add(new EstudianteBachiller(id, nombre, tiempo, librosuno, librosdos, librostres));
    }
    
    public void adicionarCliente(String id, String nombre, String tiempo, double librosuno, double librosdos, double librostres, double libroscuatro)throws Exception{
        cliente.add(new EstudianteUniversitario(id, nombre, tiempo, librosuno, librosdos, librostres, libroscuatro));
    }
}
