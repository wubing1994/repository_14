package com.cskaoyan.mapper.employee;

import com.cskaoyan.bean.employee.Employee;
import com.cskaoyan.bean.employee.EmployeeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EmployeeMapper {
    long countByExample(EmployeeExample example);

    int deleteByExample(EmployeeExample example);

    int deleteByPrimaryKey(String empId);

    int insert(Employee record);

    int insertSelective(Employee record);

    List<Employee> selectByExample(EmployeeExample example);

    Employee selectByPrimaryKey(String empId);

    int updateByExampleSelective(@Param("record") Employee record, @Param("example") EmployeeExample example);

    int updateByExample(@Param("record") Employee record, @Param("example") EmployeeExample example);

    int updateByPrimaryKeySelective(Employee record);

    int updateByPrimaryKey(Employee record);

    int countAll();

    List<Employee>selectByDepartment(@Param("department") String department);

    List<Employee>queryById(@Param("id")String id);

    List<Employee>queryByName(@Param("Name")String name);

    List<Employee>selectEmployees();

    List<Employee>selectAll();

    Employee selectById(@Param("id")String id);

    String selectEmpNameById(@Param("id")String id);
}