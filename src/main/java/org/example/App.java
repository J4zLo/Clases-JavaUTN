package org.example;

import ClasesApJava.personas.Persona;
import ClasesApJava.productos.CarritoDeCompra;
import ClasesApJava.productos.ItemDeCarrito;
import ClasesApJava.productos.Producto;
import ClasesApJava.productos.SinStockException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        System.out.println( "Hello World!" );

       /* Persona unaPersona = new Persona("Sancho", "Panza");
        //la variable unaPersona es de Tipo Persona (clase) = luego instancio la clase persona
        //las clases generan un nuevo tipo de dato! (clase, int, String, etc)
        // Para instanciar, generar un nuevo objeto de una clase pongo = new + nombre de la Clase + ()
        // Settear atributos (asignar atributos):
        //-unaPersona.nombre = "Jazmin";
        //-unaPersona.apellido = "Lopez";

        //Voy a llamar al metodo "presentate" de la clase "Persona"
        // y lo imprimo por pantalla.
        System.out.println(unaPersona.presentate());
        //nuevo objeto
        Persona dosPersona = new Persona("Mon", "Toto");
        dosPersona.setNombre("Juan");
        dosPersona.setApellido("Perez");
        System.out.println(dosPersona.presentate());
        System.out.println(dosPersona.getApellido());

        //Ejercicio Carrito
        Producto cepillo = new Producto("Cepillo de Dientes", "7890", 780);
        Producto pastaDeDientes = new Producto("pasta de Dientes", "7891", 550.0);

        ItemDeCarrito cepillos = new ItemDeCarrito(cepillo, 3);
        ItemDeCarrito pastasDeDientes = new ItemDeCarrito(pastaDeDientes, 5);

        CarritoDeCompra carritoDeJaz = new CarritoDeCompra();
        carritoDeJaz.setComprador(unaPersona);
        carritoDeJaz.setItem1(cepillos);
        carritoDeJaz.setItem2(pastasDeDientes);

        System.out.println(carritoDeJaz.precioFinal());

        */

        CarritoDeCompra carrito = new CarritoDeCompra();
        Producto arvejas = new Producto("Arvejas", "122", 200);
        arvejas.setStock(7);
        ItemDeCarrito item1 = new ItemDeCarrito(arvejas, 10);
        carrito.setItem1(item1);
        try {
            double precioDelCarritoSeguro = carrito.precioBaseSeguro();
            System.out.println(precioDelCarritoSeguro);

        }
        catch (SinStockException e) {
            System.out.println("No hay stock suficiente");

        }
        double precioDelCarrito = carrito.precioBase();
        System.out.println(precioDelCarrito);

    }

    }//fin main

