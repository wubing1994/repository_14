package com.cskaoyan.controller;

import com.cskaoyan.bean.Process;
import com.cskaoyan.bean.Technology;
import com.cskaoyan.bean.TechnologyPlan;
import com.cskaoyan.bean.VO.ResponseVo;
import com.cskaoyan.service.TechnologyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

/**
 * @Desc
 * @Author xushuai
 * @CreateTime 2019/6/28 17:08
 **/
@Controller
public class ProcessController {
    @Autowired
    TechnologyService technologyService;


    /*进入列表页面*/
    @RequestMapping("process/find")
    public String goIntoTechnology(HttpServletRequest request){
        List<String> sysPermissionList = new ArrayList<>();
        sysPermissionList.add("process:add");
        sysPermissionList.add("process:edit");
        sysPermissionList.add("process:delete");
        request.getSession().setAttribute("sysPermissionList", sysPermissionList);
        return "technologyManagement/process_list";
    }
    /*获取列表数据*/
    @RequestMapping("process/list")
    @ResponseBody
    public List<Process> TechnologyList(){
        /*根据参数去数据库查询，然后传到页面*/
        List<Process> processList = technologyService.queryProcessList();
        return  processList;
    }

    /*工艺管理中添加工艺*/
    @RequestMapping("process/add_judge")
    @ResponseBody
    public String process(){
        return "";
    }

    @RequestMapping("process/add")
    public String addprocess(){
        return "technologyManagement/process_add";
    }

    @RequestMapping("process/insert")
    @ResponseBody
    public ResponseVo insertProcess(Process process){
        int i= technologyService.insertProcess(process);
        ResponseVo responseVo =new ResponseVo();
        responseVo.setStatus(200);
        responseVo.setMsg("OK");
        responseVo.setData(null);
        return responseVo;
    }
    @RequestMapping("technologyPlan/get_data")
    @ResponseBody
    public List<TechnologyPlan> gettechdata(){
        List<TechnologyPlan> technologyPlanList = technologyService.queryTechnologyPlanList();
        return  technologyPlanList;
    }



    @RequestMapping("process/edit_judge")
    @ResponseBody
    public String editProcess(){
        return "";
    }
    @RequestMapping("process/edit")
    public String editPro(){
        return "technologyManagement/process_edit";
    }

    @RequestMapping("process/update_all")
    @ResponseBody
    public ResponseVo updateProcess(Process process){
        int i= technologyService.updateProcess(process);
        ResponseVo responseVo =new ResponseVo();
        responseVo.setStatus(200);
        responseVo.setMsg("OK");
        responseVo.setData(null);
        return responseVo;
    }

    @RequestMapping("process/delete_judge")
    @ResponseBody
    public String deleteProcess(){
        return "";
    }
    @RequestMapping("process/delete_batch")
    @ResponseBody
    public ResponseVo deletePro(String []ids){
        int i= technologyService.deletePro(ids);
        ResponseVo responseVo =new ResponseVo();
        responseVo.setStatus(200);
        responseVo.setMsg("OK");
        responseVo.setData(null);
        return responseVo;
    }

    @RequestMapping("process/search_process_by_processId")
    @ResponseBody
    public List<Process> searchProById(String searchValue){
        List<Process> processList= technologyService.searchProcessById(searchValue);
        return  processList;
    }

    @RequestMapping("process/search_process_by_technologyPlanId")
    @ResponseBody
    public List<Process> searchProByName(String searchValue){
        List<Process> processList= technologyService.searchProcessByName(searchValue);
        return processList;
    }
}
