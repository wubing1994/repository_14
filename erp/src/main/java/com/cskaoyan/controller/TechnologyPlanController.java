package com.cskaoyan.controller;

import com.cskaoyan.bean.Technology;
import com.cskaoyan.bean.TechnologyPlan;
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
 * @CreateTime 2019/6/28 14:51
 **/
@Controller
public class TechnologyPlanController {

    @Autowired
    TechnologyService technologyService;

    @RequestMapping("technologyPlan/find")
    public String goIntoTechnologyPlan(){
        return "technologyManagement/technologyPlan_list";
    }

    /*获取列表数据*/
    @RequestMapping("technologyPlan/list")
    @ResponseBody
    public List<TechnologyPlan> TechnologyPlanList(){
        /*根据参数去数据库查询，然后传到页面*/
        List<TechnologyPlan> technologyPlanList = technologyService.queryTechnologyPlanList();
        return  technologyPlanList;
    }





    /*工艺管理中添加工艺*/
    @RequestMapping("technologyPlan/add_judge")
    @ResponseBody
    public String addTechnologyPlan(){
        return "";
    }

    @RequestMapping("technologyPlan/add")
    public String addPlan(){
        return "technologyManagement/technologyPlan_add";
    }

    @RequestMapping("technologyPlan/insert")
    @ResponseBody
    public ResponseVo insertPlan(TechnologyPlan technologyPlan){
        int i= technologyService.insertTechnologyPlan(technologyPlan);
        ResponseVo responseVo =new ResponseVo();
        responseVo.setStatus(200);
        responseVo.setMsg("OK");
        responseVo.setData(null);
        return responseVo;
    }

    @RequestMapping("technology/get_data")
    @ResponseBody
    public List<Technology> gettechdata(){
        List<Technology> technologyList = technologyService.queryTechnologyList();
        System.out.println(technologyList);
        return  technologyList;
    }


    /*工艺管理中添加工艺*/
    @RequestMapping("technologyPlan/edit_judge")
    @ResponseBody
    public String editTechnologyPlan(){
        return "";
    }
    @RequestMapping("technologyPlan/edit")
    public String editPlan(){
        return "technologyManagement/technologyPlan_edit";
    }

    @RequestMapping("technologyPlan/update_all")
    @ResponseBody
    public ResponseVo updatePlan(TechnologyPlan technologyPlan){
        int i= technologyService.updateTechnologyPlan(technologyPlan);
        ResponseVo responseVo =new ResponseVo();
        responseVo.setStatus(200);
        responseVo.setMsg("OK");
        responseVo.setData(null);
        return responseVo;
    }

    @RequestMapping("technologyPlan/delete_judge")
    @ResponseBody
    public String deleteTechnologyPlan(){
        return "";
    }
    @RequestMapping("technologyPlan/delete_batch")
    @ResponseBody
    public ResponseVo deletePlan(String []ids){
        int i= technologyService.deleteTechnologyPlan(ids);
        ResponseVo responseVo =new ResponseVo();
        responseVo.setStatus(200);
        responseVo.setMsg("OK");
        responseVo.setData(null);
        return responseVo;
    }


    @RequestMapping("technologyPlan/search_technologyPlan_by_technologyPlanId")
    @ResponseBody
    public List<TechnologyPlan> searchTechById(String searchValue){
        List<TechnologyPlan> technologyPlanList= technologyService.searchTechPlanById(searchValue);
        return  technologyPlanList;
    }

    @RequestMapping("technologyPlan/search_technologyPlan_by_technologyName")
    @ResponseBody
    public List<TechnologyPlan> searchTechByName(String searchValue){
        List<TechnologyPlan> technologyPlanList= technologyService.searchTechPlanByName(searchValue);
        return technologyPlanList;
    }
}
