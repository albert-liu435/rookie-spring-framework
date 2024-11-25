package com.rookie.bigdata.mapper;

import com.rookie.bigdata.entity.Employee;

import java.util.List;

/**
 * @Class EmployeeMapper
 * @Description
 * @Author rookie
 * @Date 2024/11/25 18:25
 * @Version 1.0
 */
public interface EmployeeMapper {
    List<Employee> getAll();
}
