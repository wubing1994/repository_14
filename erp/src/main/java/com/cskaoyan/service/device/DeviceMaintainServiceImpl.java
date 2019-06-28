package com.cskaoyan.service.device;

import com.cskaoyan.bean.device.DeviceMaintain;
import com.cskaoyan.mapper.device.DeviceMaintainMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeviceMaintainServiceImpl implements DeviceMaintainService {

    @Autowired
    private DeviceMaintainMapper deviceMaintainMapper;

    @Override
    public List<DeviceMaintain> queryAllDeviceMaintains() {
        return deviceMaintainMapper.queryAllDeviceMaintains();
    }

    @Override
    public int insertDeviceMaintain(DeviceMaintain deviceMaintain) {
        return deviceMaintainMapper.insertDeviceMaintain(deviceMaintain);
    }

    @Override
    public int updateDeviceMaintain(DeviceMaintain deviceMaintain) {
        return deviceMaintainMapper.updateDeviceMaintain(deviceMaintain);
    }

    @Override
    public int deleteDeviceMaintains(String[] ids) {
        return deviceMaintainMapper.deleteDeviceMaintains(ids);
    }

    @Override
    public int updateNoteById(String id, String note) {
        return deviceMaintainMapper.updateNoteById(id, note);
    }
}
