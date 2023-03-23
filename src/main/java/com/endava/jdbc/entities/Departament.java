package com.endava.jdbc.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.repository.cdi.Eager;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data

public class Departament {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;
    @OneToMany(fetch = FetchType.EAGER)
    private List<Employee> employees;


}
