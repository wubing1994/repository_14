package com.cskaoyan.service.department;

import com.cskaoyan.bean.QueryVO;
import com.cskaoyan.bean.department.Department;

import java.util.List;

public interface DepartmentService {
    QueryVO getDepartmentInPage(int page,int rows);
    List<Department> getDepartmentDate();
    boolean insertDepartment(Department department);
    boolean deleteDepartment(String id);
    boolean updateDepartment(Department department);
    boolean selectById(String id);
    boolean selectByName(String name);
    QueryVO<Department> queryById(int page,int rows,String id);
    QueryVO<Department> queryByName(int page,int rows,String name);
    Department getDataById(String id);
}
