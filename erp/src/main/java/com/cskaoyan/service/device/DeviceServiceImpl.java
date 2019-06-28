package com.cskaoyan.service.device;

import com.cskaoyan.bean.device.Device;
import com.cskaoyan.mapper.device.DeviceMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeviceServiceImpl implements DeviceService {

    @Autowired
    DeviceMapper deviceMapper;

    @Override
    public List<Device> queryAllDevices() {
        return deviceMapper.queryAllDevices();
    }

    @Override
    public int insertDevice(Device device) {
        return deviceMapper.insertDevice(device);
    }

    @Override
    public int updateDevice(Device device) {
        return deviceMapper.updateDevice(device);
    }

    @Override
    public int deleteDevices(String[] ids) {
        return deviceMapper.deleteDevices(ids);
    }

    @Override
    public Device queryDeviceById(String id) {
        return deviceMapper.queryDeviceById(id);
    }
}
