package com.cskaoyan.controller.device;

import com.cskaoyan.bean.device.Device;
import com.cskaoyan.bean.VO.ResponseVo;
import com.cskaoyan.service.device.DeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;
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
    @RequestMapping("deviceList/*_judge")
    @ResponseBody
    public String judge() {
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
    public ResponseVo insertDeviceType(@Valid Device device, BindingResult bindingResult){
        ResponseVo responseVo = new ResponseVo();
        /*if (bindingResult.hasErrors()){
            responseVo.setErrorNo(1);
            FieldError fieldError = bindingResult.getFieldError();
            //校验通过的成员变量名
            String field = fieldError.getField();
            String defaultMessage = fieldError.getDefaultMessage();
            responseVo.setMessage(defaultMessage);
            return responseVo;
        }*/

        String deviceStatusId = device.getDeviceStatusId();
        if ("1".equals(deviceStatusId)) {
            device.setDeviceStatus("良好");
        } else if ("2".equals(deviceStatusId)) {
            device.setDeviceStatus("故障");
        } else if ("3".equals(deviceStatusId)) {
            device.setDeviceStatus("维修");
        } else {
            device.setDeviceStatus("报废");
        }

        int ret = deviceService.insertDevice(device);
        responseVo.setStatus(200);
        responseVo.setMsg("OK");
        responseVo.setData(null);
        return responseVo;
    }

    //进入编辑页面
    @RequestMapping("deviceList/edit")
    public String edit() {
        return "deviceManagement/deviceList_edit";
    }

    //更新设备
    @RequestMapping("deviceList/update*")
    @ResponseBody
    public ResponseVo updateDevice(@Valid Device device, BindingResult bindingResult) {
        ResponseVo responseVo = new ResponseVo();
        /*if (bindingResult.hasErrors()){
            responseVo.setErrorNo(1);
            FieldError fieldError = bindingResult.getFieldError();
            //校验通过的成员变量名
            String field = fieldError.getField();
            String defaultMessage = fieldError.getDefaultMessage();
            responseVo.setMessage(defaultMessage);
            return responseVo;
        }*/

        String deviceStatusId = device.getDeviceStatusId();
        if ("1".equals(deviceStatusId)) {
            device.setDeviceStatus("良好");
        } else if ("2".equals(deviceStatusId)) {
            device.setDeviceStatus("故障");
        } else if ("3".equals(deviceStatusId)) {
            device.setDeviceStatus("维修");
        } else {
            device.setDeviceStatus("报废");
        }

        int ret = deviceService.updateDevice(device);
        responseVo.setStatus(200);
        responseVo.setMsg("OK");
        responseVo.setData(null);
        return responseVo;
    }

    /*删除选中的记录*/
    @RequestMapping("deviceList/delete_batch")
    @ResponseBody
    public ResponseVo deleteDeviceTypes(String[] ids){
        ResponseVo responseVo = new ResponseVo();

        int ret = deviceService.deleteDevices(ids);
        responseVo.setStatus(200);
        responseVo.setMsg("OK");
        responseVo.setData(null);
        return responseVo;
    }

    /*根据设备编号搜索*/
    /*@RequestMapping("device/search_device_by_deviceId")
    @ResponseBody
    public List<Device> queryDeviceById(String searchValue, int page, int rows) {
        List<Device> devices = deviceService.queryDeviceListById(searchValue);
        return devices;
    }

    *//*根据设备名称搜索*//*
    @RequestMapping("device/search_device_by_deviceName")
    @ResponseBody
    public List<Device> queryDeviceByName(String searchValue, int page, int rows) {
        List<Device> devices = deviceService.queryDeviceByName(searchValue);
        return devices;
    }*/

    /*根据id 查询记录*/
    @RequestMapping("deviceList/get/{id}")
    @ResponseBody
    public Device queryDeviceById(@PathVariable("id") String id) {
        return deviceService.queryDeviceById(id);
    }

    /*获取所有记录*/
    @RequestMapping("deviceList/get_data")
    @ResponseBody
    public List<Device> queryAllDevices() {
        return deviceService.queryAllDevices();
    }
}
