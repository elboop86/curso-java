
# Spring

## Configuración

Este proyecto Spring Boot contiene:

* MySQL
* Spring Data JPA

Creación de entidades usando:

* @Entity
* @Id
* @GeneratedValue
* @Column

En application.properties se añaden las propiedades de configuración para conectarse a MySQL.

## Asociaciones

De uno a uno
* @OneToOne
* @JoinColumn(unique = true)

## Excepciones

### InvalidDataAccessApiUsageException

```
Exception in thread "main" org.springframework.dao.InvalidDataAccessApiUsageException: org.hibernate.TransientPropertyValueException: object references an unsaved transient instance - save the transient instance before flushing : com.example.entities.Author.address -> com.example.entities.Address
```

Esto ocurre porque se ha intentado guardar un author sin haber guardado el objeto address primero.


### DataIntegrityViolationException

```
Exception in thread "main" org.springframework.dao.DataIntegrityViolationException: could not execute statement; SQL [n/a]; constraint
```

Esto ocurre porque se está duplicando una clave única, es decir, que una columna debe ser única pero estamos repitiendo ese dato en múltiples objetos y por tanto la base de datos no lo permite y lanza excepción.