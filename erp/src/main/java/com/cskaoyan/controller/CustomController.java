package com.cskaoyan.controller;


import com.cskaoyan.bean.Custom;
import com.cskaoyan.bean.VO.ResponseVo;
import com.cskaoyan.service.CustomService;
import com.cskaoyan.service.CustomServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
public class CustomController {

    @Autowired
    private CustomService customService;

    //进入列表页面
    @RequestMapping("device/custom")
    public String entry() {
        return "deviceManagement/custom";
    }

    //获取列表
    @RequestMapping("custom/list")
    @ResponseBody
    public List<Custom> queryDeviceTypes(int page, int rows) {
        List<Custom> custom = customService.queryAllCustom();
        return custom;
    }

    //未知
    @RequestMapping("custom/*_judge")
    @ResponseBody
    public String add_judge() {
        return "";
    }

    //进入添加页面
    @RequestMapping("custom/add")
    public String add() {
        return "deviceManagement/custom_add";
    }

    //添加设备种类
    @RequestMapping("custom/insert")
    @ResponseBody
    public ResponseVo insertDeviceType(@Valid Custom custom, BindingResult bindingResult){
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
        int ret = customService.insertCustom(custom);
        responseVo.setStatus(200);
        responseVo.setMsg("OK");
        responseVo.setData(null);
        return responseVo;
    }

    //进入编辑页面
    @RequestMapping("custom/edit")
    public String edit() {
        return "deviceManagement/custom_edit";
    }

    //更新设备种类 ***************************
    @RequestMapping("custom/update*")
    @ResponseBody
    public ResponseVo updateDeviceType(@Valid Custom custom, BindingResult bindingResult){
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
        int ret = customService.updateCustom(custom);
        responseVo.setStatus(200);
        responseVo.setMsg("OK");
        responseVo.setData(null);
        return responseVo;
    }

    /*删除选中的记录*/
    @RequestMapping("custom/delete_batch")
    @ResponseBody
    public ResponseVo deleteCustoms(String[] ids){
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
        int ret = customService.deleteCustom(ids);
        responseVo.setStatus(200);
        responseVo.setMsg("OK");
        responseVo.setData(null);
        return responseVo;
    }

    /*根据设备种类编号搜索 刷新客户*/
    @RequestMapping("custom/search_custom_by_customId")
    @ResponseBody
    public List<Custom> queryDeviceTypeById(String searchValue, int page, int rows) {
        List<Custom> customs = customService.queryCustomListById(searchValue);
        return customs;
    }
    /*根据设备种类名称搜索*/
    @RequestMapping("custom/search_custom_by_customName")
    @ResponseBody
    public List<Custom> queryDeviceTypeByName(String searchValue, int page, int rows) {
        List<Custom> customs = customService.queryCustomByName(searchValue);
            return customs;

    }

    //erp/custom/search_custom_by_customId?searchValue=1&page=1&rows=30
    /*根据id查询设备种类*/
    @RequestMapping("custom/get/{id}")
    @ResponseBody
    public Custom queryDeviceTypeById(@PathVariable("id") String id) {
        Custom custom = customService.queryCustomById(id);
        return custom;
    }

    /*获取所有设备种类*/
    @RequestMapping("custom/get_data")
    @ResponseBody
    public List<Custom> queryAllDeviceTypes() {
        List<Custom> customs = customService.queryAllCustom();
        return customs;
    }
}