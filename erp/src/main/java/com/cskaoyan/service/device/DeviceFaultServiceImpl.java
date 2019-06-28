package com.cskaoyan.service.device;

import com.cskaoyan.bean.device.DeviceFault;
import com.cskaoyan.mapper.device.DeviceFaultMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeviceFaultServiceImpl implements DeviceFaultService {

    @Autowired
    private DeviceFaultMapper deviceFaultMapper;

    @Override
    public List<DeviceFault> queryAllDeviceFaults() {
        return deviceFaultMapper.queryAllDeviceFaults();
    }

    @Override
    public int insertDeviceFault(DeviceFault deviceFault) {
        return deviceFaultMapper.insertDeviceFault(deviceFault);
    }

    @Override
    public int updateDeviceFault(DeviceFault deviceFault) {
        return deviceFaultMapper.updateDeviceFault(deviceFault);
    }

    @Override
    public int deleteDeviceFaults(String[] ids) {
        return deviceFaultMapper.deleteDeviceFaults(ids);
    }
}
