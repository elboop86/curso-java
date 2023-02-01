
# Spring

Enlace para crear proyecto:

https://start.spring.io/#!type=maven-project&language=java&platformVersion=3.0.2&packaging=jar&jvmVersion=19&groupId=com.example&artifactId=demo&name=spring-c01-data-jpa&description=Demo%20project%20for%20Spring%20Boot&packageName=com.example&dependencies=data-jpa,mysql


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

### Uno a uno

* @OneToOne
* @JoinColumn(unique = true)

Author tiene un Address y un Address pertenece únicamente a un solo Author.


### Muchos a uno

* @ManyToOne

Muchos Book tienen un mismo Author.

Many books to One Author.

Se genera una columna **author_id** en la tabla **books**.


### Uno a Muchos

* @OneToMany

Un Author tiene muchos Books.

One Author to Many Books.



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