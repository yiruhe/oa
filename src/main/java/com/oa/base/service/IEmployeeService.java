package com.oa.base.service;

import com.oa.base.domain.Employee;
import com.oa.base.domain.Menu;

import java.util.List;

/**
 * @author Q
 * @version V1.0
 * @Description: ${todo}
 * @date 2017-11-23 23:23
 */
public interface IEmployeeService {
    /**
     *  保存一个对象到数据库
     * @param e
     */
    void save(Employee e);

    /**
     *  从数据库中更新一个对象数据
     * @param  e
     */
    void update(Employee  e);

    /**
     * 从数据库中删除一个对象数据
     * @param i
     */
    void delete(Long i);

    /**
     *  从数据库中获取一个对象数据
     * @param id
     * @return
     */

    Employee get(Long id);

    /**
     * 从数据库中获取所有的对象数据
     * @return
     */
    List<Employee> queryAll();

    /**
     * 保存用户的权限
     * @param ids
     */
    void savePrivilege(Long id,Long[] ids);

    /**
     *  查询当前用户id的权限
     * @param id
     * @return
     */
    List<Menu> queryUserPrivilege(Long id);
}
