package ClasesApJava.productos;

import ClasesApJava.personas.Persona;
import ClasesApJava.descuentos.Descuento;
import java.util.ArrayList;
import java.util.List;

public class CarritoDeCompra {
    private Persona comprador;
    private ItemDeCarrito item1;
    private ItemDeCarrito item2;
    private ItemDeCarrito item3;
    private List<ItemDeCarrito> items; //Siempre que creo una coleccion la tengo que inicializar en el constructor!

    private Descuento descuento;

//Metodo Construcctor:

    public CarritoDeCompra() {
        this.items = new ArrayList<>();
    }

    public void agregarItem(ItemDeCarrito item) {
        this.items.add(item);
    }

    public void eliminarItem(ItemDeCarrito item) {
        this.items.remove(item);
    }

    public boolean tenesItemDeCarrito(ItemDeCarrito item) {
        return this.items.contains(item);
    }

    public int cantDeItems() {
        return this.items.size();
    }


//Setters y Getters

    public Descuento getDescuento() {
        return descuento;
    }

    public void setDescuento(Descuento descuento) {
        this.descuento = descuento;
    }

    public Persona getComprador() {
        return comprador;
    }

    public void setComprador(Persona comprador) {
        this.comprador = comprador;
    }

    public ItemDeCarrito getItem1() {
        return item1;
    }

    public void setItem1(ItemDeCarrito item1) {
        this.item1 = item1;
    }

    public ItemDeCarrito getItem2() {
        return item2;
    }

    public void setItem2(ItemDeCarrito item2) {
        this.item2 = item2;
    }

    public ItemDeCarrito getItem3() {
        return item3;
    }

    public void setItem3(ItemDeCarrito item3) {
        this.item3 = item3;
    }

    //Metodo Precio Base ArrayList
    public double precioBaseList() {
        double precio = 0.0;
        for (ItemDeCarrito item : this.items) {
            //Por cada item instancia de la Clase ItemDeCarrito
            //perteneciente a mi coleccion de items
            precio += item.precioDelItem();
        }
        return precio;
    }

    //Metodo Precio Base ArrayList 2 (Otra OPcion)
// MapToDouble para sacar de una coleccion un tipo de dato y convertirlo
// en una nueva coleccion (en este caso ademas se hace la sumatoria)
    public double precioBaseList2() {
        double precio = 0.0;
        precio = this.items.stream().mapToDouble(item -> item.precioDelItem()).sum();

        return precio;
    }

    //Metodo Precio Base
    public double precioBase() {
        double precio = 0.0;

        if (this.item1 != null) {
            precio = precio + this.item1.precioDelItem();
        }
        if (this.item2 != null) {
            precio += this.item2.precioDelItem();
        }
        if (this.item3 != null) {
            precio += this.item3.precioDelItem();
        }
        return precio;
    }

    public double precioBaseSeguro() throws SinStockException {
        double precio = 0.0;

        if (this.item1 != null) {
            precio = precio + this.item1.precioDelItemSeguro();
        }
        if (this.item2 != null) {
            precio += this.item2.precioDelItemSeguro();
        }
        if (this.item3 != null) {
            precio += this.item3.precioDelItemSeguro();
        }
        return precio;
    }

    //Metodo descuento
    public double precioFinal() {
        if (this.descuento == null) {
            return this.precioBase();
        } else {
            return this.descuento.valorFinal((this.precioBase()));
        }
    }
//Metodo  .MAP cuando mapeo mantengo la cantidad de elementos
    public List<String> nombresDeProductos () {
        List<String> nombres = this.items.stream().map(i -> i.getProducto().getNombre()).toList();
        return nombres;
    }

//Metodo  .FILTER en esta forma de iterar la coleccion, no siempre mantiene la cant de elementos
    public List <ItemDeCarrito> itemsConMasDe (int cant) {
        return this.items.stream().filter(i -> i.getCantidad() > cant).toList();
    }
//Metodo.ALLMATCH Siempre en el Lamda tengo que poner algo re reduzca a un booleano
//Opera como un &&
    public boolean todosLosItemsTienenMasDe ( int cant){
       return this.items.stream().allMatch(item -> item.getCantidad() > cant);
    }
//Metodo.AnyMATCH Siempre en el Lamda tengo que poner algo re reduzca a un booleano
//Opera como un ||
    public boolean algunItemTienenMasDe ( int cant){
    return this.items.stream().anyMatch(item -> item.getCantidad() > cant);
    }
}// Fin Clase CarritoDeCompra
