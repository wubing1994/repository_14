package com.cskaoyan.service;

import com.cskaoyan.bean.Process;
import com.cskaoyan.bean.Technology;
import com.cskaoyan.bean.TechnologyPlan;
import com.cskaoyan.bean.TechnologyRequirement;
import com.cskaoyan.controller.TechnologyPlanController;

import java.util.List;

/**
 * @Desc
 * @Author xushuai
 * @CreateTime 2019/6/27 17:01
 **/
public interface TechnologyService {
     List<Technology> queryTechnologyList();

    int insertTechnology(Technology technology);

    int updateTechnology(Technology technology);

    int deleteTechnology(String[] ids);

    List<Technology> searchTechById(String  searchValue);

    List<Technology> searchTechByName(String searchValue);

    List<TechnologyRequirement> queryTechnologyRequList();

    int insertRequ(TechnologyRequirement technologyRequirement);

    int updateRequ(TechnologyRequirement technologyRequirement);

    int deleteTechnologyRequ(String[] ids);

    List<TechnologyRequirement> searchTechRequBytechRequId(String searchValue);

    List<TechnologyRequirement> searchTechRequBytechnologyName(String searchValue);

    List<TechnologyPlan> queryTechnologyPlanList();

    int insertTechnologyPlan(TechnologyPlan technologyPlan);

    int updateTechnologyPlan(TechnologyPlan technologyPlan);

    int deleteTechnologyPlan(String[] ids);

    List<TechnologyPlan> searchTechPlanById(String searchValue);

    List<TechnologyPlan> searchTechPlanByName(String searchValue);

    List<Process> queryProcessList();

    int insertProcess(Process process);

    int updateProcess(Process process);

    int deletePro(String[] ids);

    List<Process> searchProcessById(String searchValue);

    List<Process> searchProcessByName(String searchValue);

    Technology queryTechnologyById(String technologyId);

    TechnologyPlan queryTechnologyPlanById(String technologyPlanId);
}
