package com.example.interfaces;

import java.util.ArrayList;
import java.util.List;

/*
Clase que implementa una interfaz

La interfaz dice lo que hay que hacer: save(), findAll()
La clase lo implementa, lo hace: proporciona el body de save(), findAll(), ....
 */
public class ComputerListDatabase implements ComputerDatabase {

    // atributos
    private ArrayList<Computer> database = new ArrayList<>();

    // constructores
    public ComputerListDatabase(){}

    // getter y setter

    // MÉTODOS CONCRETOS (IMPLEMENTAN LOS MÉTODOS ABSTRACTOS)
    @Override
    public boolean save(Computer computer) {
        return database.add(computer);
    }

    @Override
    public ArrayList<Computer> findAll() {
        return database;
    }

    @Override
    public Computer findById(Long id) {
        if(id == null || id <= 0)
            return null;

        for (Computer computer : database){
            if (computer.getId() == id){
                return computer;
            }
        }
        return null;
    }

    @Override
    public List<Computer> findAllByRam(Integer ram) {
        if(ram == null || ram <= 0)
            return new ArrayList<>();

        List<Computer> computersByRam = new ArrayList<>();
        for (Computer computer : database){
            if(computer.getRam() == ram){
                computersByRam.add(computer);
            }
        }

        return computersByRam;
    }


}
