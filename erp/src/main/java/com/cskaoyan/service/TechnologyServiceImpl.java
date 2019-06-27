package com.cskaoyan.service;

import com.cskaoyan.bean.Technology;
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
    public List<Technology> queryTechnologyList(int page,int rows) {
        return technologyMapper.queryTechnologyList(page,rows);
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
}
