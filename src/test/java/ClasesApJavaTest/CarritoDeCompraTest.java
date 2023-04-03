package ClasesApJavaTest;

import ClasesApJava.productos.CarritoDeCompra;
import ClasesApJava.productos.ItemDeCarrito;
import ClasesApJava.productos.Producto;
import ClasesApJava.descuentos.Descuento;
import ClasesApJava.descuentos.DescuentoFijo;
import ClasesApJava.descuentos.DescuentoPorcentual;
import ClasesApJava.productos.SinStockException;
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
    public void carritoConUnItemNotieneStock (){

        CarritoDeCompra carrito = new CarritoDeCompra();
        Producto arvejas = new Producto("Arvejas", "122", 200);
        arvejas.setStock(7);
        ItemDeCarrito item1 = new ItemDeCarrito(arvejas, 10);
        carrito.setItem1(item1);
        Assertions.assertThrowsExactly(SinStockException.class, () ->carrito.precioBaseSeguro());

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
    public void carritoConDosItemsVale500Collection () {

        CarritoDeCompra carrito = new CarritoDeCompra();
        Producto arvejas = new Producto("Arvejas", "122", 200);
        Producto mayonesa = new Producto("Mayonesa Natura", "138", 300);
        ItemDeCarrito item1 = new ItemDeCarrito(arvejas, 1);
        ItemDeCarrito item2 = new ItemDeCarrito(mayonesa, 1);
        carrito.agregarItem(item1);
        carrito.agregarItem(item2);
        arvejas.setStock(10);
        mayonesa.setStock(5);

        Assertions.assertEquals(500, carrito.precioBaseList());
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

    @Test
    public void carritoConItemsDeCantMayorA2 (){

        CarritoDeCompra carrito = new CarritoDeCompra();
        Producto alfajor = new Producto("Alfajor Havanna", "22", 200);
        alfajor.setStock(3);
        ItemDeCarrito item = new ItemDeCarrito(alfajor, 3);
        carrito.agregarItem(item);

        Producto gaseosa = new Producto("Fanta", "37", 100);
        gaseosa.setStock(5);
        ItemDeCarrito itemGaseosa = new ItemDeCarrito(gaseosa, 4);
        carrito.agregarItem(itemGaseosa);

        Assertions.assertTrue(carrito.todosLosItemsTienenMasDe(2));
        Assertions.assertTrue(carrito.algunItemTienenMasDe(3));
        Assertions.assertFalse(carrito.algunItemTienenMasDe(4));
    }
}
