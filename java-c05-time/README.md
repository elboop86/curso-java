
# API java.time

El paquete java.time se introduce en Java 8 (2014) y proporciona una API modernizada para trabajar con fechas.

## LocalDate

Representa una fecha: YYYY-MM-dd
Por ejemplo: 2023-02-14

```java
LocalDate date1 = LocalDate.of(2023, 1, 1);
LocalDate date2 = LocalDate.now(); // hoy
```


## LocalTime

Representa un tiempo: HH:mm:ss
Por ejemplo: 11:04:32

```java
LocalTime time1 = LocalTime.of(16, 30);
```


## LocalDateTime

Combina tanto fecha como tiempo

Formato: YYYY-MM-ddTHH:mm:ss
Ejemplo: 2023-01-26T11:06:31.500919400

```java
LocalDateTime date1 = LocalDateTime.of(2023, 5, 24, 10, 30);
```

## Duration

Una duración representa el tiempo transcurrido entre dos tiempos:

```java
LocalTime init = LocalTime.of(9, 0);  
LocalTime end = LocalTime.of(14, 0);  
Duration duration = Duration.between(init, end);
```

## Period

Un periodo representa el tiempo transcurrido entre dos fechas:

```java
LocalDate birthDate = LocalDate.of(1991, 5, 12);  
LocalDate today = LocalDate.now();  
Period period = Period.between(birthDate, today);
```