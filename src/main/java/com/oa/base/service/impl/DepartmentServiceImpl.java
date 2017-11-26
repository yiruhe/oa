package com.oa.base.service.impl;

import com.oa.base.dao.IDepartmentDao;
import com.oa.base.dao.impl.DepartmentDaoImpl;
import com.oa.base.domain.Department;
import com.oa.base.domain.Employee;
import com.oa.base.service.IDepartmentService;
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
public class DepartmentServiceImpl implements IDepartmentService{

    @Autowired
    private DepartmentDaoImpl departmentDaoImpl;


    @Override
    public void save(Department d) {

        departmentDaoImpl.save(d);

    }

    @Override
    public void update(Department d) {

        departmentDaoImpl.update(d);
    }

    @Override
    public void delete(Long i) {

        departmentDaoImpl.delete(i);

    }

    @Override
    public Department get(Long id) {

        return departmentDaoImpl.get(id);
    }

    @Override
    public List<Department> queryAll() {

        return departmentDaoImpl.queryAll();
    }
}
