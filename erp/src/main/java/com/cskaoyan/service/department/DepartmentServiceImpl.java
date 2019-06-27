package com.cskaoyan.service.department;

import com.cskaoyan.bean.QueryVO;
import com.cskaoyan.bean.department.Department;
import com.cskaoyan.bean.department.DepartmentExample;
import com.cskaoyan.mapper.department.DepartmentMapper;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService{
    @Autowired
    DepartmentMapper departmentMapper;

    @Override
    public QueryVO getDepartmentInPage(int page, int rows) {
        int length=departmentMapper.countAll();
        PageHelper.startPage(page,rows);
        DepartmentExample departmentExample=new DepartmentExample();
        departmentExample.or();
        List<Department>departments=departmentMapper.selectByExample(departmentExample);
        return new QueryVO(length,departments);
    }

    @Override
    public List<Department> getDepartmentDate() {
        DepartmentExample departmentExample=new DepartmentExample();
        departmentExample.or();
        List<Department> departments=departmentMapper.selectByExample(departmentExample);
        return departments;
    }

    @Override
    public boolean insertDepartment(Department department) {
        int insert=departmentMapper.insert(department);
        return insert!=0;
    }

    @Override
    public boolean deleteDepartment(String id) {
        int delete=departmentMapper.deleteByPrimaryKey(id);
        return delete!=0;
    }

    @Override
    public boolean updateDepartment(Department department) {
        int update=departmentMapper.updateByPrimaryKey(department);
        return update!=0;
    }

    @Override
    public boolean selectById(String id) {
        List<Department>departments=departmentMapper.queryById(id);
        return departments.size()!=0;
    }

    @Override
    public boolean selectByName(String name) {
        List<Department>departments=departmentMapper.queryByName(name);
        return departments.size()!=0;
    }

    @Override
    public QueryVO<Department> queryById(int page, int rows, String id) {
        PageHelper.startPage(page,rows);
        List<Department>departments=departmentMapper.queryById(id);
        int i=departments.size();
        return new QueryVO<>(i,departments);
    }

    @Override
    public QueryVO<Department> queryByName(int page, int rows, String name) {
        PageHelper.startPage(page,rows);
        List<Department>departments=departmentMapper.queryByName(name);
        int i=departments.size();
        return new QueryVO<>(i,departments);
    }

    @Override
    public Department getDataById(String id) {
        List<Department>departments=departmentMapper.queryById(id);
        return departments.get(0);
    }
}
