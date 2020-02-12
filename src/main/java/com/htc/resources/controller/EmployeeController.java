package com.htc.resources.controller;


import com.htc.resources.model.Employee;
import com.htc.resources.model.Project;
import com.htc.resources.request.EmployeeRequest;
import com.htc.resources.response.EmployeeResponse;
import com.htc.resources.service.EmployeeService;
import com.htc.resources.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by giris on 27/1/20.
 */

@CrossOrigin(origins = "*")
@RestController("/")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @Autowired
    ProjectService projectService;


   @GetMapping("availableEmployeeList")
    public List<EmployeeResponse> availableEmployeeList(){
        List<EmployeeResponse> list = employeeService.getEmployeeList();
        System.out.println(list);
        return list;
    }


    @PostMapping("addEmployee")
    public String addEmployee(@RequestBody EmployeeRequest employeeRequest){
        employeeService.createOrUpdateEmployee(employeeRequest);
        return " Success";
    }


    @GetMapping("getEmployeesByProject")
    public List<Project> getEmployeesByProject(@RequestParam String projectName){
        List<Project> list = projectService.getEmployeesByProject(projectName);
        return list;
    }


    @GetMapping("getEmployeesById")
    public List<Employee> getEmployeesById(@RequestParam int employeeId){
        List<Employee> list = employeeService.findByEmpId(employeeId);
        return list;
    }


    @PostMapping("deleteEmployee")
    public void deleteEmployee(@RequestParam int employeeId){
        employeeService.deleteEmployee(employeeId);
    }


}
