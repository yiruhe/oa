package com.oa.base.service;

import com.oa.base.domain.Post;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * @author Q
 * @version V1.0
 * @Description: ${todo}
 * @date 2017-11-23 23:23
 */
public interface IPostService {
    /**
     *  保存一个对象到数据库
     * @param p
     */
    void save(Post p);

    /**
     *  从数据库中更新一个对象数据
     * @param p
     */
    void update(Post p);

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

    Post get(Long id);

    /**
     * 从数据库中获取所有的对象数据
     * @return
     */
    List<Post> queryAll();

    /**
     *  根据List提供的id,查询相应的Post
     * @param ids
     * @return
     */
    Set<Post> queryPostByList(Long[] ids);
}
