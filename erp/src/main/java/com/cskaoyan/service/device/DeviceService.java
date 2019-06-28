package com.cskaoyan.service.device;

import com.cskaoyan.bean.device.Device;

import java.util.List;

public interface DeviceService {

    /*查询所有记录*/
    List<Device> queryAllDevices();

    /*添加设备*/
    int insertDevice(Device device);

    /*更新设备*/
    int updateDevice(Device device);

    /*删除设备*/
    int deleteDevices(String[] ids);

    /*根据id查询记录*/
    Device queryDeviceById(String id);
}
