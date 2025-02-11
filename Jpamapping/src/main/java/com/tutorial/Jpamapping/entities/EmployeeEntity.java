package com.tutorial.Jpamapping.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.tutorial.Jpamapping.repository.EmployeeRepository;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name="employees")
public class EmployeeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;


    @OneToOne(mappedBy = "manager")
    @JsonIgnore
    private DepartmentEntity manageDepartment;
}
