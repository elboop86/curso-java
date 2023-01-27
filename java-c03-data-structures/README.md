
# Estructuras de datos

### Listas (List)

Una lista es un array dinámico, es decir, permite agregar nuevos elementos pero también borrarlos, actualizarlos, recuperarlos (CRUD).

CRUD: Create Retrieve/Read Update Delete.

* Admiten duplicados
* Conservan el orden, los elementos se añaden uno a continuación del otro

```java
ArrayList<String> names = new ArrayList<>();

ArrayList<Company> companies = new ArrayList<>();

var employees = new ArrayList<Employee>();

// usando interfaces: polimorfismo
List<Employee> employees = new ArrayList<>();
List<Employee> employees = new CopyOnWriteArrayList<>();
List<Employee> employees = new LinkedList<>();
```

### Conjuntos (Set)

Un conjunto es una estructura de datos que no admite duplicados y tampoco conserva el orden por lo que puede ser más óptimo que una lista dinámica.

* No admite duplicados: para que esto funcione correctamente con nuestras propias clases es necesario implementar los siguientes métodos en una clase: ``equals()`` y ``hashCode()``
* No conservan el orden

```java
HashSet<String> names = new HashSet<>();

HashSet<Company> companies = new HashSet<>();

var employees = new HashSet<Employee>();

// usando interfaces: polimorfismo
// izquierda el tipo abstracto (interfaz) y a la derecha la clase concreta
Set<Employee> employees = new HashSet<>();

```

### Mapa (Map)

Estructura de pares de clave valor. 

* Las claves tienen que ser únicas
* El valor se puede repetir
* Se puede utilizar para agrupar datos en base a claves

```java
HashMap<String, String> names = new HashMap<>();

HashMap<String, Company> companies = new HashMap<>();

var employees = new HashMap<String, Employee>();

// usando interfaces: polimorfismo
// izquierda el tipo abstracto (interfaz) y a la derecha la clase concreta
Map<String, Employee> employees = new HashMap<>();

// ejemplo agrupación de datos (avanzado)
Map<EmployeeType, List<Employee>> employees = new HashMap<>();
```

