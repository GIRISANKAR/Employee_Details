package com.htc.resources.service;


import com.htc.resources.model.Project;
import com.htc.resources.model.Response;
import com.htc.resources.request.ProjectRequest;

import java.util.List;

/**
 * Created by giris on 27/1/20.
 */

public interface ProjectService  {
    List<Project> getProjectList();
     Response createProject(ProjectRequest projectRequest);
}
