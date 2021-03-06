package com.htc.resources.service;

import com.htc.resources.model.Employee;
import com.htc.resources.model.Response;
import com.htc.resources.request.EmployeeRequest;
import com.htc.resources.response.EmployeeResponse;

import java.util.List;

/**
 * Created by giris on 27/1/20.
 */

public interface EmployeeService {

    Response createOrUpdateEmployee(EmployeeRequest employeeRequest);
    List<EmployeeResponse> getEmployeeList();
    void inactiveEmployee(int empId);

}
