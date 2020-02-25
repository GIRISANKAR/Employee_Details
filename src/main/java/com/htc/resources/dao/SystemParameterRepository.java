package com.htc.resources.dao;

import com.htc.resources.model.SystemParameter;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by giris on 17/2/20.
 */
public interface SystemParameterRepository extends JpaRepository<SystemParameter, Integer> {

    SystemParameter findByParamName(String paramName);
}
