package com.cskaoyan.controller;

import com.cskaoyan.bean.Technology;
import com.cskaoyan.bean.VO.ResponseVo;
import com.cskaoyan.service.TechnologyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Desc
 * @Author xushuai
 * @CreateTime 2019/6/27 16:12
 **/
@Controller
public class TechnologyController {

    @Autowired
    TechnologyService technologyService;

    /*进入列表页面*/
    @RequestMapping("technology/find")
    public String goIntoTechnology(){
        return "technologyManagement/technology_list";
    }
    /*获取列表数据*/
    @RequestMapping("technology/list")
    @ResponseBody
    public List<Technology> TechnologyList(){
        /*根据参数去数据库查询，然后传到页面*/
        List<Technology> technologyList = technologyService.queryTechnologyList();
        return  technologyList;
    }
    /*工艺管理中添加工艺*/
    @RequestMapping("technology/add_judge")
    @ResponseBody
    public String addTechnology(){
        return "";
    }

    @RequestMapping("technology/add")
    public String add(){
        return "technologyManagement/technology_add";
    }
    /*以下返回处有问题*/
    @RequestMapping("technology/insert")
    @ResponseBody
    public ResponseVo insert(Technology technology){
        int i= technologyService.insertTechnology(technology);
        ResponseVo responseVo =new ResponseVo();
        responseVo.setStatus(200);
        responseVo.setMsg("OK");
        responseVo.setData(null);
        return responseVo;
    }

    /*工艺管理中添加工艺*/
    @RequestMapping("technology/edit_judge")
    @ResponseBody
    public String editTechnology(){
        return "";
    }
    @RequestMapping("technology/edit")
    public String edit(){
        return "technologyManagement/technology_edit";
    }

    @RequestMapping("technology/update_all")
    @ResponseBody
    public ResponseVo update(Technology technology){
        int i= technologyService.updateTechnology(technology);
        ResponseVo responseVo =new ResponseVo();
        responseVo.setStatus(200);
        responseVo.setMsg("OK");
        responseVo.setData(null);
        return responseVo;
    }

    @RequestMapping("technology/delete_judge")
    @ResponseBody
    public String deleteTechnology(){
        return "";
    }
    @RequestMapping("technology/delete_batch")
    @ResponseBody
    public ResponseVo delete(String []ids){
        int i= technologyService.deleteTechnology(ids);
        ResponseVo responseVo =new ResponseVo();
        responseVo.setStatus(200);
        responseVo.setMsg("OK");
        responseVo.setData(null);
        return responseVo;
    }

    /*搜索by id*/
    @RequestMapping("technology/search_technology_by_technologyId")
    @ResponseBody
    public List<Technology> searchTechById(String searchValue){
        List<Technology> technologyList= technologyService.searchTechById(searchValue);
        return  technologyList;
    }
    /*搜索 by name*/
    @RequestMapping("technology/search_technology_by_technologyName")
    @ResponseBody
    public List<Technology> searchTechByName(String searchValue){
        List<Technology> technologyList= technologyService.searchTechByName(searchValue);
        return technologyList;
    }

}
