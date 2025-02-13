
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Importamos las clases necesarias si están en un paquete diferente
import feria.Empresa;
import feria.Stand;
import feria.Visitante;
import feria.Reporte;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Empresa> empresas = new ArrayList<>();
        List<Stand> stands = new ArrayList<>();
        List<Visitante> visitantes = new ArrayList<>();

        // Registrar empresas
        System.out.print("Ingrese el número de empresas a registrar: ");
        int numEmpresas = scanner.nextInt();
        scanner.nextLine(); // Limpiar buffer

        for (int i = 0; i < numEmpresas; i++) {
            System.out.println("\nRegistro de empresa #" + (i + 1));
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();
            System.out.print("Sector (Ej: Tecnología, Salud, Educación): ");
            String sector = scanner.nextLine();
            System.out.print("Correo de contacto: ");
            String correo = scanner.nextLine();
            empresas.add(new Empresa(nombre, sector, correo));
        }

        // Registrar stands
        System.out.print("\nIngrese el número de stands a registrar: ");
        int numStands = scanner.nextInt();
        scanner.nextLine(); // Limpiar buffer

        for (int i = 0; i < numStands; i++) {
            System.out.println("\nRegistro de stand #" + (i + 1));
            System.out.print("Número del stand: ");
            int numero = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Ubicación (Ej: Pabellón A, Stand 10): ");
            String ubicacion = scanner.nextLine();
            System.out.print("Tamaño (Pequeño, Mediano, Grande): ");
            String tamaño = scanner.nextLine();
            stands.add(new Stand(numero, ubicacion, tamaño));
        }

        // Asignar stands a empresas
        System.out.println("\nAsignación de stands a empresas:");
        for (Stand stand : stands) {
            System.out.println("Stand #" + stand.getNumero() + " en " + stand.getUbicacion());
            System.out.println("Seleccione la empresa asignada (ingrese el número):");
            for (int i = 0; i < empresas.size(); i++) {
                System.out.println((i + 1) + ". " + empresas.get(i).getNombre());
            }
            int opcionEmpresa = scanner.nextInt();
            scanner.nextLine();
            stand.asignarEmpresa(empresas.get(opcionEmpresa - 1));
        }

        // Registrar visitantes
        System.out.print("\nIngrese el número de visitantes a registrar: ");
        int numVisitantes = scanner.nextInt();
        scanner.nextLine(); // Limpiar buffer

        for (int i = 0; i < numVisitantes; i++) {
            System.out.println("\nRegistro de visitante #" + (i + 1));
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();
            System.out.print("Número de identificación: ");
            String id = scanner.nextLine();
            System.out.print("Correo electrónico: ");
            String correo = scanner.nextLine();
            visitantes.add(new Visitante(nombre, id, correo));
        }

        // Visitantes dejan comentarios en los stands
        System.out.println("\nVisitantes dejando comentarios:");
        for (Visitante visitante : visitantes) {
            System.out.println("Visitante: " + visitante.getNombre());
            System.out.println("Seleccione un stand para visitar (ingrese el número):");
            for (int i = 0; i < stands.size(); i++) {
                System.out.println((i + 1) + ". Stand #" + stands.get(i).getNumero() + " - " + stands.get(i).getUbicacion());
            }
            int opcionStand = scanner.nextInt();
            scanner.nextLine();
            Stand standSeleccionado = stands.get(opcionStand - 1);

            System.out.print("Deje un comentario sobre el stand: ");
            String comentario = scanner.nextLine();
            System.out.print("Calificación (1 a 5 estrellas): ");
            int calificacion = scanner.nextInt();
            scanner.nextLine();

            standSeleccionado.agregarComentario(visitante, comentario, calificacion);
        }

        // Generar reportes dinámicamente
        System.out.println("\n***** GENERANDO REPORTES *****");
        Reporte.generarReporteEmpresas(empresas, stands);
        Reporte.generarReporteVisitantes(visitantes, stands);
        Reporte.generarReporteCalificaciones(stands);

        scanner.close();
    }
}
