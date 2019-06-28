package com.cskaoyan.service.device;

import com.cskaoyan.bean.device.DeviceType;

import java.util.List;

public interface DeviceTypeService {

    /*分页查询*/
    List<DeviceType> queryDeviceTypes(int page, int rows);

    /*查询所有*/
    List<DeviceType> queryAllDeviceTypes();

    /*新增设备种类*/
    int insertDeviceType(DeviceType deviceType);

    /*更新设备种类*/
    int updateDeviceType(DeviceType deviceType);

    /*批量删除*/
    int deleteDeviceTypes(String[] ids);

    /*根据id获取设备种类*/
    DeviceType queryDeviceTypeById(String id);
    /*根据设备种类编号搜索*/
    List<DeviceType> queryDeviceTypeListById(String id);

    /*根据设备种类名称搜索*/
    List<DeviceType> queryDeviceTypeByName(String name);
}
