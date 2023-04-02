package ClasesApJava.productos;

public class Producto implements Comprable {
    private String nombre;
    private String codigo;
    private Double precio;
    private int stock;


// Constructor
    public Producto(String nombre, String codigo, double precio) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.precio = precio;
    }

    // Getters and Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    public boolean hayStockSuficiente (int cant){
        return this.stock >= cant;

    }

    @Override
    public String toString(){
        return this.nombre + "; " + this.codigo + "; " + this.precio;
    }

    @Override
    public Double precioBase() {
        return null;
    }
}//Fin Clase Producto
