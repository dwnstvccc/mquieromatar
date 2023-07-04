
/**
 * Write a description of class EstufianteUniversitario here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EstudianteUniversitario extends Cliente{
    private double librosuno;
    private double librosdos;
    private double librostres;
    private double libroscuatro;
    
    public EstudianteUniversitario(String id, String nombre, String tiempo, double librosuno, double librosdos, double librostres, double libroscuatro){
      super (id, nombre, tiempo);
      setNombre(nombre);
      setTiempo(tiempo);
    }
    
    double calcularpromedio () {
        return  (librosuno + librosdos +  librostres + libroscuatro)/ 4;
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
    
    public double getLibrostres (){
        return librostres;
    }
    public void setLibrostres (double librostres){
        if(librostres  >= 0)this.librostres = librostres;
        else this.librostres = 0;
    }
    
    public double getLibroscuatro (){
        return libroscuatro;
    }
    public void setLibroscuatro (double libroscuatro){
        if(libroscuatro  >= 0)this.libroscuatro = libroscuatro;
        else this.libroscuatro = 0;
    }
    
    double calcularPromedio(){
        return (librosuno + librosdos + librostres + libroscuatro) / 4;
    }  
}
