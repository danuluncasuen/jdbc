package com.endava.jdbc.repository;

import com.endava.jdbc.entities.Departament;
import com.endava.jdbc.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DepartmentRepository extends JpaRepository<Departament,Long> {

    Departament findDepartamentByName(String name);
}
