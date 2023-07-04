
/**
 * Write a description of class EstudiantePrimaria here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EstudiantePrimaria extends Cliente {
    private double librosuno;
    private double librosdos;
    
    public EstudiantePrimaria(String id, String nombre, String tiempo, double librosuno, double librosdos){
      super (id, nombre, tiempo);
      setNombre(nombre);
      setTiempo(tiempo);
    }
    
    double calcularpromedio () {
        return  (librosuno + librosdos)/ 2;
    }  
    public double getLibrosuno(){
        return librosuno;
    }
    public void setLibrosuno(double librosuno){
        if(librosuno >= 0) this.librosuno= librosuno;
        else this.librosuno= 0;
    }
    
    public double getLibrosdos(){
        return librosdos;
    }
    public void setLibrosdos(double librosdos){
        if(librosdos >= 0) this.librosdos = librosdos;
        else this.librosdos = 0;
    }
    
    double calcularPromedio(){
        return (librosuno + librosdos ) / 2;
    }
}
