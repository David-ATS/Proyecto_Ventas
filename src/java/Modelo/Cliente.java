package Modelo;

public class Cliente {
    private int idcliente;
    private String nombre;
    private int dni;
    private String fecha;
    private String direccion;
    private String estado;

    public Cliente() {
    }

    public Cliente(int idcliente, String nombre, int dni, String fecha, String direccion, String estado) {
        this.idcliente = idcliente;
        this.nombre = nombre;
        this.dni = dni;
        this.fecha = fecha;
        this.direccion = direccion;
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(int idcliente) {
        this.idcliente = idcliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    
      
}
