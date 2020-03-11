package com.htc.resources.service;


import com.htc.resources.dao.SystemParameterRepository;
import com.htc.resources.model.Response;
import com.htc.resources.model.SystemParameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Arrays;
import java.util.List;

/**
 * Created by giris on 27/1/20.
 */
@Service
public class ParameterServiceImpl implements ParameterService {

    @Autowired
    SystemParameterRepository systemParameterRepository;

    @Override
    public List<String> getSkillNames() {
        SystemParameter systemParameter = systemParameterRepository.findByParamName("skills");
        String[] skills = systemParameter.getValue().split(";");
        return Arrays.asList(skills);
    }

    @Override
    public Response createOrUpdateSkillSet(String skillName) {
        try {
        SystemParameter systemParameter = systemParameterRepository.findByParamName("skills");
        systemParameter.setValue(systemParameter.getValue() != null  ? systemParameter.getValue() + ";" + skillName : skillName);
        systemParameterRepository.save(systemParameter);
    }catch (Exception exception){
        return prepareResponse("Submission failed",
                Arrays.asList(exception.getMessage()), false);
    }
        return prepareResponse("Submitted successFully", null, true);
    }

    protected Response prepareResponse(String message, List<String> errors, boolean isSuccess) {
        Response response = new Response();
        response.setMessage(message);
        response.setErrors(errors);
        response.setStatus(isSuccess);
        return response;
    }

}


