package feria;

import java.util.List;

public class Reporte {
    
    // Método para generar el reporte de las empresas y los stands asignados.
    public static void generarReporteEmpresas(List<Empresa> empresas, List<Stand> stands) {
        System.out.println("===== REPORTE DE EMPRESAS Y STANDS =====");

        // Recorremos la lista de empresas para mostrar su nombre, sector y el stand asignado.
        for (Empresa empresa : empresas) {
            System.out.println("Empresa: " + empresa.getNombre() + " | Sector: " + empresa.getSector());
            boolean asignada = false;

            // Recorremos la lista de stands para verificar cuál stand está asignado a la empresa.
            for (Stand stand : stands) {
                if (stand.getEmpresaAsignada() != null && stand.getEmpresaAsignada().equals(empresa)) {
                    // Si el stand está asignado, mostramos el número y la ubicación del stand.
                    System.out.println("   - Stand #: " + stand.getNumero() + " | Ubicación: " + stand.getUbicacion());
                    asignada = true;
                }
            }
            // Si la empresa no tiene stand asignado, lo indicamos.
            if (!asignada) {
                System.out.println("   - No tiene stand asignado.");
            }
            System.out.println("------------------------------------");
        }
    }

    // Método para generar el reporte de los visitantes y los stands visitados.
    public static void generarReporteVisitantes(List<Visitante> visitantes, List<Stand> stands) {
        System.out.println("===== REPORTE DE VISITANTES Y STANDS VISITADOS =====");

        // Recorremos la lista de visitantes para mostrar su nombre e ID.
        for (Visitante visitante : visitantes) {
            System.out.println("Visitante: " + visitante.getNombre() + " | ID: " + visitante.getId());
            boolean haVisitado = false;

            // Recorremos los stands y verificamos si el visitante ha dejado comentarios en algún stand.
            for (Stand stand : stands) {
                for (Comentario comentario : stand.getComentarios()) {
                    if (comentario.getVisitante().equals(visitante)) {
                        // Si el visitante dejó un comentario, indicamos que visitó el stand.
                        System.out.println("   - Visitó Stand #" + stand.getNumero() + " y dejó un comentario.");
                        haVisitado = true;
                    }
                }
            }
            // Si el visitante no ha visitado ningún stand, lo indicamos.
            if (!haVisitado) {
                System.out.println("   - No ha visitado ningún stand.");
            }
            System.out.println("------------------------------------");
        }
    }

    // Método para generar el reporte de calificación promedio de cada stand.
    public static void generarReporteCalificaciones(List<Stand> stands) {
        System.out.println("===== REPORTE DE CALIFICACIONES =====");

        // Recorremos la lista de stands para calcular y mostrar su calificación promedio.
        for (Stand stand : stands) {
            // Calculamos la calificación promedio de cada stand.
            double promedio = stand.calcularCalificacionPromedio();
            System.out.println("Stand #" + stand.getNumero() + " | Ubicación: " + stand.getUbicacion());
            
            // Si el stand tiene calificaciones, las mostramos. Si no, indicamos que no tiene calificaciones.
            System.out.println("   - Calificación promedio: " + (promedio > 0 ? promedio : "No tiene calificaciones"));
            System.out.println("------------------------------------");
        }
    }
}
