package com.cskaoyan.controller.employee;

import com.cskaoyan.bean.employee.Employee;
import com.cskaoyan.bean.employee.Info;
import com.cskaoyan.bean.QueryVO;
import com.cskaoyan.service.employee.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @RequestMapping("list")
    @ResponseBody
    public QueryVO findList(int page,int rows){
        return employeeService.getEmployeeInPage(page,rows);
    }

    @RequestMapping("get/{id}")
    @ResponseBody
    public Employee getEmployeeDataById(@PathVariable("id")String id){
        return employeeService.getDataById(id);
    }

    @RequestMapping("get_data")
    @ResponseBody
    public List<Employee>getData(){
        return employeeService.getData();
    }

    @RequestMapping("find")
    public String findEmployee(){
        return "employee_list";
    }
    //增加
    @RequestMapping("add")
    public String add(){
        return "employee_add";
    }

    @RequestMapping("add_judge")
    @ResponseBody
    public String addJudge(HttpServletRequest request){
        return " ";
    }

    @RequestMapping("insert")
    @ResponseBody
    public Info insertEmployee(@ModelAttribute("employee")Employee employee){
        Info info=new Info();
        Employee dataById=employeeService.getDataById(employee.getEmpId());
        if(dataById!=null){
            info.setStatus(0);
            info.setMsg("该员工编号已存在，请更换员工编号！");
            return info;
        }
        boolean insert=employeeService.insertEmployee(employee);
        if(insert){
            info.setStatus(200);
            info.setMsg("插入成功！");
        }else{
            info.setStatus(0);
            info.setMsg("插入异常！");
        }
        return info;
    }
    //删除
    @RequestMapping("delete_judge")
    @ResponseBody
    public String deleteJudge(){
        return " ";
    }

    @RequestMapping("delete_batch")
    @ResponseBody
    @Transactional(propagation = Propagation.REQUIRED,isolation= Isolation.REPEATABLE_READ)
    public Info deleteBatch(@ModelAttribute("ids")String[]ids){
        Info info=new Info();
        for(String id:ids){
           boolean delete=employeeService.deleteEmployee(id);
           if(delete){
               info.setStatus(200);
               info.setMsg("删除成功");
           }else{
               info.setStatus(0);
               info.setMsg("删除失败");
           }
        }
        return info;
    }
    //修改
    @RequestMapping("edit_judge")
    @ResponseBody
    public String editJudge(){
        return " ";
    }
    @RequestMapping("edit")
    public String edit(){
        return "employee_edit";
    }

    @RequestMapping("update_all")
    @ResponseBody
    @Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.REPEATABLE_READ)
    public Info updateEmployee(@ModelAttribute Employee employee){
        Info info=new Info();
        boolean update=employeeService.updateEmployee(employee);
        if(update){
            info.setMsg("更新成功");
            info.setStatus(200);
        }else{
            info.setMsg("更新失败");
            info.setStatus(0);
        }
        return info;
    }
    //查询部分
    @RequestMapping("search_employee_by_departmentName")
    @ResponseBody
    @Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.REPEATABLE_READ)
    public QueryVO<Employee> searchByDepartment(String searchValue,int page,int rows) {
        QueryVO<Employee> employeeQueryVO = employeeService.queryByDepartment(page, rows, searchValue);
        return employeeQueryVO;
    }

    @RequestMapping("search_employee_by_employeeName")
    @ResponseBody
    @Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.REPEATABLE_READ)
    public QueryVO<Employee> searchByName(String searchValue,int page,int rows){
        QueryVO<Employee> employeeQueryVO=employeeService.queryByName(page,rows,"%"+searchValue+"%");
        return employeeQueryVO;
    }

    @RequestMapping("search_employee_by_employeeName")
    @ResponseBody
    @Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.REPEATABLE_READ)
    public QueryVO<Employee> searchById(String searchValue,int page,int rows){
        QueryVO<Employee>employeeQueryVO=employeeService.queryById(page,rows,"%"+searchValue+"%");
        return employeeQueryVO;
    }

}
