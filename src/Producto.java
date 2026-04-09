public class Producto {

    String nombre;
    double precio;
    double descuentoParaDebito;

    double calculaPrecioFinal(boolean pagoMedianteDebito) {
        if (pagoMedianteDebito) {
            return precio - descuentoParaDebito;
        }
        return precio;
    }
}