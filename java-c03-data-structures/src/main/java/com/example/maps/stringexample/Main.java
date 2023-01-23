package com.example.maps.stringexample;

import java.util.HashMap;
import java.util.Map;

/*
python: lista, tuplas, conjuntos, diccionarios

Mapas

Estructura de pares de clave valor
HashMap<K, V>

La clave debe ser única, no se puede repetir
El valor se puede repetir

 */
public class Main {

    public static void main(String[] args) {

        // Crear un mapa
        HashMap<String, String> identities = new HashMap<>();

        // Añadir elementos en el mapa
        identities.put("111111A", "Rodolfo García");
        identities.put("222222B", "Rodolfo López");
        identities.put("333333C", "Patricia Martinez");
        identities.put("111111A", "Rodolfo García evolucionado"); // cambia el valor asociado a la clave

        System.out.println(identities);

        // obtener elementos
        String person = identities.get("222222B");
        System.out.println(person);

        // borrar elementos
        String patricia = identities.remove("333333C");
        System.out.println(patricia);

        boolean exists = identities.containsKey("333333C");
        System.out.println(exists);

        identities.putIfAbsent("111111A", "Rodolfo García superevolucionado"); // no cambia el valor asociado a la clave
        System.out.println(identities);

        System.out.println(identities.keySet()); // claves
        System.out.println(identities.values()); // valores
        System.out.println(identities.entrySet()); // pares de clave y valor al mismo tiempo

        for (String dni : identities.keySet()){
            System.out.println(dni);
        }

        for(String fullName : identities.values()){
            System.out.println(fullName);
        }

        for (Map.Entry<String, String> customer : identities.entrySet()) {
            System.out.println(customer.getKey());
            System.out.println(customer.getValue());
        }


        // Ejemplo de mapa con variables de entorno del sistema
        Map<String, String> properties = System.getenv();
        System.out.println(properties);
    }
}
