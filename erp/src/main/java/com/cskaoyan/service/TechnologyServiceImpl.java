package com.cskaoyan.service;

import com.cskaoyan.bean.Process;
import com.cskaoyan.bean.Technology;
import com.cskaoyan.bean.TechnologyPlan;
import com.cskaoyan.bean.TechnologyRequirement;
import com.cskaoyan.controller.TechnologyPlanController;
import com.cskaoyan.mapper.TechnologyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Desc
 * @Author xushuai
 * @CreateTime 2019/6/27 17:01
 **/
@Service
public class TechnologyServiceImpl implements TechnologyService {
    @Autowired
    TechnologyMapper technologyMapper;

    @Override
    public List<Technology> queryTechnologyList() {
        return technologyMapper.queryTechnologyList();
    }

    @Override
    public int insertTechnology(Technology technology) {
        return technologyMapper.insertTechnology(technology);
    }

    @Override
    public int updateTechnology(Technology technology) {
        return technologyMapper.updateTechnology(technology);
    }

    @Override
    public int deleteTechnology(String[] ids) {
        return technologyMapper.deleteTechnology(ids);
    }

    @Override
    public List<Technology> searchTechById(String searchValue) {
        return technologyMapper.searchTechById(searchValue);
    }

    @Override
    public List<Technology> searchTechByName(String searchValue) {
        return technologyMapper.searchTechByName(searchValue);
    }

    @Override
    public List<Technology> queryTechnologyRequList() {
        return technologyMapper.queryTechnologyRequList();
    }

    @Override
    public int insertRequ(TechnologyRequirement technologyRequirement) {
        return technologyMapper.insertRequ(technologyRequirement);
    }

    @Override
    public int updateRequ(TechnologyRequirement technologyRequirement) {
        return technologyMapper.updateRequ(technologyRequirement);
    }

    @Override
    public int deleteTechnologyRequ(String[] ids) {
        return technologyMapper.deleteTechnologyRequ(ids);
    }

    @Override
    public List<TechnologyRequirement> searchTechRequBytechRequId(String searchValue) {
        return technologyMapper.searchTechRequBytechRequId(searchValue);
    }

    @Override
    public List<TechnologyRequirement> searchTechRequBytechnologyName(String searchValue) {
        return technologyMapper.searchTechRequBytechnologyName(searchValue);
    }

    @Override
    public List<TechnologyPlan> queryTechnologyPlanList() {
        return technologyMapper.queryTechnologyPlanList();
    }

    @Override
    public int insertTechnologyPlan(TechnologyPlan technologyPlan) {
        return technologyMapper.insertTechnologyPlan(technologyPlan);
    }

    @Override
    public int updateTechnologyPlan(TechnologyPlan technologyPlan) {
        return technologyMapper.updateTechnologyPlan(technologyPlan);
    }

    @Override
    public int deleteTechnologyPlan(String[] ids) {
        return technologyMapper.deleteTechnologyPlan(ids);
    }

    @Override
    public List<TechnologyPlan> searchTechPlanById(String searchValue) {
        return technologyMapper.searchTechPlanById(searchValue);
    }

    @Override
    public List<TechnologyPlan> searchTechPlanByName(String searchValue) {
        return technologyMapper.searchTechPlanByName(searchValue);
    }

    @Override
    public List<Process> queryProcessList() {
        return technologyMapper.queryProcessList();
    }

    @Override
    public int insertProcess(Process process) {
        return technologyMapper.insertProcess(process);
    }

    @Override
    public int updateProcess(Process process) {
        return technologyMapper.updateProcess(process);
    }

    @Override
    public int deletePro(String[] ids) {
        return technologyMapper.deletePro(ids);
    }

    @Override
    public List<Process> searchProcessById(String searchValue) {
        return technologyMapper.searchProcessById(searchValue);
    }

    @Override
    public List<Process> searchProcessByName(String searchValue) {
        return technologyMapper.searchProcessByName(searchValue);
    }


}
