import java.time.LocalDate;

public class Comentario {
    private Visitante visitante;
    private String comentario;
    private int calificacion; // Entre 1 y 5 estrellas
    private LocalDate fecha;

    // Constructor
    public Comentario(Visitante visitante, String comentario, int calificacion) {
        this.visitante = visitante;
        this.comentario = comentario;
        this.calificacion = Math.max(1, Math.min(calificacion, 5)); // deber ser 1 a 5
        this.fecha = LocalDate.now(); // Fecha actual
    }

    // Getters
    public Visitante getVisitante() {
        return visitante;
    }

    public String getComentario() {
        return comentario;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    // Método para mostrar comentario
    public void mostrarComentario() {
        System.out.println("Visitante: " + visitante.getNombre());
        System.out.println("Fecha: " + fecha);
        System.out.println("Calificación: " + calificacion + " estrellas");
        System.out.println("Comentario: " + comentario);
        System.out.println("---------------------------");
    }
}
