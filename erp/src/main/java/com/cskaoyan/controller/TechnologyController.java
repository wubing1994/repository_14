package com.cskaoyan.controller;

import com.cskaoyan.bean.Technology;
import com.cskaoyan.service.TechnologyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
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
    public String goIntoTechnology(HttpServletRequest request){
        List<String> sysPermissionList = new ArrayList<>();
        sysPermissionList.add("technology:add");
        sysPermissionList.add("technology:edit");
        sysPermissionList.add("technology:delete");
        request.getSession().setAttribute("sysPermissionList", sysPermissionList);
        return "technologyManagement/technology_list";
    }
    /*获取列表数据*/
    @RequestMapping("technology/list")
    @ResponseBody
    public List<Technology> TechnologyList(int  page, int rows){
        /*根据参数去数据库查询，然后传到页面*/
        List<Technology> technologyList = technologyService.queryTechnologyList(page,rows);
        System.out.println(technologyList);
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
    public String insert(Technology technology){
        int i= technologyService.insertTechnology(technology);
        return "200";
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
    public String update(Technology technology){
        int i= technologyService.updateTechnology(technology);
        return "200";
    }

    @RequestMapping("technology/delete_judge")
    @ResponseBody
    public String deleteTechnology(){
        return "";
    }
    @RequestMapping("technology/delete_batch")
    @ResponseBody
    public String delete(String []ids){
        int i= technologyService.deleteTechnology(ids);
        return "200";
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




    @RequestMapping("technologyRequirement/find")
    public String findTechnologyRequirement(){
        return "technologyManagement/technologyRequirement_list";
    }

    @RequestMapping("technologyPlan/find")
    public String findTechnologyPlan(){
        return "technologyManagement/technologyPlan_list";
    }

    @RequestMapping("process/find")
    public String findProcess(){
        return "technologyManagement/process_list";
    }
}
