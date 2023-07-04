public class EstudiantePrimaria {
    private final  String id;
    private String nombre;
    private String tiempo;
    private double librosuno;
    private double librosdos;
    
    public String getId(){
        return id;
    }
    
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        if(nombre != null) this.nombre = nombre;
        else this.nombre = "";
    }
    
    public String getTiempo(){
        return tiempo;
    }
    public void setTiempo(String tiempo){
        if(tiempo != null) this.tiempo = tiempo;
        else this.tiempo = "";
    }
    
    public double getLibrosuno(){
        return librosuno;
    }
    public void setLibrosuno(double librosuno){
        if(librosuno >= 0) this.librosuno = librosuno;
        else this.librosuno = 0;
    }
    
    public double getLibrosdos(){
        return librosdos;
    }
    public void setLibrosdos(double librosdos){
        if(librosdos >= 0) this.librosdos = librosdos;
        else this.librosdos = 0;
    }
    
    EstudiantePrimaria(String id, String nombre, String tiempo, double librosuno, double librosdos){
        if(id != null) this.id = id;
        else this.id = "";
        setNombre(nombre);
        setTiempo(tiempo);
        setLibrosuno(librosuno);
        setLibrosdos(librosdos);
    }
    
    double calcularPromedio(){
        return (librosuno + librosdos ) / 2;
    }
}
