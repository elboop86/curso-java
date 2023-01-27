
* Clase
	* Atributos
	* Constructores
	* Getter y Setter
	* toString()
	* equals() y hashCode()
	* Métodos

* Objetos
	* Se crean a partir de clases utilizando el operador new
	* `NombreClase nombreObjeto = new métodoconstructor()`

* static
	* A nivel de atributo
	* A nivel de método
	* Permite utilizar atributo o método sin necesidad de crear un objeto. Ejemplo: ``Customer.saludar()``

* Encapsulación
	* private
		* A nivel de atributo
		* A nivel de método
	* Métodos getter y setter
		* Sirven para acceder o modificar los atributos private

* Enumeraciones (enum)
	* Agrupación de constantes
	* Se utilizan para datos fijos que no van a cambiar. Ejemplo los días de la semana, los meses.

* Clases envoltorio (wrappers):
	* Integer, Double, Character, Float, Long.....
	* Envuelven los datos primitivos: int, double, char, float, long
	* Sirven para permitir valores null
	* Los tipos primitivos no admiten null
	* Las estructuras de datos Collections en Java necesitan objetos por tanto usan tipos envoltorio

* Asociaciones (avanzado)
	* Asociaciones **de a uno**
		* Ejemplo: un producto tiene un fabricante
		* Ejemplo: un BankAccount tiene un Customer. También el Customer puede tener un atributo BankAccount.
	* Asociaciones **de a muchos**
		* Ejemplo: Un fabricante tiene muchos productos
		* Ejemplo: Un fabricante tiene muchos coches
		* Se utiliza una estructura de datos como atributo, por ejemplo una lista de coches.


* Interfaces (avanzado) (**implements**)
	* Crear una **interfaz** (ABSTRACTO)
	* Crear una **clase** (CONCRETO) que implementa la interfaz: **implements**
	* Ejemplo implementar 1 interfaz:
		* `public class SaludoFormal implements Saludo { }`
	* Ejemplo implementar 2 interfaces: 
		* `public class SaludoFormal implements Saludo, Despedida { }`
	* Se utilizan para definir operaciones
	* Se puede cambiar una implementación por otra
	* El objetivo es DESACOPLAR el código

* Polimorfismo (más avanzado)
	* Múltiples formas
	* interfaces
		* En el caso de las **interfaces** se dice que cada clase implementación es una forma, pero todas ellas actúan como un mismo tipo de objeto (interfaz)
		* A la izquierda el tipo **abstracto**, a la derecha el tipo **concreto**:
		* `ComputerDatabase database = new ComputerListDatabase();`
		* En el caso de las interfaces quiere decir que a la izquierda la interfaz y a la derecha la clase.


* Herencia (avanzado) (**extends**)
	* Permite jerarquías de clases
	* Sirve para reutilizar código y evitar duplicar código
	* El código de una superclase es heredado por una clase hija


