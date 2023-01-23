package com.example.interfaces;

import java.util.ArrayList;
import java.util.List;

public class ComputerMySQLDatabase implements ComputerDatabase {


    @Override
    public boolean save(Computer computer) {
        return false;
    }

    @Override
    public ArrayList<Computer> findAll() {
        return null;
    }

    @Override
    public Computer findById(Long id) {
        return null;
    }

    @Override
    public List<Computer> findAllByRam(Integer ram) {
        return null;
    }
}
