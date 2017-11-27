package com.oa.base.dao;


import com.oa.base.domain.Post;

import java.util.List;
import java.util.Set;

/**
 * @author Q
 * @version V1.0
 * @Description: ${todo}
 * @date 2017-11-26 23:40
 */
public interface IPostDao<T> extends IGeneralDao<T>{

    /**
     *  根据List提供的id,查询相应的Post
     * @param ids
     * @return
     */
    Set<Post> queryPostByList(Long[] ids);
}
