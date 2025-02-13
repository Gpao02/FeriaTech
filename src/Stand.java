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