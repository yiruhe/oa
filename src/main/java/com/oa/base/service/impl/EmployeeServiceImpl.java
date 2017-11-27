package com.oa.base.service.impl;

import com.oa.base.dao.impl.EmployeeDaoImpl;
import com.oa.base.domain.Employee;
import com.oa.base.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Q
 * @version V1.0
 * @Description: ${todo}
 * @date 2017-11-23 23:22
 */
@Service
public class EmployeeServiceImpl implements IEmployeeService{

    @Autowired
    private EmployeeDaoImpl employeeDaoImpl;


    @Override
    public void save(Employee e) {

        employeeDaoImpl.save(e);

    }

    @Override
    public void update(Employee e) {


        employeeDaoImpl.update(e);
    }

    @Override
    public void delete(Long i) {

        employeeDaoImpl.delete(i);

    }

    @Override
    public Employee get(Long id) {

        return employeeDaoImpl.get(id);
    }

    @Override
    public List<Employee> queryAll() {

        return employeeDaoImpl.queryAll();
    }
}
