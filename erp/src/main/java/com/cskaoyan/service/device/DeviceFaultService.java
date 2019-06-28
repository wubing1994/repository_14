package com.cskaoyan.service.device;

import com.cskaoyan.bean.device.DeviceFault;

import java.util.List;

public interface DeviceFaultService {

    List<DeviceFault> queryAllDeviceFaults();

    int insertDeviceFault(DeviceFault deviceFault);

    int updateDeviceFault(DeviceFault deviceFault);

    int deleteDeviceFaults(String[] ids);

    int updateDeviceFaultDetailById(String deviceFaultId, String deviceFaultDetail);

    DeviceFault queryDeviceFaultById(String id);
}
