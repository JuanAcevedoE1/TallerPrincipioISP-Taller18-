package ISP1;


public class Tecnico implements Reparacion {
    @Override
    public void reparar() {
        System.out.println("El técnico está realizando reparaciones.");
    }
}