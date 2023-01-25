
# Excepciones en Java

El objetivo es crear código de calidad que sea ROBUSTO ante fallos.

## try catch

Permite capturar la excepción deseada

1. try catch
2. try con múltiples catch
3. try con multi-catch
4. try catch anidado dentro de otro try catch (no recomendable)


## throw

La palabra ``throw`` permite lanzar excepciones. El objetivo es fallar temprano (y gestionar temprano) para evitar fallos colaterales más difíciles de detectar.

## throws



## Tipos de excepciones

* Comprobadas (checked exceptions): 
	* Comprobadas por el compilador, es decir, cuando se lanzan se debe especificar en la signatura del método utilizando la palabra throws. Esto permite que quien ejecuta esos métodos esté obligado a capturar las excepciones o lanzarlas también.

* No comprobadas (unchecked exceptions): Ejemplo RuntimeException
	* No comprobadas por el compilador, por tanto se pueden lanzar sin necesidad de indicar nada más en el método ni utilizar try catch, para dar libertad al desarrollador de capturarla cuando quiera y gestionarla como quiera.

## Excepciones propias

```java
public class BookNotFoundException extends RuntimeException {  
    public BookNotFoundException(String s) {  
    }
}
```


