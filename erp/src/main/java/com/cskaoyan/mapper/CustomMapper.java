package com.cskaoyan.mapper;

import com.cskaoyan.bean.Custom;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CustomMapper {



    /*分页查询*/

    List<Custom> queryCustom(int page, int rows);


    /*查询所有*/
    List<Custom> queryAllCustom();

    /*新增设备种类*/
    int insertCustom(@Param("custom") Custom deviceType);

    /*更新设备种类*/
    int updateCustom(@Param("custom") Custom deviceType);

    /*批量删除*/
    int deleteCustom(@Param("ids") String[] ids);

    /*根据设备种类编号搜索*/
    Custom queryCustomById(@Param("id") String id);
    /*根据设备种类名称搜索*/
    List<Custom> queryCustomByName(@Param("name") String name);

    List<Custom> queryCustomListById(@Param("id") String id);

}
