package com.cskaoyan.service;

import com.cskaoyan.bean.DeviceType;
import com.cskaoyan.mapper.DeviceTypeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeviceTypeServiceImpl implements DeviceTypeService {

    @Autowired
    DeviceTypeMapper deviceTypeMapper;

    @Override
    public List<DeviceType> queryDeviceTypes(int page, int rows) {
        return deviceTypeMapper.queryDeviceTypes(page, rows);
    }

    @Override
    public List<DeviceType> queryAllDeviceTypes() {
        return deviceTypeMapper.queryAllDeviceTypes();
    }

    @Override
    public int insertDeviceType(DeviceType deviceType) {
        return deviceTypeMapper.insertDeviceType(deviceType);
    }

    @Override
    public int updateDeviceType(DeviceType deviceType) {
        return deviceTypeMapper.updateDeviceType(deviceType);
    }

    @Override
    public int deleteDeviceTypes(String[] ids) {
        return deviceTypeMapper.deleteDeviceTypes(ids);
    }

    @Override
    public DeviceType queryDeviceTypeById(String id) {
        return deviceTypeMapper.queryDeviceTypeById(id);
    }

    @Override
    public List<DeviceType> queryDeviceTypeListById(String id) {
        return deviceTypeMapper.queryDeviceTypeListById(id);
    }

    @Override
    public List<DeviceType> queryDeviceTypeByName(String name) {
        return deviceTypeMapper.queryDeviceTypeByName(name);
    }
}
