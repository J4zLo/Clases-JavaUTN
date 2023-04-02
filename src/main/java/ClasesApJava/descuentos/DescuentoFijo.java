package ClasesApJava.descuentos;

public class DescuentoFijo extends Descuento {
    @Override  //El @Override significa q se esta sobre escribiendo el medoto de la clasePadre
    public Double valorFinal(Double valorInicial) {
        return valorInicial - super.valor;  //para acceder al atributo de la clasePadre se usa super.
    }
}
