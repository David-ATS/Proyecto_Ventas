package Modelo;

public class Cliente {
    private int idcliente;
    private String nombre;
    private String fecha;
    private int dni;

    public Cliente() {
    }
    

    public Cliente(int idcliente, String nombre, String fecha, int dni) {
        this.idcliente = idcliente;
        this.nombre = nombre;
        this.fecha = fecha;
        this.dni = dni;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
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
      
}
