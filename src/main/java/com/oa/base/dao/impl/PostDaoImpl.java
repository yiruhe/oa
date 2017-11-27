package com.oa.base.dao.impl;

import com.oa.base.dao.IPostDao;
import com.oa.base.domain.Post;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import java.util.*;

/**
 * @author Q
 * @version V1.0
 * @Description: ${todo}
 * @date 2017-11-26 23:39
 */
@Repository
public class PostDaoImpl extends GeneralDaoImpl<Post> implements IPostDao<Post> {



    @Override
    public Set<Post> queryPostByList(Long[] ids){

        Session session = sessionFactory.getCurrentSession();

        String hql = "FROM Post p WHERE p.id IN ( :userIdList )";


        System.out.println(ids);

         Query query = session.createQuery(hql);

            query.setParameterList("userIdList",ids);

         return new HashSet(query.list());
    }

}
