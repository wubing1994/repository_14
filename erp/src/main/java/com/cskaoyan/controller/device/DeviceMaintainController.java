package com.cskaoyan.controller.device;

import com.cskaoyan.bean.VO.ResponseVo;
import com.cskaoyan.bean.device.DeviceMaintain;
import com.cskaoyan.service.device.DeviceMaintainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;
import java.util.List;

@Controller
public class DeviceMaintainController {

    @Autowired
    private DeviceMaintainService deviceMaintainService;

    /*进入页面*/
    @RequestMapping("device/deviceMaintain")
    public String entry() {
        return "deviceManagement/deviceMaintain";
    }

    /*获取列表数据*/
    @RequestMapping("deviceMaintain/list")
    @ResponseBody
    public List<DeviceMaintain> queryDeviceMaintains(int page, int rows) {
        List<DeviceMaintain> deviceMaintainList = deviceMaintainService.queryAllDeviceMaintains();
        return deviceMaintainList;
    }

    //未知
    @RequestMapping("deviceMaintain/*_judge")
    @ResponseBody
    public String judge() {
        return "";
    }

    //进入添加页面
    @RequestMapping("deviceMaintain/add")
    public String add() {
        return "deviceManagement/deviceMaintain_add";
    }

    //添加
    @RequestMapping("deviceMaintain/insert")
    @ResponseBody
    public ResponseVo insertDeviceMaintain(@Valid DeviceMaintain deviceMaintain, BindingResult bindingResult){
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
        int ret = deviceMaintainService.insertDeviceMaintain(deviceMaintain);
        responseVo.setStatus(200);
        responseVo.setMsg("OK");
        responseVo.setData(null);
        return responseVo;
    }

    //进入编辑页面
    @RequestMapping("deviceMaintain/edit")
    public String edit() {
        return "deviceManagement/deviceMaintain_edit";
    }

    //更新
    @RequestMapping("deviceMaintain/update")
    @ResponseBody
    public ResponseVo updateDeviceMaintain(@Valid DeviceMaintain deviceMaintain, BindingResult bindingResult) {
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

        int ret = deviceMaintainService.updateDeviceMaintain(deviceMaintain);
        responseVo.setStatus(200);
        responseVo.setMsg("OK");
        responseVo.setData(null);
        return responseVo;
    }

    /*删除选中的记录*/
    @RequestMapping("deviceMaintain/delete_batch")
    @ResponseBody
    public ResponseVo deleteDeviceMaintains(String[] ids){
        ResponseVo responseVo = new ResponseVo();

        int ret = deviceMaintainService.deleteDeviceMaintains(ids);
        responseVo.setStatus(200);
        responseVo.setMsg("OK");
        responseVo.setData(null);
        return responseVo;
    }

    /*更新描述*/
    @RequestMapping("deviceMaintain/update_note")
    @ResponseBody
    public ResponseVo updateNote(String deviceMaintainId, String note) {
        ResponseVo responseVo = new ResponseVo();

        int ret = deviceMaintainService.updateNoteById(deviceMaintainId, note);
        responseVo.setStatus(200);
        responseVo.setMsg("OK");
        responseVo.setData(null);
        return responseVo;
    }
}