public class Estudiante {
    private String nombre;
    private String clasificacion;

    // Constructor
    public Estudiante(String nombre) {
        this.nombre = nombre;
        this.clasificacion = clasificacion;
    }

    // Métodos get y set para el atributo 'nombre'
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Métodos get y set para el atributo 'clasificacion'
    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

}
