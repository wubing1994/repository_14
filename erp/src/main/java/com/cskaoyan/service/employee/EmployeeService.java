package com.cskaoyan.service.employee;

import com.cskaoyan.bean.employee.Employee;
import com.cskaoyan.bean.QueryVO;

import java.util.List;

public interface EmployeeService {
    QueryVO<Employee> getEmployeeInPage(int page, int rows);
    List<Employee> getData();
    Employee getDataById(String id);
    boolean insertEmployee(Employee employee);
    boolean deleteEmployee(String id);
    boolean updateEmployee(Employee employee);
    QueryVO<Employee> queryByDepartment(int page,int rows,String department);
    QueryVO<Employee> queryById(int page,int rows,String id);
    QueryVO<Employee> queryByName(int page,int rows,String name);
}
