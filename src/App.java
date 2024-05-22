public class App {
    public static void main(String[] args) throws Exception {
        Futbolista futbolista = new Futbolista(1, "kevin", "silva", 19, 8, "portero");
        Entrenador entrenador = new Entrenador(2, "ramdaran", "guardado", 20, "AL-001");
        Masajista masajista = new Masajista(3, "benito", "rivera", 25, "Licenciado", 30);

        System.out.println(futbolista);
        System.out.println(entrenador);
        System.out.println(masajista);

        futbolista.jugarPartido();
        entrenador.dirigirEntrenamiento();
        masajista.darMasaje();

        futbolista.concentrarse();
        futbolista.viajar();
        entrenador.concentrarse();
        entrenador.viajar();
        masajista.concentrarse();
        masajista.viajar();
    }
}
