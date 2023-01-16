
# Programación Orientada a Objetos (OOP)

Instanciar una clase significa crear un objeto de esa clase.

1. Clases: Company, Customer, Employee, Vehicle, Film, ShopCart
  * constantes
  * atributos
  * constructores
  * métodos
  * métodos getter y setter
  * toString

2. Clases: Método toString()
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



3. Clases envoltorio (wrappers)
  * Clases especiales para permitir valores null en tipos de datos primitivos
  * Integer, Long, Float, Double, Character, Boolean 
  * Admiten ``null`` como valor

* Objetos
    * Creación de objetos con la palabra `new` utilizando los diferentes constructores


* Modificador ``static``
  * Indica que un atributo o método pertenece a una clase y por tanto no es necesario crear un 
    objeto para usarlo