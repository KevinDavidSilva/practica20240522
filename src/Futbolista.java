public class Futbolista extends Persona {
    private int dorsal;
    private String demarcacion;

    public Futbolista(int id, String nombre, String apellidos, int edad, int dorsal, String demarcacion) {
        super(id, nombre, apellidos, edad);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    public int getDorsal() {
        return dorsal;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    @Override
    public void concentrarse() {
        System.out.println("El futbolista se concentra:");
    }

    @Override
    public void viajar() {
        System.out.println("El futbolista viaja:");
    }

    public void jugarPartido() {
        System.out.println("El futbolista juega un partido:");
    }

    public void entrenar() {
        System.out.println("El futbolista entrena:");
    }

    @Override
    public String toString() {
        return "Futbolista{" +
                "dorsal=" + dorsal +
                ", demarcacion='" + demarcacion + '\'' +
                "} " + super.toString();
    }
}
