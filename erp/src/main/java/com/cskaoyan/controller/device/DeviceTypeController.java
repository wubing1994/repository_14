package com.cskaoyan.controller.device;

import com.cskaoyan.bean.device.DeviceType;
import com.cskaoyan.bean.VO.ResponseVo;
import com.cskaoyan.service.device.DeviceTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;
import java.util.List;

@Controller
public class DeviceTypeController {

    @Autowired
    private DeviceTypeService deviceTypeService;

    //进入列表页面
    @RequestMapping("device/deviceType")
    public String entry() {
        return "deviceManagement/deviceType";
    }

    //获取列表
    @RequestMapping("deviceType/list")
    @ResponseBody
    public List<DeviceType> queryDeviceTypes(int page, int rows) {
        List<DeviceType> deviceTypes = deviceTypeService.queryAllDeviceTypes();
        return deviceTypes;
    }

    //未知
    @RequestMapping("deviceType/*_judge")
    @ResponseBody
    public String add_judge() {
        return "";
    }

    //进入添加页面
    @RequestMapping("deviceType/add")
    public String add() {
        return "deviceManagement/deviceType_add";
    }

    //添加设备种类
    @RequestMapping("deviceType/insert")
    @ResponseBody
    public ResponseVo insertDeviceType(@Valid DeviceType deviceType, BindingResult bindingResult){
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
        int ret = deviceTypeService.insertDeviceType(deviceType);
        responseVo.setStatus(200);
        responseVo.setMsg("OK");
        responseVo.setData(null);
        return responseVo;
    }

    //进入编辑页面
    @RequestMapping("deviceType/edit")
    public String edit() {
        return "deviceManagement/deviceType_edit";
    }

    //更新设备种类
    @RequestMapping("deviceType/update*")
    @ResponseBody
    public ResponseVo updateDeviceType(@Valid DeviceType deviceType, BindingResult bindingResult){
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
        int ret = deviceTypeService.updateDeviceType(deviceType);
        responseVo.setStatus(200);
        responseVo.setMsg("OK");
        responseVo.setData(null);
        return responseVo;
    }

    /*删除选中的记录*/
    @RequestMapping("deviceType/delete_batch")
    @ResponseBody
    public ResponseVo deleteDeviceTypes(String[] ids){
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
        int ret = deviceTypeService.deleteDeviceTypes(ids);
        responseVo.setStatus(200);
        responseVo.setMsg("OK");
        responseVo.setData(null);
        return responseVo;
    }

    /*根据设备种类编号搜索*/
    @RequestMapping("deviceType/search_deviceType_by_deviceTypeId")
    @ResponseBody
    public List<DeviceType> queryDeviceTypeById(String searchValue, int page, int rows) {
        List<DeviceType> deviceTypes = deviceTypeService.queryDeviceTypeListById(searchValue);
        return deviceTypes;
    }

    /*根据设备种类名称搜索*/
    @RequestMapping("deviceType/search_deviceType_by_deviceTypeName")
    @ResponseBody
    public List<DeviceType> queryDeviceTypeByName(String searchValue, int page, int rows) {
        List<DeviceType> deviceTypes = deviceTypeService.queryDeviceTypeByName(searchValue);
        return deviceTypes;
    }


    /*根据id查询设备种类*/
    @RequestMapping("deviceType/get/{id}")
    @ResponseBody
    public DeviceType queryDeviceTypeById(@PathVariable("id") String id) {
        DeviceType deviceType = deviceTypeService.queryDeviceTypeById(id);
        return deviceType;
    }

    /*获取所有设备种类*/
    @RequestMapping("deviceType/get_data")
    @ResponseBody
    public List<DeviceType> queryAllDeviceTypes() {
        List<DeviceType> deviceTypes = deviceTypeService.queryAllDeviceTypes();
        return deviceTypes;
    }
}
