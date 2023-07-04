
/**
 * Write a description of class biblioteca here.
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
    
    public Libreria(String sello, String nombreLibreria, String direccion){
      if(sello != null) this.sello = sello;
      else this.sello ="";
      setNombreLibreria(nombreLibreria);
      setDireccion(direccion);
      cliente = new Cliente[50];
      numClientes = 0; 
    }
    
    public String getSello(){
        return sello;
    }
    
    public String getNombreLibreria (){
        return nombreLibreria;
    }
    public void setNombreLibreria (String nombreLibreria){
        if(nombreLibreria != null) {
           this.nombreLibreria = nombreLibreria; 
        }else{
            this.nombreLibreria = "";
        }    
    }
    
    public String getDireccion (){
    return direccion;
    }
    public void setDireccion (String direccion){
        if(direccion != null) {
           this.direccion = direccion; 
        }else{
            this.direccion = "";
        }
    }
    
    public double calcularPromedioGeneral(){
        double promedio = 0;
        for (int i = 0; i < numClientes; i++){
            promedio = promedio + cliente[i].calcularPromedio ();
        }
        return promedio /3;
    }
    public void adicionarEstudiantePrimaria(String id, String nombre, String tiempo, double librosuno, double librosdos){
        cliente[numClientes] = new EstudiantePrimaria(id, nombre, tiempo, librosuno, librosdos);
        numClientes++;
    }
    
    public void adicionarEstudianteBachiller(String id, String nombre, String tiempo, double librosuno, double librosdos, double librostres){
        cliente[numClientes] = new EstudianteBachiller(id, nombre, tiempo, librosuno, librosdos, librostres);
        numClientes++;
    }
    
    public void adicionarEstudianteUniversitario(String id, String nombre, String tiempo, double librosuno, double librosdos, double librostres, double libroscuatro){
        cliente[numClientes] = new EstudianteUniversitario(id, nombre, tiempo, librosuno, librosdos, librostres, libroscuatro);
        numClientes++;
    }
}
