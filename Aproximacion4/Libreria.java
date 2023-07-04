
/**
 * Write a description of class Libreria here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Libreria {
    private final String sello;
    private String nombreLibreria;
    private String direccion;
    private Cliente[] cliente;
    private int numClientes;
    
    public Libreria(String sello,String nombreLibreria,String direccion){
        if(sello != null) this.sello = sello;
        else this.sello= ""; 
        setnombreLibreria(nombreLibreria);
        setDireccion(direccion);        
        cliente = new Cliente[30];
        numClientes = 0;
    }
    
    public String getsello(){
        return sello;
    }
    
    public String getNombreLibreria(){
        return nombreLibreria;
    }
    public void setnombreLibreria(String nombreLibreria){
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
    
    public int getNumClientes(){
        return numClientes;
    }
    
    public double calcularPromedioGeneral(){ 
        double promedio = 0;
        for(int i = 0; i < numClientes; i++){
            promedio = promedio + cliente[i].calcularPromedio() / numClientes;
        }
        return promedio;
    }
    
    public void adicionarCliente(String id, String nombre, String tiempo, double librosuno, double librosdos, double librostres){
        Cliente a = new Cliente(id, nombre, tiempo, librosuno, librosdos, librostres);
        cliente[numClientes] = a;
        numClientes++;
    }
}
