import feria.Empresa;
import feria.Stand;
import feria.Visitante;
import feria.Reporte;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Listas para almacenar empresas, stands y visitantes
        List<Empresa> empresas = new ArrayList<>();
        List<Stand> stands = new ArrayList<>();
        List<Visitante> visitantes = new ArrayList<>();

        // Crear empresas y agregarlas a la lista
        Empresa empresa1 = new Empresa("Tech Solutions", "Tecnología", "contacto@tech.com");
        Empresa empresa2 = new Empresa("Salud Total", "Salud", "info@saludtotal.com");
        empresas.add(empresa1);
        empresas.add(empresa2);

        // Crear stands y agregarlos a la lista
        Stand stand1 = new Stand(1, "Pabellón A, Stand 10", "Grande");
        Stand stand2 = new Stand(2, "Pabellón B, Stand 5", "Mediano");
        stands.add(stand1);
        stands.add(stand2);

        // Asignar empresas a stands
        stand1.asignarEmpresa(empresa1);
        stand2.asignarEmpresa(empresa2);

        // Crear visitantes y agregarlos a la lista
        Visitante visitante1 = new Visitante("Carlos Pérez", "12345678", "carlos@email.com");
        Visitante visitante2 = new Visitante("Ana Gómez", "87654321", "ana@email.com");
        visitantes.add(visitante1);
        visitantes.add(visitante2);

        // Visitantes dejan comentarios
        stand1.agregarComentario(visitante1, "Muy buena atención y productos innovadores.", 5);
        stand1.agregarComentario(visitante2, "El servicio podría mejorar.", 3);
        stand2.agregarComentario(visitante1, "Información clara y detallada sobre productos de salud.", 4);

        // Mostrar reportes
        System.out.println("\n***** GENERANDO REPORTES *****\n");
        Reporte.generarReporteEmpresas(empresas, stands);
        Reporte.generarReporteVisitantes(visitantes, stands);
        Reporte.generarReporteCalificaciones(stands);
    }
}

