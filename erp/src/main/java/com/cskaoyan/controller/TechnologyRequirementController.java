package com.cskaoyan.controller;

import com.cskaoyan.bean.Technology;
import com.cskaoyan.bean.TechnologyRequirement;
import com.cskaoyan.bean.VO.ResponseVo;
import com.cskaoyan.service.TechnologyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;

/**
 * @Desc
 * @Author xushuai
 * @CreateTime 2019/6/28 0:30
 **/
@Controller
public class TechnologyRequirementController {

    @Autowired
    TechnologyService technologyService;


    @RequestMapping("technologyRequirement/find")
    public String findtechnologyRequ(){
        return "technologyManagement/technologyRequirement_list";
    }

    @RequestMapping("technologyRequirement/list")
    @ResponseBody
    public List<TechnologyRequirement> queryTechnologyList(int page, int rows){
        List<TechnologyRequirement> technologyRequirementList = technologyService.queryTechnologyRequList();
        return  technologyRequirementList;
    }

    @RequestMapping("technologyRequirement/add_judge")
    @ResponseBody
    public String addtechnologyRequirement(){
        return "";
    }
    @RequestMapping("technologyRequirement/add")
    public String addTechRequ(){
        return "technologyManagement/technologyRequirement_add";
    }
    @RequestMapping("technologyRequirement/insert")
    @ResponseBody
    public ResponseVo insertRequ( TechnologyRequirement technologyRequirement){
        int i = technologyService.insertRequ(technologyRequirement);
        ResponseVo responseVo =new ResponseVo();
        responseVo.setStatus(200);
        responseVo.setMsg("OK");
        responseVo.setData(null);
        return responseVo;
    }

    @RequestMapping("technologyRequirement/get_data")
    @ResponseBody
    public List<Technology> gettechdata(){
        List<Technology> technologyList = technologyService.queryTechnologyList();
        System.out.println(technologyList);
        return  technologyList;
    }

    @RequestMapping("technology/get/{id}")
    @ResponseBody
    public Technology getTechnologyById(@PathVariable("id") String TechnologyId){
        Technology technology = technologyService.queryTechnologyById(TechnologyId);
        return technology;
    }

    @RequestMapping("technologyRequirement/edit_judge")
    @ResponseBody
    public String edittechnologyRequirement(){
        return "";
    }
    @RequestMapping("technologyRequirement/edit")
    public String editTechRequ(){
        return "technologyManagement/technologyRequirement_edit";
    }
    @RequestMapping("technologyRequirement/update_all")
    @ResponseBody
    public ResponseVo upadateRequ( TechnologyRequirement technologyRequirement){
        int i = technologyService.updateRequ(technologyRequirement);
        ResponseVo responseVo =new ResponseVo();
        responseVo.setStatus(200);
        responseVo.setMsg("OK");
        responseVo.setData(null);
        return responseVo;
    }

    @RequestMapping("technologyRequirement/update_requirement")
    @ResponseBody
    public ResponseVo updarequ(){
        ResponseVo responseVo =new ResponseVo();
        responseVo.setStatus(200);
        responseVo.setMsg("OK");
        responseVo.setData(null);
        return responseVo;
    }

    @RequestMapping("technologyRequirement/delete_judge")
    @ResponseBody
    public String deleteTechnologyRequ(){
        return "";
    }
    @RequestMapping("technologyRequirement/delete_batch")
    @ResponseBody
    public ResponseVo deleteRequ(String []ids){
        int i= technologyService.deleteTechnologyRequ(ids);
        ResponseVo responseVo =new ResponseVo();
        responseVo.setStatus(200);
        responseVo.setMsg("OK");
        responseVo.setData(null);
        return responseVo;
    }

    /*搜索 by requid*/
    @RequestMapping("technologyRequirement/search_technologyRequirement_by_technologyRequirementId")
    @ResponseBody
    public List<TechnologyRequirement> searchTechById(String searchValue){
        List<TechnologyRequirement> technologyRequirementList= technologyService.searchTechRequBytechRequId(searchValue);
        return  technologyRequirementList;
    }
    /*搜索 by name*/
    @RequestMapping("technologyRequirement/search_technologyRequirement_by_technologyName")
    @ResponseBody
    public List<TechnologyRequirement> searchTechByName(String searchValue){
        List<TechnologyRequirement> technologyRequirementList= technologyService.searchTechRequBytechnologyName(searchValue);
        return technologyRequirementList;
    }


}
