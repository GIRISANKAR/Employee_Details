package com.htc.resources.service;


import com.htc.resources.dao.ProjectRepository;
import com.htc.resources.model.Employee;
import com.htc.resources.model.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by giris on 27/1/20.
 */
@Service
public class ProjectServiceImpl implements ProjectService {

    @Autowired
    ProjectRepository projectRepository;


    public List<Project> getEmployeesByProject(String projectName){

        List<Project> availableEmployeeList = projectRepository.findByProjectName(projectName);
            return null;
    }
}
