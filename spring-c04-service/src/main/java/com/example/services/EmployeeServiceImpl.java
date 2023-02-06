package com.example.services;

import com.example.entities.Employee;
import com.example.repositories.EmployeeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    // atributos
    private static final Logger log = LoggerFactory.getLogger(EmployeeService.class);

    private EmployeeRepository employeeRepo;

    // constructores
    public EmployeeServiceImpl(EmployeeRepository employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    // métodos
    @Override
    public List<Employee> findAll() {
        return this.employeeRepo.findAll();
    }

    @Override
    public Optional<Employee> findById(Long id) {
        return this.employeeRepo.findById(id);
    }

    @Override
    public void raiseSalary(Long employeeId, Double quantity) {
        Optional<Employee> employeeOpt = this.findById(employeeId);
        if(employeeOpt.isEmpty())
            return;

        Employee employee = employeeOpt.get();

        Double baseSalary = employee.getSalary() != null ? employee.getSalary() : 0.0;
        Double updatedSalary = baseSalary + quantity;
        log.info("Actualizando salario de empleado con id {} de {} a {}", employeeId, baseSalary, updatedSalary);
        employee.setSalary(updatedSalary);

        employeeRepo.save(employee);
    }

    @Override
    public void raiseBonus(Long employeeId, Double quantity) {

    }

    @Override
    public void raiseAllBonusByWorkedYears(Double quantity) {

    }
}
