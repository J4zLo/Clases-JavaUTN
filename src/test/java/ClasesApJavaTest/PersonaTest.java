package ClasesApJavaTest;

import ClasesApJava.personas.Persona;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PersonaTest {
    //Testeo del metodo presentate
    //1ro declaro metodo. Los metodos de los Test deben ser siempre public + void

    @Test
    public void jazminLopezSePresentaDeFormaCorrecta () {
        Persona otraPersona = new Persona("Jazmin","Lopez" );
        //assertion = resultado esperado es igual al resultado
        //Declaro mi Assertion comparo mi expectativa con la realidad!
        Assertions.assertEquals("Mi nombre es Jazmin Lopez", otraPersona.presentate());
    } //Fin Test
    @Test
    public void jazminLopezNombreCompleto (){
        Persona tresPersona = new Persona ("Jazmin", "Lopez");
        tresPersona.setSegundoNombre("Lucia");
        Assertions.assertEquals("Lopez, Jazmin Lucia", tresPersona.nombreCompleto());
    }

}//Fin Clase
