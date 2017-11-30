package com.oa.base.dao.impl;

import com.oa.base.dao.IMenuDao;
import com.oa.base.domain.Menu;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Q
 * @version V1.0
 * @Description: ${todo}
 * @date 2017-11-30 13:08
 */
@Repository
public class MenuDaoImpl extends GeneralDaoImpl<Menu> implements IMenuDao<Menu> {



    @Override
    public Set<Menu> queryMenuByParentId(Long id){

        Session session = super.sessionFactory.getCurrentSession();

        //根据父节点id查询子节点
        String hql = "FROM Menu m WHERE m.parentId = ?";

        Query query = session.createQuery(hql).setParameter(0,id);

        return new HashSet<>(query.list());

    }

    @Override
    public List<Menu> queryMenuByArray(Long[] ids) {

        Session session = super.sessionFactory.getCurrentSession();

        String hql = "FROM Menu m WHERE m.id in (:idArray)";

        Query query = session.createQuery(hql).setParameterList("idArray",ids);

        return query.list();
    }

}
