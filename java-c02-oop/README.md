
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

Creación de objetos con la palabra `new` utilizando los diferentes constructores.

Ejemplo:

```java
Manufacturer samsung = new Manufacturer("Samsung", "1234A", 1980);
Manufacturer apple = new Manufacturer();
```


## 3. Modificador static

Indica que un atributo o método pertenece a una **clase** y por tanto no es necesario crear un objeto para usarlo

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


## 4. Encapsulación

Mecanismo para modificar la visibilidad y hacer aplicaciones más seguras permitiendo restringir cómo se modifican los atributos.

El modificador `private` permite restringir el acceso directo a atributos y métodos, con el fin de acceder de una forma más segura a través de métodos ``getter`` y ``setter``.

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

Una enumeración o ``enum`` es un tipo de dato especial que representa una agrupación de constantes.

Crear una enumeración:

```java
public enum ProductCategory {  
    ELECTRONIC_DEVICES, FOOD, BOOKS  
}
```

Usar la enumeración:

```java
ProductCategory.ELECTRONIC_DEVICES
```

Se usa normalmente para agrupar un número fijo de datos como por ejemplo: días de la semana o categorías de producto (cuando hay pocas).

Un ejemplo: sirven para filtrar un dato en base a esa enumeración. Por ejemplo: filtrar productos por categoría.

## 6. Asociaciones entre clases (avanzado)

Una clase puede tener relación con otra clase.


### Asociación 1 elemento

Por ejemplo: Producto puede tener un fabricante.

```java
public class Product {

	private Manufacturer manufacturer;

}
```

A la hora de crear el producto, hay que especificar el fabricante:

```java
Manufacturer samsung = new Manufacturer();
Product product1 = new Product("prod1", 19.99d, 2, "green", 167, samsung);
```


### Asociación n elementos

Cuando una clase está asociada con otra clase y múltiples objetos de esa clase.

```java
public class House {  
  
    private Room[] rooms;
}
```



## 7. Interfaces

Una interfaz es un mecanismo de programación orientada a objetos para promover el código limpio y desacoplado con mejor mantenibilidad.

Declara métodos. Es necesario crear clases que implementen métodos de las interfaces para poder usarlas.

* Es considerado un **tipo abstracto** porque no proporciona el código de los métodos, solo los declara

Nota: no confundir con interfaces de usuario.

### implements

La palabra clave para implementar una interfaz es implements:

```java
public interface Saludo {  
    String saludar();  
}

public class SaludoFormal implements Saludo {  
    @Override  
    public String saludar() {  
        return "Ladies and Gentlemen!";  
    }  
}
```

### Ejemplo 1

* Interfaz: ComputerDatabase
	* Implementación 1 (clase): ComputerListDatabase
	* Implementación 2 (clase): ComputerSetDatabase

Main -> ComputerDatabase
* new ComputerListDatabase() o new ComputerSetDatabase()


### Ejemplo 2

* Interfaz: ProductDatabase
	* Implementación 1 (clase): ProductMySQLDatabase
	* Implementación 2 (clase): ProductPostgreSQLDatabase
	* Implementación 3 (clase): ProductMongoDBDatabase
	* Implementación 4 (clase): ProductExcelDatabase

Main -> ProductDatabase (interfaz):
* findAll()
* save()
* findById()
* update()
* remove()
![[interfaces.png]]

La interfaz actúa como contrato/plantilla/intermediario y dice lo que hay que hacer (findAll, findById, save) pero no lo hace, quien lo hace son las clases implementación.

Esto permite que la clase Main pueda cambiar una implementación por otra sin tener que cambiar nada más, por todas implementan los mismos métodos, todas hacen lo mismo.


### Ejemplo 3

Un coche tiene un filtro de aceite que puede ser reemplazado por otro filtro de aceite en cualquier momento.

En este caso el hueco del filtro de aceite y la acción filtrar aceite serían la interfaz, mientras que un filtro en concreto sería la implementación la cuál podemos quitar y poner otra en cualquier momento y que todo siga exactamente igual.

Si de lo contrario el filtro va soldado al motor (sin interfaz), entonces para cambiarlo obliga a cambiar medio motor.


### Ejemplo 4

Tarea 1 : dar de comer a un caballo
Empleado 1: da de comer al caballo tirando la alfafa por encima
Empleado 2: da de comer al caballo poniendo la alfalfa en el suelo
Empleado 3: da de comer al caballo poniendo la alfalfa en un cubo

La tarea común es "dar de comer al caballo" y cada empleado hace esa tarea y logra el mismo objetivo pero de forma diferente.


Tarea 1: extraer productos de una base de datos
Implementación 1 (mysql): trae los productos haciendo una consulta SELECT a MySQL
Implementación 2 (postgresql): trae los productos haciendo consulta SELECT a PostgreSQL
Implementación 3 (mongodb): trae los productos haciendo una query a MongoDB

La tarea común es "traer los productos almacenados" y cada implementación hace esa tarea y logra el mismo objetivo pero utilizando una base de datos diferentes.


### Abstracto vs concreto

* **Abstracto**: una interfaz, no implementa métodos, solo los declara, no tienen cuerpo.
* **Concreto**: una clase, sí implementa métodos, se les llama implementaciones o clases concretas

Permite cumplir con un principio SOLID:

**Principio de inversión de la dependencia (DIP)**: Según este principio, las clases (por ejemplo Main) sólo deben depender de las abstracciones y no de sus implementaciones concretas.

Sirven para promover código limpio, código desacoplado y evitar código spaguetti.

### Usar una interfaz

No:

```java
ComputerDatabase computerDatabase = new ComputerDatabase();
```

No: 

```java
ComputerSetDatabase computerDatabase = new ComputerSetDatabase();
```

Sí: 

```java
// a la izquierda la interfaz y a la derecha la clase
ComputerDatabase computerDatabase = new ComputerSetDatabase();
```

Sí: 

```java
ComputerDatabase computerDatabase = new ComputerListDatabase();
```


### Polimorfismo

```java

// A la izquierda la interfaz y a la derecha la clase (formas)
Saludo saludo1 = new SaludoFormal();
Saludo saludo2 = new SaludorInformal();
```

### instanceof

Operador para comprobar si un objeto es de determinada clase/interfaz.


```java

if(account instanceof SavingsAccount){
	System.out.println("Se trata de una cuenta de ahorro!")
}
```


## 8. Herencia

Mecanismo de reutilización de código. Permite evitar duplicar código (atributos, métodos) a la hora de crear nuevas clases.

Términos:

Clase superior en la herencia
- Clase padre  
- Clase base  
- Superclase

Clase hija que utiliza extends para extender a otra:
- Clase hija  
- Clase derivada  
- Subclase  

Permite formar jerarquías de clases.

Nota: no se admite herencia múltiples, es decir, no se puede hacer **extends** de 2 clases a la vez.

No obstante sí se puede hacer **implements** de más de una interfaz a la vez.

### extends

* Clase base: **Vehicle**
	* Clase hija 1: **Car**
		* Clase hija 1: ElectricCar
		* Clase hija 2: CombustionCar
		* Clase hija 3: HydrogenCar
	* Clase hija 2: **MotorCycle**
	* Clase hija 3: **Truck**

```java
public class Vehicle { // Clase base
// ... atributos y métodos ...
}

public class Car extends Vehicle { // Clase hija 1
// ... atributos y métodos heredados de Vehicle ...
// ... atributos y métodos propios ...
}

public class MotorCycle extends Vehicle { // Clase hija 2
// ... atributos y métodos heredados de Vehicle ...
// ... atributos y métodos propios ...
}
```

### super

La palabra super permite invocar a la clase superior desde una clase hija.

Se utiliza normalmente para invocar al constructor de la clase superior para rellenar los atributos heredados:

```java
public Car(Integer numWheels, String color, Integer numPassengers){  
    super(numWheels, color);
    this.numPassengers = numPassengers;  
}
```

