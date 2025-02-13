public class Visitante {
    private String nombre;
    private String identificacion;
    private String correo;

    // Constructor
    public Visitante(String nombre, String identificacion, String correo) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.correo = correo;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    // Método para mostrar información del visitante
    public void mostrarInfo() {
        System.out.println("Visitante: " + nombre);
        System.out.println("ID: " + identificacion);
        System.out.println("Correo: " + correo);
        System.out.println("---------------------------");
    }
}
