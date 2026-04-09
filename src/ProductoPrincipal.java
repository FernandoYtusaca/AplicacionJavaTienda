public static void main(String[] args) {
        // Crear producto
        Producto producto1 = new Producto();
        producto1.nombre = "Laptop";
        producto1.precio = 1500;
        producto1.descuentoParaDebito = 100;

        // Pago con débito
        double precioDebito = producto1.calculaPrecioFinal(true);
        System.out.println("Precio con débito: " + precioDebito);

        // Pago sin débito
        double precioNormal = producto1.calculaPrecioFinal(false);
        System.out.println("Precio sin descuento: " + precioNormal);
}
