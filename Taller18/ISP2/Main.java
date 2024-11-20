package ISP2;

public class Main {
    public static void main(String[] args) {
        ServicioTransferencia servicioTransferencia = new ServicioTransferencia();
        servicioTransferencia.transferir();

        ServicioRetiro servicioRetiro = new ServicioRetiro();
        servicioRetiro.retirar();

        ServicioPagoFactura servicioPagoFactura = new ServicioPagoFactura();
        servicioPagoFactura.pagarFactura();
    }
}