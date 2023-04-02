package ClasesApJava.descuentos;

public class DescuentoConTope extends Descuento{


    @Override
    public Double valorFinal(Double valorInicial) {
        return valorInicial - (valorInicial * super.valor/100);

    }
}
