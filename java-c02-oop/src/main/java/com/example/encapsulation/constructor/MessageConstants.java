package com.example.encapsulation.constructor;

/*

CLASE DE UTILIDAD

Cuando una clase tiene todos los atributos/métodos static
está pensada como clase de utilidad para no ser instanciada,
es decir,
no se crean objetos de la clase, simplemente se usan directamente
sus atributos/métodos
 */
public class MessageConstants {

    // constantes
    public static final String EN_WELCOME = "Welcome...";
    public static final String EN_BYE = "Thank you...";

    public static final String ES_WELCOME = "Bienvenidos...";
    public static final String ES_BYE = "Gracias y adiós...";

    // constructores: private indica que NO SE DEBE INSTANCIAR
    private MessageConstants(){
    }


    // métodos
    public static String getMessage(){
        return EN_WELCOME;
    }
}
