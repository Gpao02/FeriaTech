public class Main {
    public static void main(String[] args) {
        // Crear empresas
        Empresa empresa1 = new Empresa("Tech Solutions", "Tecnología", "contacto@tech.com");
        Empresa empresa2 = new Empresa("Salud Total", "Salud", "info@saludtotal.com");

        // Mostrar información
        empresa1.mostrarInfo();
        empresa2.mostrarInfo();
    }
}
