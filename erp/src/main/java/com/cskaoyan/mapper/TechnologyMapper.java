package com.cskaoyan.mapper;

import com.cskaoyan.bean.Technology;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Desc
 * @Author xushuai
 * @CreateTime 2019/6/27 17:05
 **/
public interface TechnologyMapper {
    List<Technology> queryTechnologyList(@Param("page") int page,
                                         @Param("rows") int rows);

    int insertTechnology(@Param("tech") Technology technology);

    int updateTechnology(@Param("tech") Technology technology);

    int deleteTechnology(@Param("ids") String[] ids);

    List<Technology> searchTechById(@Param("id") String searchValue);

    List<Technology> searchTechByName(@Param("name") String searchValue);
}
