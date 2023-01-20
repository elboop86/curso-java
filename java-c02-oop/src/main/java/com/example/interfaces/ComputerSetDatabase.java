package com.example.interfaces;

import java.util.ArrayList;
import java.util.HashSet;

public class ComputerSetDatabase implements ComputerDatabase {

    HashSet<Computer> database = new HashSet<>();

    @Override
    public boolean save(Computer computer) {
        return database.add(computer);
    }

    @Override
    public ArrayList<Computer> findAll() {
        return new ArrayList<>(database); // movemos los datos de un HashSet a un ArrayList
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


}
