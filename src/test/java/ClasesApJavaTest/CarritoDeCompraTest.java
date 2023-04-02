package ClasesApJavaTest;

import ClasesApJava.productos.CarritoDeCompra;
import ClasesApJava.productos.ItemDeCarrito;
import ClasesApJava.productos.Producto;
import ClasesApJava.descuentos.Descuento;
import ClasesApJava.descuentos.DescuentoFijo;
import ClasesApJava.descuentos.DescuentoPorcentual;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CarritoDeCompraTest {

    @Test
    public void carritoConUnItemVale400 (){

        CarritoDeCompra carrito = new CarritoDeCompra();
        Producto arvejas = new Producto("Arvejas", "122", 200);
        ItemDeCarrito item1 = new ItemDeCarrito(arvejas, 2);
        carrito.setItem1(item1);
        Assertions.assertEquals(400, carrito.precioBase());
    }
    @Test
    public void carritoConDosItemsVale500 () {

        CarritoDeCompra carrito = new CarritoDeCompra();
        Producto arvejas = new Producto("Arvejas", "122", 200);
        Producto mayonesa = new Producto("Mayonesa Natura", "138", 300);
        ItemDeCarrito item1 = new ItemDeCarrito(arvejas, 1);
        ItemDeCarrito item2 = new ItemDeCarrito(mayonesa, 1);
        carrito.setItem1(item1);
        carrito.setItem2(item2);
        Assertions.assertEquals(500, carrito.precioBase());

    }
    @Test
    public void carritoConDescuentoFijoVale480 (){

        CarritoDeCompra carrito2 = new CarritoDeCompra();
        Producto detergente = new Producto("Detergente Cif", "22", 249);
        Producto esponja = new Producto("Esponja Mortimer", "37", 251);
        Descuento descuentoFijo20 = new DescuentoFijo();
        descuentoFijo20.setValor(20.0);
        ItemDeCarrito prod1 = new ItemDeCarrito(detergente, 1);
        ItemDeCarrito prod2 = new ItemDeCarrito(esponja, 1);
        carrito2.setItem1(prod1);
        carrito2.setItem2(prod2);
        carrito2.setDescuento(descuentoFijo20);
        Assertions.assertEquals(480, carrito2.precioFinal());

        }
    @Test
    public void carritoConDescuentoPorcentualVale450 (){

        CarritoDeCompra carrito2 = new CarritoDeCompra();
        Producto detergente = new Producto("Detergente Cif", "22", 249);
        Producto esponja = new Producto("Esponja Mortimer", "37", 251);
        Descuento descuentoPorcentual10 = new DescuentoPorcentual();
        descuentoPorcentual10.setValor(10.0);
        ItemDeCarrito prod1 = new ItemDeCarrito(detergente, 1);
        ItemDeCarrito prod2 = new ItemDeCarrito(esponja, 1);
        carrito2.setItem1(prod1);
        carrito2.setItem2(prod2);
        carrito2.setDescuento(descuentoPorcentual10);
        Assertions.assertEquals(450, carrito2.precioFinal());

    }
}