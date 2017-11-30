package com.oa.base.dao.impl;

import com.oa.base.dao.IGeneralDao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.lang.reflect.ParameterizedType;
import java.util.List;

/**
 * @author Q
 * @version V1.0
 * @Description: ${todo}
 * @date 2017-11-23 22:33
 */
public abstract class GeneralDaoImpl<T> implements IGeneralDao<T> {

    @Autowired
    protected SessionFactory sessionFactory;

    private Class<T> targetType;

    public GeneralDaoImpl(){

        ParameterizedType parameterizedType = (ParameterizedType)this.getClass().getGenericSuperclass();

        targetType = (Class<T>)parameterizedType.getActualTypeArguments()[0];

    }


    @Override
    public void save(T o){

        Session session = sessionFactory.getCurrentSession();

        session.save(o);
    }

    @Override
    public void update(T o){

        Session session = sessionFactory.getCurrentSession();

        session.update(o);
    }


    @Override
    public void delete(Long i){

        Session session = sessionFactory.getCurrentSession();

        //删除带有持久化对象,持久化对象有关联关系
        T o =  (T)session.get(targetType,i);

        session.delete(o);
    }

    @Override
    public T get(Long id){

        Session session = sessionFactory.getCurrentSession();

        return (T)session.get(targetType,id);
    }

    @Override
    public List<T> queryAll(){

        Session session = sessionFactory.getCurrentSession();

        return session.createCriteria(targetType).list();
    }

}
