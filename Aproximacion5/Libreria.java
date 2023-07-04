
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
    private EstudiantePrimaria[] estudiantep;
    private EstudianteBachiller[] estudianteb;
    private EstudianteUniversitario[] estudianteu;    
    private int numEstudiantesp;
    private int numEstudiantesb;
    private int numEstudiantesu;    
    
    public Libreria(String sello,String nombreLibreria,String direccion){
        if(sello != null) this.sello = sello;
        else this.sello = ""; 
        setNombreLibreria(nombreLibreria);
        setDireccion(direccion);        
        estudiantep = new EstudiantePrimaria[30];
        estudianteb = new EstudianteBachiller[30];
        estudianteu = new EstudianteUniversitario[30];        
        numEstudiantesp = 0;
        numEstudiantesb = 0;
        numEstudiantesu= 0;        
    }
    
    public String getSello(){
        return sello;
    }
    
    public String getNombreLibreria(){
        return nombreLibreria;
    }
    public void setNombreLibreria(String nombreLibreria){
        if(nombreLibreria != null){
            this.nombreLibreria= nombreLibreria;
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
    
    public int getNumEstudiantesp(){
        return numEstudiantesp;
    }
    
    public int getNumEstudiantesb(){
        return numEstudiantesb;
    }
    
    public int getNumEstudiantesu(){
        return numEstudiantesu;
    }    
    
    public double calcularPromedioGeneral(){
        double promedio = 0;
        for(int i = 0; i < numEstudiantesp; i++){
            promedio = promedio + estudiantep[i].calcularPromedio() / numEstudiantesp;
        }
        for(int i = 0; i < numEstudiantesb; i++){
            promedio = promedio + estudianteb[i].calcularPromedio() / numEstudiantesb;
        }
        for(int i = 0; i < numEstudiantesu; i++){
            promedio = promedio + estudianteu[i].calcularPromedio() / numEstudiantesu;
        }
        return promedio / 3;
    }
    public void adicionarEstudiantePrimaria(String id, String nombre, String tiempo, double librosuno, double librosdos){
        estudiantep[numEstudiantesp] = new EstudiantePrimaria(id, nombre, tiempo, librosuno, librosdos);
        numEstudiantesp++; 
    }
    
    public void adicionarEstudianteBachiller(String id, String nombre, String tiempo, double librosuno, double librosdos, double librostres){
        estudianteb[numEstudiantesb] = new EstudianteBachiller(id, nombre, tiempo, librosuno, librosdos,  librostres);
        numEstudiantesb++;
    }
    
    public void adicionarEstudianteUniversitario(String id, String nombre, String tiempo, double librosuno, double librosdos, double  librostres, double libroscuatro){
        estudianteu[numEstudiantesu] = new EstudianteUniversitario(id, nombre, tiempo, librosuno, librosdos,  librostres, libroscuatro);
        numEstudiantesu++;
    }
}
