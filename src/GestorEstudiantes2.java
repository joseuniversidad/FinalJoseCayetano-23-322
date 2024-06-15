public class GestorEstudiantes2 {
    private Estudiante[] estudiantes;

    public GestorEstudiantes2(Estudiante[] estudiantes) {
        this.estudiantes = estudiantes;
    }

    public void mostrarEstudiantes2() {
        for (int i = 0; i < estudiantes.length; i++) {
            System.out.println("Estudiante " + (i + 1) + ": " + estudiantes[i].getNombre());
        }
    }
}



