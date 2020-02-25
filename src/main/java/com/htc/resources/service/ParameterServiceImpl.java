package com.htc.resources.service;


import com.htc.resources.dao.SystemParameterRepository;
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

}
