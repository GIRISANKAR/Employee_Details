package com.htc.resources.controller;

import com.htc.resources.model.Project;
import com.htc.resources.model.Response;
import com.htc.resources.request.EmployeeRequest;
import com.htc.resources.request.ProjectRequest;
import com.htc.resources.response.EmployeeResponse;
import com.htc.resources.service.EmployeeService;
import com.htc.resources.service.ParameterService;
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

    @Autowired
    ParameterService parameterService;

    @GetMapping("availableEmployeeList")
    public List<EmployeeResponse> availableEmployeeList() {
        List<EmployeeResponse> list = employeeService.getEmployeeList();
        return list;
    }

    @PostMapping("addEmployee")
    public Response addEmployee(@RequestBody EmployeeRequest employeeRequest) {
        return employeeService.createOrUpdateEmployee(employeeRequest);
    }
    @PostMapping("addProject")
    public Response addProject(@RequestBody ProjectRequest projectRequest) {
        return projectService.createProject(projectRequest);
    }
    @PostMapping("deleteEmployee")
    public void deleteEmployee(@RequestParam int employeeId) {
        employeeService.inactiveEmployee(employeeId);
    }

    @GetMapping("getSkillNames")
    public List<String> getSkillNames() {
        return parameterService.getSkillNames();
    }

    @PostMapping("addSkill")
    public Response addSkill(@RequestParam String systemParameterRequest) {
        return parameterService.createOrUpdateSkillSet(systemParameterRequest);
    }

    @GetMapping("getProjectList")
    public List<Project> getProjectList() {
        return projectService.getProjectList();
    }

}
