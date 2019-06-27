package com.cskaoyan.service;

import com.cskaoyan.bean.Technology;

import java.util.List;

/**
 * @Desc
 * @Author xushuai
 * @CreateTime 2019/6/27 17:01
 **/
public interface TechnologyService {
     List<Technology> queryTechnologyList(int page,int rows);

    int insertTechnology(Technology technology);

    int updateTechnology(Technology technology);

    int deleteTechnology(String[] ids);

    List<Technology> searchTechById(String  searchValue);

    List<Technology> searchTechByName(String searchValue);
}
