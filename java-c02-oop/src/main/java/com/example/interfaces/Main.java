package com.example.interfaces;

public class Main {

    public static void main(String[] args) {


        Computer computer1 = new Computer(1L, "Asus A55A", 8, 4);
        Computer computer2 = new Computer(2L, "MSI Modern 15", 32, 8);
        Computer computer3 = new Computer(3L, "Acer 45G", 32, 8);

        // Operaciones con objetos computers

        // Guardar, recuperar, actualizar, borrar
        // cálculos en variables numéricas
        // cálculos en variables numéricas agrupando por variables categóricas


        // tipo abstracto (interfaz)                 tipo concreto (clase)

//        ComputerDatabase computerDatabase = new ComputerListDatabase();
//        ComputerDatabase computerDatabase = new ComputerSetDatabase();
        ComputerDatabase computerDatabase = new ComputerMapDatabase();

        computerDatabase.save(computer1);
        computerDatabase.save(computer2);
        computerDatabase.save(computer3);

        System.out.println(computerDatabase.findAll());

        Computer computer1FromDB = computerDatabase.findById(1L);
        System.out.println(computer1FromDB);

        System.out.println(computerDatabase.findAllByRam(32));
    }
}




























