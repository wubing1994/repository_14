package com.cskaoyan.service;

import com.cskaoyan.bean.Device;
import com.cskaoyan.mapper.DeviceMapper;
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
}
