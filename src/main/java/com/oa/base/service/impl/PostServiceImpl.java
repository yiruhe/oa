package com.oa.base.service.impl;

import com.oa.base.dao.impl.PostDaoImpl;
import com.oa.base.domain.Post;
import com.oa.base.service.IPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

/**
 * @author Q
 * @version V1.0
 * @Description: ${todo}
 * @date 2017-11-23 23:22
 */
@Service
public class PostServiceImpl implements IPostService{

    @Autowired
    private PostDaoImpl postDaoImpl;


    @Override
    public void save(Post p) {

        postDaoImpl.save(p);

    }

    @Override
    public void update(Post p) {

        postDaoImpl.update(p);
    }

    @Override
    public void delete(Long i) {

        postDaoImpl.delete(i);

    }

    @Override
    public Post get(Long id) {

        return postDaoImpl.get(id);
    }

    @Override
    public List<Post> queryAll() {

        return postDaoImpl.queryAll();
    }

    @Override
    public Set<Post> queryPostByList(Long[] ids) {

        return postDaoImpl.queryPostByList(ids);
    }
}
