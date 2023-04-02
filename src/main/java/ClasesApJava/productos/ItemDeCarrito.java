package ClasesApJava.productos;

public class ItemDeCarrito {
    private Producto producto;
    private int cantidad;

//Constructor


    public ItemDeCarrito(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }
// Setters y Getters

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double precioDelItemSeguro() throws SinStockException {
        if (!this.producto.hayStockSuficiente(this.cantidad)) {
            throw new SinStockException();
        }
        return this.producto.getPrecio() * this.cantidad;
    }

    public double precioDelItem() {
        if (!this.producto.hayStockSuficiente(this.cantidad)) {
            throw new SinStockException2();
        }
            return this.producto.getPrecio() * this.cantidad;

        }


}// Fin Clase Item De Carrito
