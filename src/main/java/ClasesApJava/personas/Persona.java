package ClasesApJava.personas;

public class Persona {
    private String nombre;   //Atributo nombre ligado a la Clase es similar a la variable pero esta ligada con la Clase
    private String apellido;
    private String segundoNombre;

    private String numeroDocumento;
    private EnumTipoDoc tipoDoc; // public+ tipo de dato + nombre de variable/atributo
    private int cantFaltas;

    //Metodo para presentarte
    public String presentate () { //Este metodo es publico
                                // devuelve un String ---entre las {} tiene que reducir a un String ---
                                // ----va a tener el return
                                // se llama presentate
                                //y no recibe ningun argumento/parametro "()"
        return "Mi nombre es " + this.nombre + " " + this.apellido;
        //para usar el atributo nombre en un metodo de la misma clase se usa "this."
        //this hace referencia al mismo objeto
    }//Fin del metodo presentate
    public String nombreCompleto (){
        return this.apellido + ", " + this.nombre + " " + this.segundoNombre;
    }


    //************************
    //METODO CONSTRUCTOR, es el metodo q java llama cuando se instancia. cuando se crea una nueva persona (new persona)
    // Se escribe public + nombre de la Clase + () + {}
    //Ojo no tiene el tipo de dato que devuelve!!!!
    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.segundoNombre =segundoNombre;
                this.cantFaltas=0;
        //dentro del constructor se escribe codigo de inicializacion las variables de un objeto
    }//Fin metodo CONSTRUCTOR

    //***********************
    //Metodos SETTERS AND GETTERS para mantener el encapsulamiento


    public String getNombre() {
        return nombre;
    }

    public String getSegundoNombre() {
        return segundoNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public EnumTipoDoc getTipoDoc() {
        return tipoDoc;
    }

    public void setTipoDoc(EnumTipoDoc tipoDoc) {
        this.tipoDoc = tipoDoc;
    }

    public int getCantFaltas() {
        return cantFaltas;
    }

    public void setCantFaltas(int cantFaltas) {
        this.cantFaltas = cantFaltas;
    }
}//Fin Clase
