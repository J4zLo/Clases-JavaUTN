package ClasesApJava.descuentos;

public abstract class Descuento { //cuando declaro la Clase le agrego abstract.
    // La clase es ABSTRACTA significa que no puede ser INSTANCIADA. Solo puede ser Heredada

    protected Double valor;

    /*Metodo de Clase Abstracto : Solo pueden ser definidos en Clases Abstractas.
    En las clases que hereden de esta clase será obligatorio que
    tengan el metodo "public abstract Double valorFinal (Double valorInicial)"
    Los METODOS ABSTRACTOS en la clase principal NO LLEVAN CUERPO (no van a tener{} con )*/

    //METODO ABSTRACTO:
    public abstract Double valorFinal (Double valorInicial);

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
} //Fin Clase descuento
