package ISP3;


public class Camion implements Conduccion, CargaMercancias {
    @Override
    public void conducir() {
        System.out.println("El camión está en movimiento.");
    }

    @Override
    public void cargarMercancias() {
        System.out.println("Cargando mercancías en el camión.");
    }
}