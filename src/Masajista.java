public class Masajista extends Persona {
    private String titulacion;
    private int aniosExperiencia;

    public Masajista(int id, String nombre, String apellidos, int edad, String titulacion, int aniosExperiencia) {
        super(id, nombre, apellidos, edad);
        this.titulacion = titulacion;
        this.aniosExperiencia = aniosExperiencia;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    @Override
    public void concentrarse() {
        System.out.println("El masajista se concentra:");
    }

    @Override
    public void viajar() {
        System.out.println("El masajista viaja:");
    }

    public void darMasaje() {
        System.out.println("El masajista da un masaje:");
    }

    @Override
    public String toString() {
        return "Masajista{" +
                "titulacion='" + titulacion + '\'' +
                ", aniosExperiencia=" + aniosExperiencia +
                "} " + super.toString();
    }
}
