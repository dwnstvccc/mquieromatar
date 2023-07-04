public class Cliente {
    protected final String id;
    private String nombre;
    private String tiempo;
    
    public Cliente(String id, String nombre, String tiempo){
      if(id != null)this.id  = id;
      else this.id = ""; 
      setNombre(nombre);
      setTiempo(tiempo);
    }
    double calcularPromedio () {
        return  0;
    }
    public String getId (){
       return id;
    }
    
       public String getNombre (){
       return nombre;
    }
    public void setNombre (String nombre){
        if(nombre != null ) this.nombre = nombre;
        else this.nombre = "";
    }
    
        public String getTiempo (){
       return tiempo;
    }
    
    public void setTiempo (String tiempo){
        if(tiempo != null ) this.tiempo = tiempo;
        else this.tiempo = "";
    }
}
