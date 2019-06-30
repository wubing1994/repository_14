package com.cskaoyan.service;

import com.cskaoyan.bean.Custom;

import java.util.List;

public interface CustomService {

    /*分页查询*/
    List<Custom> queryCustom(int page, int rows);

    /*查询所有*/
    List<Custom> queryAllCustom();

    /*新增设备种类*/
    int insertCustom(Custom custom);

    /*更新设备种类*/
    int updateCustom(Custom custom);

    /*批量删除*/
    int deleteCustom(String[] ids);

    /*根据设备种类编号搜索*/
    Custom queryCustomById(String id);

    List<Custom> queryCustomListById(String id);

    /*根据设备种类名称搜索*/
    List<Custom> queryCustomByName(String name);

}
