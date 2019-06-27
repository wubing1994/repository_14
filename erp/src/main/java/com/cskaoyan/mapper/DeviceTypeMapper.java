package com.cskaoyan.mapper;

import com.cskaoyan.bean.DeviceType;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DeviceTypeMapper {

    List<DeviceType> queryDeviceTypes(int page, int rows);

    List<DeviceType> queryAllDeviceTypes();

    int insertDeviceType(@Param("deviceType") DeviceType deviceType);

    int updateDeviceType(@Param("deviceType") DeviceType deviceType);

    int deleteDeviceTypes(@Param("ids") String[] ids);

    List<DeviceType> queryDeviceTypeById(@Param("id") String id);

    List<DeviceType> queryDeviceTypeByName(@Param("name") String name);
}
