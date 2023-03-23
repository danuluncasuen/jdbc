package com.endava.jdbc.service;

import com.endava.jdbc.entities.Departament;
import com.endava.jdbc.entities.Employee;
import com.endava.jdbc.entities.Invoice;
import com.endava.jdbc.repository.DepartmentRepository;
import com.endava.jdbc.repository.EmployeeRepository;
import com.endava.jdbc.repository.InvoiceRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.ClientInfoStatus;
import java.util.List;

@Service
@AllArgsConstructor
public class TestService {

    private final EmployeeRepository employeeRepository;
    private final InvoiceRepository invoiceRepository;
private final DepartmentRepository departmentRepository;

public List<Employee> getEmployeeByDepartment(String name){
    return departmentRepository.findDepartamentByName(name).getEmployees();
}


    public void testAddEmployeeAndInvoices() {
        Employee employee = new Employee();
        employee.setAge(30);
        employee.setName("Fred");

        Employee employee1 = new Employee();
        employee1.setAge(33);
        employee1.setName("Alex");

        Employee employee2 = new Employee();
        employee2.setAge(66);
        employee2.setName("Ivan");
        employeeRepository.saveAll(List.of(employee,employee1,employee2));
        Departament departament = new Departament();
        departament.setName("HR");
        departament.setEmployees(List.of(employee,employee1,employee2));
        departmentRepository.save(departament);



        Invoice invoiceNovember = new Invoice();
        invoiceNovember.setInvoiceNumber("34H8rhOf");
        invoiceNovember.setEmployee(employee);

        Invoice invoiceDecember = new Invoice();
        invoiceDecember.setInvoiceNumber("34H8rhO4");
        invoiceDecember.setEmployee(employee);

        employeeRepository.save(employee);
        invoiceRepository.saveAll(List.of(invoiceNovember, invoiceDecember));

        getEmployeeByDepartment("HR").stream().forEach(System.out::println);

        Employee employee3 = employeeRepository.findById(1L).get();
        employee3.setAge(44);
        System.out.println("sdhfgsdf");


        //employeeRepository.save(employee3);


    }

}
