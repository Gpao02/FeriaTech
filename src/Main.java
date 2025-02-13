public class Main {
    public static void main(String[] args) {
        // Crear empresas
        Empresa empresa1 = new Empresa("Tech Solutions", "Tecnología", "contacto@tech.com");
        Empresa empresa2 = new Empresa("Salud Total", "Salud", "info@saludtotal.com");

        // Mostrar información
        empresa1.mostrarInfo();
        empresa2.mostrarInfo();

        // Crear stands
        Stand stand1 = new Stand(1, "Pabellón A, Stand 10", "Grande");
        Stand stand2 = new Stand(2, "Pabellón B, Stand 5", "Mediano");

        // Asignar empresas a stands
        stand1.asignarEmpresa(empresa1);
        stand2.asignarEmpresa(empresa2);

        // Mostrar información
        stand1.mostrarInfo();
        stand2.mostrarInfo();

        // Liberar un stand
        System.out.println("Liberando Stand 1...");
        stand1.liberarStand();
        stand1.mostrarInfo();
    }
}
