package com.htc.resources.service;


import com.htc.resources.dao.EmployeeRepository;
import com.htc.resources.dao.ProjectRepository;
import com.htc.resources.model.*;
import com.htc.resources.request.EmployeeRequest;
import com.htc.resources.request.EmployeeProjectRequest;
import com.htc.resources.request.EmployeeSkillRequest;
import com.htc.resources.request.TrainingRequest;
import com.htc.resources.response.EmployeeResponse;
import com.htc.resources.response.EmployeeProjectResponse;
import com.htc.resources.response.EmployeeSkillResponse;
import com.htc.resources.response.TrainingResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.logging.Logger;


/**
 * Created by giris on 27/1/20.
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    @Autowired
    ProjectRepository projectRepository;
    Logger logger;

    DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

    @Override
    public List<EmployeeResponse> getEmployeeList() {

        List<EmployeeResponse> employeeResponseList = new ArrayList<>();
        List<Employee> employeeList = employeeRepository.findAll();
        for (Employee employees : employeeList) {
            EmployeeResponse employeeResponse = new EmployeeResponse();
            if (employees.isActive() == true) {
                employeeResponse.setEmpId(employees.getEmpId());
                employeeResponse.setEmpName(employees.getEmpName());
                employeeResponse.setDesignation(employees.getDesignation());
                employeeResponse.setPrimaryWorkLocation(employees.getPrimaryWorkLocation());
                employeeResponse.setHtcExperience(employees.getHtcExperience());
                employeeResponse.setOverallExperience(employees.getOverallExperience());
                employeeResponse.setPrimarySkills(employees.getPrimarySkills());
                employeeResponse.setActive(employees.isActive());
                employeeResponse.setPersonalDetailsId(employees.getPersonalDetails().getPersonalDetailsId());
                employeeResponse.setOfficialEmailAddr(employees.getPersonalDetails().getOfficialEmailAddr());
                employeeResponse.setEmailAddr(employees.getPersonalDetails().getEmailAddr());
                employeeResponse.setExtensionNumber(employees.getPersonalDetails().getExtensionNumber());
                employeeResponse.setMobileNumber(employees.getPersonalDetails().getMobileNumber());
                employeeResponse.setAlternativeMobileNumber(employees.getPersonalDetails().getAlternativeMobileNumber());
                employeeResponse.setAddressId(employees.getPersonalDetails().getAddress().getAddressId());
                employeeResponse.setAddressLine(employees.getPersonalDetails().getAddress().getAddressLine());
                employeeResponse.setCity(employees.getPersonalDetails().getAddress().getCity());
                employeeResponse.setState(employees.getPersonalDetails().getAddress().getState());
                employeeResponse.setCountry(employees.getPersonalDetails().getAddress().getCountry());
                employeeResponse.setPincode(employees.getPersonalDetails().getAddress().getPincode());
                prepareProjectResponse(employees.getProjectList(), employeeResponse);
                prepareSkillResponse(employees.getSkillList(), employeeResponse);
                prepareTrainingResponse(employees.getTrainingList(),employeeResponse);
                employeeResponseList.add(employeeResponse);
            }
        }
        return employeeResponseList;
    }

    @Override
    public void inactiveEmployee(int empId) {
         Employee employee = employeeRepository.findByEmpId(empId);
         employee.setActive(false);
         employeeRepository.save(employee);
    }

    @Override
    public Response createOrUpdateEmployee(EmployeeRequest employeeRequest) {
        try {
            Employee employee = new Employee();
            PersonalDetails personalDetails = new PersonalDetails();
            prepareEmployee(employeeRequest, employee);
            preparePersonalDetails(employeeRequest, personalDetails, employee);
            employee.setPersonalDetails(personalDetails);
            employeeRepository.save(employee);
        }catch (Exception exception){

            return prepareResponse("Submission failed",
                    Arrays.asList(exception.getMessage()), false);
        }
        return prepareResponse("Submitted successFully", null, true);


    }


    private void prepareEmployee(EmployeeRequest employeeRequest, Employee employee) throws Exception{
        employee.setEmpId(employeeRequest.getEmpId());
        employee.setEmpName(employeeRequest.getEmpName());
        employee.setDesignation(employeeRequest.getDesignation());
        employee.setPrimaryWorkLocation(employeeRequest.getPrimaryWorkLocation());
        employee.setHtcExperience(employeeRequest.getHtcExperience());
        employee.setOverallExperience(employeeRequest.getOverallExperience());
        employee.setPrimarySkills(employeeRequest.getPrimarySkills());
        employee.setCreatedDate(new Date());
        employee.setActive(true);
        prepareSkill(employeeRequest.getSkills(), employee);
        prepareProject(employeeRequest.getProjects(), employee);
        prepareTraining(employeeRequest.getTrainings(),employee);
    }

    private void preparePersonalDetails(EmployeeRequest employeeRequest, PersonalDetails personalDetails, Employee employee) throws Exception{
        Address address = new Address();
        personalDetails.setPersonalDetailsId(employeeRequest.getPersonalDetailsId());
        personalDetails.setOfficialEmailAddr(employeeRequest.getOfficialEmailAddr());
        personalDetails.setEmailAddr(employeeRequest.getEmailAddr());
        personalDetails.setExtensionNumber(employeeRequest.getExtensionNumber());
        personalDetails.setMobileNumber(employeeRequest.getMobileNumber());
        personalDetails.setAlternativeMobileNumber(employeeRequest.getAlternativeMobileNumber());
        prepareAddress(employeeRequest, address);
        personalDetails.setAddress(address);
    }

    private void prepareAddress(EmployeeRequest employeeRequest, Address address) throws Exception{
        address.setAddressId(employeeRequest.getAddressId());
        address.setAddressLine(employeeRequest.getAddressLine());
        address.setCity(employeeRequest.getCity());
        address.setState(employeeRequest.getState());
        address.setCountry(employeeRequest.getCountry());
        address.setPincode(employeeRequest.getPincode());
    }

    private void prepareSkill(List<EmployeeSkillRequest> skillList, Employee employee) throws Exception{
        List<EmployeeSkill> skills = new ArrayList<>();
        for (EmployeeSkillRequest skillRequest : skillList) {
            EmployeeSkill skill = new EmployeeSkill();
            skill.setSkillId(skillRequest.getSkillId());
            skill.setSkillName(skillRequest.getSkillName());
            skill.setExperience(skillRequest.getExperience());
            skill.setEmployee(employee);
            skills.add(skill);
        }
        employee.setSkillList(skills);
    }


    private void prepareProject(List<EmployeeProjectRequest> projectRequestList, Employee employee) throws Exception{


        List<EmployeeProject> projects = new ArrayList<>();
        for (EmployeeProjectRequest projectRequest : projectRequestList) {
            EmployeeProject project = new EmployeeProject();
            project.setEmployeeProjectId(projectRequest.getEmployeeProjectId());
            project.setProject(projectRepository.findById(projectRequest.getProjectId()).get());
            project.setReportingTo(projectRequest.getReportingTo());
            project.setLocation(projectRequest.getLocation());
            project.setStartDate( dateFormat.parse(projectRequest.getStartDate()));
            project.setEndDate(dateFormat.parse(projectRequest.getEndDate()));
            project.setActive(projectRequest.isActive());
            project.setEmployee(employee);
            projects.add(project);
        }
        employee.setProjectList(projects);
    }
    private void prepareTraining(List<TrainingRequest> trainingRequestsList, Employee employee) throws Exception{
        List<Training> trainings= new ArrayList<>();
        for (TrainingRequest trainingRequest : trainingRequestsList) {
            Training training = new Training();
            training.setTrainingId(trainingRequest.getTrainingId());
            training.setNameOfTraining(trainingRequest.getNameOfTraining());
            training.setDuration(trainingRequest.getDuration());
            training.setTrainingDescription(trainingRequest.getTrainingDescription());
            training.setEmployee(employee);
            trainings.add(training);
        }
        employee.setTrainingList(trainings);
    }

    private void prepareSkillResponse(List<EmployeeSkill> skillList, EmployeeResponse employeeResponse) {
        List<EmployeeSkillResponse> skillResponses = new ArrayList<>();
        for (EmployeeSkill skill : skillList) {
            EmployeeSkillResponse skillResponse = new EmployeeSkillResponse();
            skillResponse.setSkillId(skill.getSkillId());
            skillResponse.setSkillName(skill.getSkillName());
            skillResponse.setExperience(skill.getExperience());
            skillResponses.add(skillResponse);
        }
        employeeResponse.setSkills(skillResponses);
    }


    private void prepareProjectResponse(List<EmployeeProject> projectList, EmployeeResponse employeeResponse) {

        List<EmployeeProjectResponse> projectResponses = new ArrayList<>();
        String projectName = "" ;
        for (EmployeeProject project : projectList) {

                EmployeeProjectResponse projectResponse = new EmployeeProjectResponse();
                projectResponse.setEmployeeProjectId(project.getEmployeeProjectId());
                projectResponse.setReportingTo(project.getReportingTo());
                projectResponse.setStartDate(dateFormat.format(project.getStartDate()));
                projectResponse.setEndDate(dateFormat.format(project.getEndDate()));
                projectResponse.setLocation(project.getLocation());
                projectResponse.setActive(project.isActive());
                if(project.getProject() != null) {
                    projectResponse.setProjectId(project.getProject().getProjectId());
                    projectResponse.setProjectName(project.getProject().getProjectName());
                    projectResponse.setSkillset(project.getProject().getSkillSet());
                    projectResponse.setDeliveryHead(project.getProject().getDeliveryHead());
                    projectResponse.setProjectDescription(project.getProject().getProjectDescription());
                    if(project.isActive()) {
                        projectName = projectName + project.getProject().getProjectName() + ",";
                    }
                }
                projectResponses.add(projectResponse);
        }
        if(projectName.length()>0) {
            employeeResponse.setProjectName(projectName.substring(0, projectName.length() - 1));
        }
        employeeResponse.setProjects(projectResponses);
    }

    private void prepareTrainingResponse(List<Training> trainingList, EmployeeResponse employeeResponse) {
        List<TrainingResponse> trainingResponses = new ArrayList<>();
        for (Training training : trainingList) {
            TrainingResponse trainingResponse = new TrainingResponse();
            trainingResponse.setTrainingId(training.getTrainingId());
            trainingResponse.setNameOfTraining(training.getNameOfTraining());
            trainingResponse.setTrainingDescription(training.getTrainingDescription());
            trainingResponse.setDuration(training.getDuration());
            trainingResponses.add(trainingResponse);
        }
        employeeResponse.setTrainings(trainingResponses);
    }

    protected Response prepareResponse(String message, List<String> errors, boolean isSuccess) {
        Response response = new Response();
        response.setMessage(message);
        response.setErrors(errors);
        response.setStatus(isSuccess);
        return response;
    }
}


