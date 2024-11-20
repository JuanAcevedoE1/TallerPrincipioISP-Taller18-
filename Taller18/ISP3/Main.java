package ISP3;

public class Main {
    public static void main(String[] args) {
        Camion camion = new Camion();
        camion.conducir();
        camion.cargarMercancias();

        Coche coche = new Coche();
        coche.conducir();
    }
}
