package com.cskaoyan.mapper.device;

import com.cskaoyan.bean.device.Device;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DeviceMapper {

    List<Device> queryAllDevices();

    int insertDevice(@Param("device") Device device);

    int updateDevice(@Param("device") Device device);

    int deleteDevices(@Param("ids") String[] ids);

    Device queryDeviceById(@Param("id") String id);
}
