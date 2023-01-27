
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


* Interfaces (avanzado)
	* Crear una interfaz (ABSTRACTO)
	* Crear una clase (CONCRETO) que implementa la interfaz: **implements**
	* Ejemplo implementar 1 interfaz:
		* `public class SaludoFormal implements Saludo { }`
	* Ejemplo implementar 2 interfaces: 
		* `public class SaludoFormal implements Saludo, Despedida { }`




