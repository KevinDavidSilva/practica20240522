public class Entrenador extends Persona {
    private String idFederacion;

    public Entrenador(int id, String nombre, String apellidos, int edad, String idFederacion) {
        super(id, nombre, apellidos, edad);
        this.idFederacion = idFederacion;
    }

    public String getIdFederacion() {
        return idFederacion;
    }

    @Override
    public void concentrarse() {
        System.out.println("El entrenador se concentra:");
    }

    @Override
    public void viajar() {
        System.out.println("El entrenador viaja:");
    }

    public void dirigirPartido() {
        System.out.println("El entrenador dirige un partido:");
    }

    public void dirigirEntrenamiento() {
        System.out.println("El entrenador dirige un entrenamiento:");
    }

    @Override
    public String toString() {
        return "Entrenador{" +
                "idFederacion='" + idFederacion + '\'' +
                "} " + super.toString();
    }
}
