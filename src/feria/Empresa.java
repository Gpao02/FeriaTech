package feria;

public class Empresa {
    private String nombre;
    private String sector;
    private String correo;

    // Constructor
    public Empresa(String nombre, String sector, String correo) {
        this.nombre = nombre;
        this.sector = sector;
        this.correo = correo;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    // Método para mostrar la información de la empresa
    public void mostrarInfo() {
        System.out.println("Empresa: " + nombre);
        System.out.println("Sector: " + sector);
        System.out.println("Correo: " + correo);
        System.out.println("---------------------------");
    }

}