package com.cskaoyan.controller;

import com.cskaoyan.bean.Device;
import com.cskaoyan.bean.DeviceType;
import com.cskaoyan.service.DeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class DeviceController {

    @Autowired
    private DeviceService deviceService;

    //进入列表页面
    @RequestMapping("device/deviceList")
    public String entry() {
        return "deviceManagement/deviceList";
    }

    //获取列表
    @RequestMapping("deviceList/list")
    @ResponseBody
    public List<Device> queryDevices(int page, int rows) {
        List<Device> devices = deviceService.queryAllDevices();
        return devices;
    }

    //未知
    @RequestMapping("deviceList/add_judge")
    @ResponseBody
    public String add_judge() {
        return "";
    }

    //进入添加页面
    @RequestMapping("deviceList/add")
    public String add() {
        return "deviceManagement/deviceList_add";
    }

    //添加设备
    @RequestMapping("deviceList/insert")
    @ResponseBody
    public String insertDeviceType(DeviceType deviceType) {
        //int ret = deviceTypeService.insertDeviceType(deviceType);
        return "";
    }

    @RequestMapping("deviceList/edit_judge")
    @ResponseBody
    public String edit_judge() { return ""; }

    //进入编辑页面
    @RequestMapping("deviceList/edit")
    public String edit() {
        return "deviceManagement/deviceList_edit";
    }

    //更新设备
    @RequestMapping("deviceList/update")
    @ResponseBody
    public String updateDevice(Device device) {

        return "200";
    }

    //
    @RequestMapping("deviceList/delete_judge")
    @ResponseBody
    public String delete_judge() {
        return "";
    }

    /*删除选中的记录*/
    @RequestMapping("deviceList/delete_batch")
    @ResponseBody
    public String delete(String[] ids) {
        return "200";
    }

    /*根据设备种类编号搜索*//*
    @RequestMapping("deviceType/search_deviceType_by_deviceTypeId")
    @ResponseBody
    public List<DeviceType> queryDeviceTypeById(String searchValue, int page, int rows) {
        List<DeviceType> deviceTypes = deviceTypeService.queryDeviceTypeById(searchValue);
        return deviceTypes;
    }

    *//*根据设备种类名称搜索*//*
    @RequestMapping("deviceType/search_deviceType_by_deviceTypeName")
    @ResponseBody
    public List<DeviceType> queryDeviceTypeByName(String searchValue, int page, int rows) {
        List<DeviceType> deviceTypes = deviceTypeService.queryDeviceTypeByName(searchValue);
        return deviceTypes;
    }*/
}
