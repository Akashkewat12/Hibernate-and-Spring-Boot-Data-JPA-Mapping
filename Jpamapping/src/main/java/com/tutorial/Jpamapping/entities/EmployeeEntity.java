package com.tutorial.Jpamapping.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Getter
@Setter
@EqualsAndHashCode(of = "id")
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

    @ManyToOne
    @JoinColumn(name="worker_department_id", referencedColumnName = "id")
    private DepartmentEntity managerDepartment;

    //@OneToMany
    //private Set<EmployeeEntity> workers;
}
