package com.cskaoyan.mapper.device;

import com.cskaoyan.bean.device.DeviceMaintain;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DeviceMaintainMapper {

    List<DeviceMaintain> queryAllDeviceMaintains();

    int insertDeviceMaintain(@Param("deviceMaintain") DeviceMaintain deviceMaintain);

    int updateDeviceMaintain(@Param("deviceMaintain") DeviceMaintain deviceMaintain);

    int deleteDeviceMaintains(@Param("ids") String[] ids);

}
