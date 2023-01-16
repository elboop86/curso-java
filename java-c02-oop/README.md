
# Programación Orientada a Objetos (OOP)

Instanciar una clase significa crear un objeto de esa clase.

## 1. Clases

Creación de clases: Company, Customer, Employee, Vehicle, Film, ShopCart
  * constantes
  * atributos
  * constructores
  * métodos
  * métodos getter y setter
  * toString

Métodos comportamiento: speedUp(), speedDown()

Método toString()
  * Sirve para dar representación textual a los objetos cuando se imprimen por consola

```java
    @Override
    public String toString() {
        return "Film{" +
                "title='" + title + '\'' +
                ", duration=" + duration +
                ", rating=" + rating +
                ", category='" + category + '\'' +
                '}';
    }
```

Clases envoltorio (wrappers)
  * Clases especiales para permitir valores null en tipos de datos primitivos
  * Integer, Long, Float, Double, Character, Boolean 
  * Admiten ``null`` como valor

## 2. Objetos

Creación de objetos con la palabra `new` utilizando los diferentes constructores


## 3. Modificador ``static``
  * Indica que un atributo o método pertenece a una clase y por tanto no es necesario crear un objeto para usarlo

Ejemplo `static` sobre atributo:

```java
    public static final Double PI = 3.14;
```

Ejemplo `static` sobre método:

```java
    public static double sum(int num1, int num2){
        return num1 + num2;
    }
```


## 4. Encapsulación:

Mecanismo para modificar la visibilidad y hacer aplicaciones más seguras permitiendo restringir 
cómo se modifican los atributos.

* `public`: accesible desde fuera por cualquier clase
* `private`: accesible únicamente desde la propia clase
* (default): visibilidad de paquete

Dónde aplicar la encapsulación:

1. **Atributos**: se crearán métodos getter y setter para acceder/modificar atributos de forma 
   controlada
2. **Métodos**: se utiliza para métodos intermedios que no deberían ser expuestos al exterior de la 
   clase
3. **Constructor**: hace que no se pueda instanciar una clase


## 5. Enums

Una enumeración o ``enum`` es un tipo de dato especial que representa una agrupación de constantes:

```java

public enum{

}

```

