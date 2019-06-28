package com.cskaoyan.service.device;

import com.cskaoyan.bean.device.DeviceMaintain;

import java.util.List;

public interface DeviceMaintainService {

    List<DeviceMaintain> queryAllDeviceMaintains();

    int insertDeviceMaintain(DeviceMaintain deviceMaintain);

    int updateDeviceMaintain(DeviceMaintain deviceMaintain);

    int deleteDeviceMaintains(String[] ids);
}
