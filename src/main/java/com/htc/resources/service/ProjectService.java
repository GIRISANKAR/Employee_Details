package com.htc.resources.service;


import com.htc.resources.model.Employee;
import com.htc.resources.model.Project;

import java.util.List;

/**
 * Created by giris on 27/1/20.
 */

public interface ProjectService {
    List<Project> getEmployeesByProject(String projectName);
}
