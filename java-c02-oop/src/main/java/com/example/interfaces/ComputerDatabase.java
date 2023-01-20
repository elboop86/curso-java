package com.example.interfaces;

import java.util.ArrayList;

/*
Declara métodos

Dice lo que hay que hacer pero no lo hace

¿Quién lo hace?

Las implementaciones de la interfaz, es decir, clases

Se da por hecho que los métodos de las interfaces son public por defecto

Los métodos de la interfaz son abstractos, es decir, solo se declaran no tienen cuerpo.

 */
public interface ComputerDatabase {

    boolean save(Computer computer);

    ArrayList<Computer> findAll();

    Computer findById(Long id);
}
