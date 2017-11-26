package com.oa.base.dao;

import java.util.List;

/**
 * @author Q
 * @version V1.0
 * @Description: ${todo}
 * @date 2017-11-23 22:32
 */
public interface IGeneralDao<T> {

    /**
     *  保存一个对象到数据库
     * @param o
     */
    void save(T o);

    /**
     *  从数据库中更新一个对象数据
     * @param o
     */
    void update(T o);

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

    T get(Long id);

    /**
     * 从数据库中获取所有的对象数据
     * @return
     */
    List<T> queryAll();
}
