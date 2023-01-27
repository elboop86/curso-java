
# Excepciones en Java

El objetivo es crear código de calidad que sea ROBUSTO ante fallos.

## try catch

Permite capturar la excepción deseada

1. try catch
2. try con múltiples catch
3. try con multi-catch
4. try catch anidado dentro de otro try catch (no recomendable)

## finally (opcional)

Se utiliza a continuación del catch y se utiliza para cerrar recursos, por ejemplo:

* Cerrar un Scanner
* Cerrar una conexión a base de datos

## throw

La palabra ``throw`` permite lanzar excepciones. El objetivo es fallar temprano (y gestionar temprano) para evitar fallos colaterales más difíciles de detectar.

Cuando se lanza una excepción, hay dos componentes:
* El que lanza la excepción
* El que captura la excepción

## throws

Se utiliza en la signatura de los métodos, indica que el método lanza una excepción comprobada y por tanto quien llame a ese método estará obligado a: 
1. Opción 1: capturar la excepción con try catch
2. Opción 2: declarar throws en la signatura para lanzar también dicha excepción

## Tipos de excepciones

### Comprobadas
* Comprobadas (checked exceptions): 
	* Comprobadas por el compilador, es decir, cuando se lanzan se debe especificar en la signatura del método utilizando la palabra throws. Esto permite que quien ejecuta esos métodos esté obligado a capturar las excepciones o lanzarlas también.

Caso básico:
* **metodo1** llama a **metodo2**
* Un **metodo2** lanza una excepción comprobada (**throw** new y **throws** en la signatura)
* **metodo1** captura la excepción con try catch

Otro caso:

* metodo1 llama a metodo2
* metodo2 llama a metodo3
* metodo3 lanza una excepción comprobada (**throw** new y **throws** en la signatura)
* metodo2 captura con try catch la excepción
* metodo1 no se entera

Otro caso:

* metodo1 llama a metodo2
* metodo2 llama a metodo3
* metodo3 lanza una excepción comprobada (**throw** new y **throws** en la signatura)
* **metodo2 propaga la excepción usando throws en la signatura**
* metodo1 captura con try catch la excepción


### No comprobadas
* No comprobadas (unchecked exceptions): Ejemplo RuntimeException
	* No comprobadas por el compilador, por tanto se pueden lanzar sin necesidad de indicar nada más en el método ni utilizar try catch, para dar libertad al desarrollador de capturarla cuando quiera y gestionarla como quiera.

No te obliga a lanzar ni capturar nada.


## Excepciones propias

Es conveniente crear excepciones propias para cada tipo de error que pueda producirse y así tener los errores mejor identificados y controlados.

```java

// Excepción NO comprobada
public class BookNotFoundException extends RuntimeException {  
    public BookNotFoundException(String s) {  
    }
}

// Excepción Sí comprobada
public class InvalidBookData extends Exception {  
    public InvalidBookData(String s) {  
    }
}
```


