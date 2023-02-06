
# Capa servicio

* Agregar Capa servicio: una interfaz e implementación por cada entidad
* Lombok: https://projectlombok.org/features/
	* @Getter, @Setter, @ToString, @NoArgsConstructor....
* Logger



```
NoSuchBeanDefinitionException: No qualifying bean of type 'com.example.services.EmployeeService' available
```

Esto ocurre porque falta una anotación @Service en la clase servicio para que Spring pueda detectar esa clase y crear objetos de la misma.