package com.cskaoyan.service.employee;

import com.cskaoyan.bean.VO.QueryVO;
import com.cskaoyan.bean.employee.Employee;
import com.cskaoyan.mapper.employee.EmployeeMapper;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    EmployeeMapper employeeMapper;

    @Override
    public QueryVO<Employee> getEmployeeInPage(int page, int rows) {
        int length=employeeMapper.countAll();
        PageHelper.startPage(page,rows);
        List<Employee>employees=employeeMapper.selectEmployees();
        return new QueryVO<>(length,employees);
    }

    @Override
    public List<Employee> getData() {
        List<Employee> employees=employeeMapper.selectEmployees();
        return employees;
    }

    @Override
    public Employee getDataById(String id) {
        Employee employee=employeeMapper.selectById(id);
        return employee;
    }

    @Override
    public boolean insertEmployee(Employee employee) {
        int insert=employeeMapper.insert(employee);
        return insert!=0;
    }

    @Override
    public boolean deleteEmployee(String id) {
        int delete=employeeMapper.deleteByPrimaryKey(id);
        return delete!=0;
    }

    @Override
    public boolean updateEmployee(Employee employee) {
        int update=employeeMapper.updateByPrimaryKey(employee);
        return update!=0;
    }

    @Override
    public QueryVO<Employee> queryByDepartment(int page, int rows, String department) {
        PageHelper.startPage(page,rows);
        List<Employee>employees=employeeMapper.selectByDepartment(department);
        int length=employees.size();
        return new QueryVO<>(length,employees);
    }

    @Override
    public QueryVO<Employee> queryById(int page, int rows, String id) {
        PageHelper.startPage(page,rows);
        List<Employee>employees=employeeMapper.queryById(id);
        int length=employees.size();
        return new QueryVO<>(length,employees);
    }

    @Override
    public QueryVO<Employee> queryByName(int page, int rows, String name) {
        PageHelper.startPage(page,rows);
        List<Employee>employees=employeeMapper.queryByName(name);
        int length=employees.size();
        return new QueryVO<>(length,employees);
    }
}
