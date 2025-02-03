package com.tutorial.Jpamapping.repository;

import com.tutorial.Jpamapping.entities.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long> {
}
