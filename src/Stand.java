import java.util.ArrayList;
import java.util.List;


public class Stand {
    private int numero;
    private String ubicacion;
    private String tamaño;
    private Empresa empresaAsignada; // Asociación con la clase Empresa
    private List<Comentario> comentarios;  // Lista de comentarios


    // Constructor
    public Stand(int numero, String ubicacion, String tamaño) {
        this.numero = numero;
        this.ubicacion = ubicacion;
        this.tamaño = tamaño;
        this.empresaAsignada = null; // Por defecto, el stand está disponible
        this.comentarios = new ArrayList<>();

    }

     // Getters y Setters
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public Empresa getEmpresaAsignada() {
        return empresaAsignada;
    }

    public void asignarEmpresa(Empresa empresa) {
        this.empresaAsignada = empresa;
    }

    public void liberarStand() {
        this.empresaAsignada = null;
    }

     // Método para agregar comentarios
    public void agregarComentario(Visitante visitante, String comentario, int calificacion) {
        Comentario nuevoComentario = new Comentario(visitante, comentario, calificacion);
        comentarios.add(nuevoComentario);
    }

     // Método para mostrar información del stand
    public void mostrarInfo() {
        System.out.println("Stand #" + numero);
        System.out.println("Ubicación: " + ubicacion);
        System.out.println("Tamaño: " + tamaño);
        if (empresaAsignada != null) {
            System.out.println("Empresa asignada: " + empresaAsignada.getNombre());
        } else {
            System.out.println("Stand disponible");
        }
        System.out.println("---------------------------");
    }
}