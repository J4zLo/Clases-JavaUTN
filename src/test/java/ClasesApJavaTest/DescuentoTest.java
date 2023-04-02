package ClasesApJavaTest;

import ClasesApJava.productos.Producto;
import ClasesApJava.descuentos.Descuento;
import ClasesApJava.descuentos.DescuentoFijo;
import ClasesApJava.descuentos.DescuentoPorcentual;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DescuentoTest {

    @Test
    public void productoConDescFijoAplicadoVale100(){
        Producto alfajor = new Producto("Alfajor", "845",150);
        Descuento descuentoFijoDe50 = new DescuentoFijo();
        descuentoFijoDe50.setValor(50.0);

        Assertions.assertEquals(100.00, descuentoFijoDe50.valorFinal(alfajor.getPrecio()) );
    }
    @Test
    public void productoConPorcentualVale90(){
        Producto alfajor = new Producto("Alfajor", "845",100);
        Descuento descuentoPorcentual = new DescuentoPorcentual();
        descuentoPorcentual.setValor(10.0);

        Assertions.assertEquals(90.00, descuentoPorcentual.valorFinal(alfajor.getPrecio()) );
    }

}
