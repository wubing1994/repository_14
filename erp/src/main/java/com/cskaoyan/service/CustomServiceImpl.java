package com.cskaoyan.service;

import com.cskaoyan.bean.Custom;
import com.cskaoyan.mapper.CustomMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CustomServiceImpl implements CustomService{
    @Autowired
    CustomMapper customMapper;

    @Override
    public List<Custom> queryCustom(int page, int rows) {
        return customMapper.queryCustom(page, rows);
    }

    @Override
    public List<Custom> queryAllCustom() {
        return customMapper.queryAllCustom();
    }

    @Override
    public int insertCustom(Custom custom) {
        return customMapper.insertCustom(custom);
    }

    @Override
    public int updateCustom(Custom custom) {
        return customMapper.updateCustom(custom);
    }

    @Override
    public int deleteCustom(String[] ids) {
        return customMapper.deleteCustom(ids);
    }
    @Override
    public Custom queryCustomById(String id) { return customMapper.queryCustomById(id); }

    @Override
    public List<Custom> queryCustomListById(String id) {
        return customMapper.queryCustomListById(id);
    }

    @Override
    public List<Custom> queryCustomByName(String name) {
        return customMapper.queryCustomByName(name);
    }






}
