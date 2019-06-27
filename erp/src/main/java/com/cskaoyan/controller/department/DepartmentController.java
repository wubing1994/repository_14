package com.cskaoyan.controller.department;

import com.cskaoyan.bean.QueryVO;
import com.cskaoyan.bean.department.Department;
import com.cskaoyan.service.department.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("department")
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @RequestMapping("find")
    public String findDepartment(){
        return "department_list";
    }

    @RequestMapping("get/{id}")
    @ResponseBody
    public Department getDepartmentDataById(@PathVariable("id")String id){
        return departmentService.getDataById(id);
    }
    @RequestMapping("list")
    public @ResponseBody
    QueryVO findDepartmentInPage(int page,int rows){
        return departmentService.getDepartmentInPage(page,rows);
    }
    @RequestMapping("get_data")
    public @ResponseBody
    List<Department>departmentsGetData(){
        return departmentService.getDepartmentDate();
    }
}
