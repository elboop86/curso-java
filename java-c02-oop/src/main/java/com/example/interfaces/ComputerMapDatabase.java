package com.example.interfaces;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ComputerMapDatabase implements ComputerDatabase {

    // HashMap<Long, Computer> database = new HashMap<>();
    Map<Long, Computer> database = new HashMap<>();

    // 1, Computer(1, "ASUS")
    // 2, Computer(2, "MSI")

    @Override
    public boolean save(Computer computer) {
        database.put(computer.getId(), computer);
        return true;
    }

    @Override
    public ArrayList<Computer> findAll() {
        return new ArrayList<>(database.values());
    }

    @Override
    public Computer findById(Long id) {
        return database.get(id);
    }

    @Override
    public List<Computer> findAllByRam(Integer ram) {

        // Buscar todos los ordenadores filtrando por memoria RAM

        // programación defensiva: se comprueba que los parámetros de entrada sean correctos antes de realizar las acciones
        if (ram == null || ram <= 0)
            return new ArrayList<>();

        List<Computer> computersByRam = new ArrayList<>();

        for (Computer computer : database.values()){
            if(computer.getRam() == ram)
                computersByRam.add(computer);
        }

        return computersByRam;

    }

}
