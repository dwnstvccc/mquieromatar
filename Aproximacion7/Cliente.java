public abstract class Cliente {
    protected final String id;
    private String nombre;
    private String tiempo;
    
    public Cliente(String id, String nombre, String tiempo)throws Exception{
        if(id.trim().equals(""))
            throw new Exception("Valor invalido en la identificacion");
        
        if(id.matches(".*[a-zA-Z].*"))
            throw new Exception("La identificacion no puede tener caracteres");
        
        this.id = id;
        setNombre(nombre);
        setTiempo(tiempo);   
    }
    
    public abstract double calcularPromedio();
    
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
    
}
