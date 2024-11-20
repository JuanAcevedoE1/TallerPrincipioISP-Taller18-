package ISP2;


public class ServicioPagoFactura implements PagoFactura {
    @Override
    public void pagarFactura() {
        System.out.println("Factura pagada con éxito.");
    }
}
