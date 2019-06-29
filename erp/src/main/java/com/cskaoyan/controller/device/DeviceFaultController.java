package com.cskaoyan.controller.device;

import com.cskaoyan.bean.device.DeviceFault;
import com.cskaoyan.bean.VO.ResponseVo;
import com.cskaoyan.service.device.DeviceFaultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;
import java.util.List;

@Controller
public class DeviceFaultController {

    @Autowired
    DeviceFaultService deviceFaultService;

    /*进入页面*/
    @RequestMapping("device/deviceFault")
    public String entry() {
        return "deviceManagement/deviceFault";
    }

    /*获取列表数据*/
    @RequestMapping("deviceFault/list")
    @ResponseBody
    public List<DeviceFault> queryDeviceFaults(int page, int rows) {
        List<DeviceFault> deviceFaults = deviceFaultService.queryAllDeviceFaults();
        return deviceFaults;
    }

    /*获取所有数据*/
    @RequestMapping("deviceFault/get_data")
    @ResponseBody
    public List<DeviceFault> queryAllDeviceFaults() {
        List<DeviceFault> deviceFaults = deviceFaultService.queryAllDeviceFaults();
        return deviceFaults;
    }

    //未知
    @RequestMapping("deviceFault/*_judge")
    @ResponseBody
    public String judge() {
        return "";
    }

    //进入添加页面
    @RequestMapping("deviceFault/add")
    public String add() {
        return "deviceManagement/deviceFault_add";
    }

    //添加设备
    @RequestMapping("deviceFault/insert")
    @ResponseBody
    public ResponseVo insertDeviceType(@Valid DeviceFault deviceFault, BindingResult bindingResult){
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

        int ret = deviceFaultService.insertDeviceFault(deviceFault);
        responseVo.setStatus(200);
        responseVo.setMsg("OK");
        responseVo.setData(null);
        return responseVo;
    }

    //进入编辑页面
    @RequestMapping("deviceFault/edit")
    public String edit() {
        return "deviceManagement/deviceFault_edit";
    }

    //更新
    @RequestMapping("deviceFault/update*")
    @ResponseBody
    public ResponseVo updateDeviceFault(@Valid DeviceFault deviceFault, BindingResult bindingResult) {
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
        int ret = deviceFaultService.updateDeviceFault(deviceFault);
        responseVo.setStatus(200);
        responseVo.setMsg("OK");
        responseVo.setData(null);
        return responseVo;
    }

    /*删除选中的记录*/
    @RequestMapping("deviceFault/delete_batch")
    @ResponseBody
    public ResponseVo deleteDeviceFaultTypes(String[] ids){
        ResponseVo responseVo = new ResponseVo();

        int ret = deviceFaultService.deleteDeviceFaults(ids);
        responseVo.setStatus(200);
        responseVo.setMsg("OK");
        responseVo.setData(null);
        return responseVo;
    }

    /*根据id获取记录*/
    @RequestMapping("deviceFault/get/{id}")
    @ResponseBody
    public DeviceFault queryDeviceFaultById(@PathVariable("id") String id) {
        return deviceFaultService.queryDeviceFaultById(id);
    }

    /*更新故障描述*/
    @RequestMapping("deviceFault/update_device_fault_detail")
    @ResponseBody
    public ResponseVo updateNote(String deviceFaultId, String deviceFaultDetail) {
        ResponseVo responseVo = new ResponseVo();

        int ret = deviceFaultService.updateDeviceFaultDetailById(deviceFaultId, deviceFaultDetail);
        responseVo.setStatus(200);
        responseVo.setMsg("OK");
        responseVo.setData(null);
        return responseVo;
    }
}
