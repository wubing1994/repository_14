package com.cskaoyan.mapper.device;

import com.cskaoyan.bean.device.DeviceFault;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DeviceFaultMapper {

    List<DeviceFault> queryAllDeviceFaults();

    int insertDeviceFault(@Param("deviceFault") DeviceFault deviceFault);

    int updateDeviceFault(@Param("deviceFault") DeviceFault deviceFault);

    int deleteDeviceFaults(@Param("ids") String[] ids);

    int updateDeviceFaultDetailById(@Param("id") String deviceFaultId, @Param("detail") String deviceFaultDetail);

    DeviceFault queryDeviceFaultById(@Param("id") String id);
}
