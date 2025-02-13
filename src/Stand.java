public class Stand {
    private int numero;
    private String ubicacion;
    private String tamaño;
    private Empresa empresaAsignada; // Asociación con la clase Empresa

    // Constructor
    public Stand(int numero, String ubicacion, String tamaño) {
        this.numero = numero;
        this.ubicacion = ubicacion;
        this.tamaño = tamaño;
        this.empresaAsignada = null; // Por defecto, el stand está disponible
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