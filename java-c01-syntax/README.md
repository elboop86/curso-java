* Comentario
	* Settings > Keymap > Comments > Comment with line comment > Podemos agregar un atajo de teclado

* Variables y Tipos de datos
	* Numéricos enteros
	* Numéricos decimales
	* Boolean
	* Caracteres
	* Texto
	* Arrays:`` double[]``
	* Inferencia de tipos: var

* Métodos de la clase String
	* length()
	* contains()
	* equalsIgnoreCase()
	* toUpperCase()
	* startsWith()
	* endsWith()

* Bloque String con triple comilla

* Operadores
	* Aritméticos
	* Asignación
	* Comparación
	* Lógicos
	* Incremento y decremento

* Constantes
	* final

* Estructuras de control
	* Condicionales
		* If
		* If Else
		* If ElseIf (cuando hay más de dos condiciones)
		* If dentro de otro If (anidamiento) (No recomendable)
		* Switch
	* Repetitivas
		* For i
		* Foreach
		* For con un if dentro
		* continue (Salta a la siguiente iteración)
		* break (rompe el bucle, se sale fuera)
		* While
		* Do While: se ejecuta siempre al menos una vez

* Funciones/Métodos

	* Parámetros (**ENTRADA**)
		* Sin parámetros (ideal)
		* Con un parámetro (ideal): 
			* hay que tener cuidado si el parámetro es erróneo (nulo o no es lo esperado)
		* Con dos parámetros (no tan ideal)
			* dificulta el testing
		* Con tres o más parámetros (no recomendable)
			* dificulta el testing
		* Con varargs (...)

	* Tipo de retorno (**SALIDA**)
		* **void**
			* Sin tipo de retorno 
		* **void** y **return**
			* Sin tipo de retorno: void y dentro un return sin nada para salir del método
		* **tipodedato** y **return**
			* en vez de void se pone un tipo de dato y un return dentro

	* **Nomenclatura**: 
		* utilizar nombres descriptivos, fáciles de entender que expliquen el método sin necesidad de usar comentarios
		* Ejemplos: get...(), set...(), calculate...(), find...(), 

	* **Sobrecarga**: 
		* permite tener diferentes versiones de una misma función, simplemente variando sus parámetros de entrada

	* **Sobrescritura**: 
		* cuando una función tiene @Override significa que está sobreescribiendo un método heredado. Por ejemplo el método toString(). 
		* La anotación @Override no es obligatoria, pero sí recomendable porque hace que el compilador compruebe que efectivamente se está sobrescribiendo correctamente.

* Alcance o Scope
	* Las variables creadas dentro de un bloque de código, es decir, entre llaves ``{}`` tienen su propio alcance. Esto significa que fuera de esas llaves no se pueden utilizar.
	* El plugin Rainbow brackets ayuda a colorear las llaves así se distingue mejor los alcances.

* Modificadores
	* public o private o protected
	* static
