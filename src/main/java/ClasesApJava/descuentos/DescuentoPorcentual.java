package ClasesApJava.descuentos;

public class DescuentoPorcentual extends Descuento {



    @Override
    public Double valorFinal(Double valorInicial) {
        return valorInicial - (valorInicial * super.valor/100);
    }
}
