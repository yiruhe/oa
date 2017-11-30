package com.oa.base.service.impl;

import com.oa.base.dao.impl.EmployeeDaoImpl;
import com.oa.base.domain.Employee;
import com.oa.base.domain.Menu;
import com.oa.base.service.IEmployeeService;
import com.oa.base.service.IMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

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

    @Autowired
    private IMenuService menuServiceImpl;


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

    @Override
    public void savePrivilege(Long id,Long[] ids) {

        //查询出用户要保存的菜单对象
        List<Menu> list = menuServiceImpl.queryMenuByArray(ids);

        //查询出对应的用户
        Employee employee = employeeDaoImpl.get(id);

        //设置对应关系
        employee.setMenu(new HashSet<>(list));

        //自动保存
    }

    @Override
    public List<Menu> queryUserPrivilege(Long id) {


        Set<Menu> set =  get(id).getMenu();


        List<Menu> allMenu = menuServiceImpl.queryAll();

        for(Menu menu:allMenu){


            for(Menu m:set){


                if(menu.getId().equals(m.getId())){

                    menu.setChecked(true);

                    break;
                }


            }

        }


        return allMenu;
    }
}
