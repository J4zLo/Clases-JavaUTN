package ClasesApJava.productos;


import ClasesApJava.personas.Persona;

import ClasesApJava.descuentos.Descuento;

public class CarritoDeCompra {
    private Persona comprador;
    private ItemDeCarrito item1;
    private ItemDeCarrito item2;
    private ItemDeCarrito item3;

    private Descuento descuento;


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
//Metodo Precion Final
    public double precioBase(){
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
    //Metodo descuento
    public double precioFinal(){
        if (this.descuento==null ) {
            return this.precioBase();
        }
        else {
            return this.descuento.valorFinal((this.precioBase()));
        }

    }

} // Fin Clase CarritoDeCompra
