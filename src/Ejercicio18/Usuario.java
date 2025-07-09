package Ejercicio18;

public class Usuario {
    private String id;
    private String nombre;
    private String direccion;
    
    public Usuario(String id, String nombre, String direccion) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
    }
    
    public String getId() {
        return id;
    }
    
    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }
}
