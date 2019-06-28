package com.cskaoyan.mapper;

import com.cskaoyan.bean.Process;
import com.cskaoyan.bean.Technology;
import com.cskaoyan.bean.TechnologyPlan;
import com.cskaoyan.bean.TechnologyRequirement;
import com.cskaoyan.controller.TechnologyPlanController;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Desc
 * @Author xushuai
 * @CreateTime 2019/6/27 17:05
 **/
public interface TechnologyMapper {
    List<Technology> queryTechnologyList();

    int insertTechnology(@Param("tech") Technology technology);

    int updateTechnology(@Param("tech") Technology technology);

    int deleteTechnology(@Param("ids") String[] ids);

    List<Technology> searchTechById(@Param("id") String searchValue);

    List<Technology> searchTechByName(@Param("name") String searchValue);

    List<TechnologyRequirement> queryTechnologyRequList();

    int insertRequ(@Param("techRequ") TechnologyRequirement technologyRequirement);

    int updateRequ(@Param("techRequ") TechnologyRequirement technologyRequirement);

    int deleteTechnologyRequ(@Param("ids") String[] ids);

    List<TechnologyRequirement> searchTechRequBytechRequId(@Param("id") String searchValue);

    List<TechnologyRequirement> searchTechRequBytechnologyName(@Param("name") String searchValue);

    List<TechnologyPlan> queryTechnologyPlanList();

    int insertTechnologyPlan(@Param("techPlan") TechnologyPlan technologyPlan);

    int updateTechnologyPlan(@Param("techPlan") TechnologyPlan technologyPlan);

    int deleteTechnologyPlan(@Param("ids") String[] ids);

    List<TechnologyPlan> searchTechPlanById(@Param("id") String searchValue);

    List<TechnologyPlan> searchTechPlanByName(@Param("name") String searchValue);

    List<Process> queryProcessList();

    int insertProcess(@Param("pro") Process process);

    int updateProcess(@Param("pro") Process process);

    int deletePro(@Param("ids") String[] ids);

    List<Process> searchProcessById(@Param("id") String searchValue);

    List<Process> searchProcessByName(@Param("name") String searchValue);

    Technology queryTechnologyById(@Param("id") String technologyId);

    TechnologyPlan queryTechnologyPlanById(@Param("id") String technologyPlanId);
}
