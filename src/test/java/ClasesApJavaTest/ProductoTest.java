package ClasesApJavaTest;

import ClasesApJava.productos.Producto;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProductoTest {

    @Test
    public void productoAStringMuestraLeyendaCorrecta (){
        Producto galletitas = new Producto("Opera", "134", 127.0);
        Assertions.assertEquals("Opera; 134; 127.0", galletitas.toString());
    }

}
