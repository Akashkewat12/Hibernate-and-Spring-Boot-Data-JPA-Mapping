package com.tutorial.Jpamapping.repository;

import com.tutorial.Jpamapping.entities.DepartmentEntity;
import com.tutorial.Jpamapping.entities.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeportmentRepository extends JpaRepository<DepartmentEntity, Long> {

    DepartmentEntity findByManager(EmployeeEntity employeeEntity);
}
