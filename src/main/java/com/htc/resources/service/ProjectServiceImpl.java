package com.htc.resources.service;


import com.htc.resources.dao.ProjectRepository;
import com.htc.resources.model.Project;
import com.htc.resources.model.Response;
import com.htc.resources.request.ProjectRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * Created by giris on 27/1/20.
 */
@Service
public class ProjectServiceImpl implements ProjectService {

    @Autowired
    ProjectRepository projectRepository;


    public List<Project> getProjectList(){

        List<Project> availableProjectList = projectRepository.findAll();
            return availableProjectList;
    }

    @Override
    public Response createProject(ProjectRequest projectRequest) {
        try {
            Project project = new Project();
            project.setProjectName(projectRequest.getProjectName());
            project.setProjectDescription(projectRequest.getProjectDescription());
            project.setDeliveryHead(projectRequest.getDeliveryHead());
            project.setSkillSet(projectRequest.getSkillSet());
           projectRepository.save(project);
        }catch (Exception exception){

            return prepareResponse("Submission failed",
                    Arrays.asList(exception.getMessage()), false);
        }
        return prepareResponse("Created successFully", null, true);


    }

    protected Response prepareResponse(String message, List<String> errors, boolean isSuccess) {
        Response response = new Response();
        response.setMessage(message);
        response.setErrors(errors);
        response.setStatus(isSuccess);
        return response;
    }
}
