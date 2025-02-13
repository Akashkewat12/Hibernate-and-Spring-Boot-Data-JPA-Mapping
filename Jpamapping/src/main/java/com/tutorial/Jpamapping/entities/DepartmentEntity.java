package com.tutorial.Jpamapping.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;


@Entity
@Getter
@Setter
@EqualsAndHashCode(of = "id")
@AllArgsConstructor
@NoArgsConstructor
@Table(name="departments")
public class DepartmentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @OneToOne
    @JoinColumn(name = "department_manager")
    private EmployeeEntity manager;

    @OneToMany(mappedBy = "managerDepartment")
    private Set<EmployeeEntity> workers;
}
