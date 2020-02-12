package com.htc.resources.dao;

import com.htc.resources.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

/**
 * Created by giris on 27/1/20.
 */
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

    List<Employee> findByEmpId(int employeeId);


}
