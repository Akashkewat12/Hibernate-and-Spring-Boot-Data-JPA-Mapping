package com.tutorial.Jpamapping.service;

import com.tutorial.Jpamapping.entities.EmployeeEntity;
import com.tutorial.Jpamapping.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public EmployeeEntity createNewEmployee(EmployeeEntity employeeEntity) {
        return employeeRepository.save(employeeEntity);
    }

    public EmployeeEntity getEmployeeById(Long id) {

        return employeeRepository.findById(id).orElse(null);
    }
}
