package com.oa.test.user;

import com.oa.base.domain.Post;
import com.oa.base.service.IPostService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


/**
 * @author Q
 * @version V1.0
 * @Description: ${todo}
 * @date 2017-11-27 02:01
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring_dao/*.xml"})
public class TestPost {

    @Autowired
    private IPostService postServiceImpl;



    @Test
    public void testQuery(){

        ArrayList<Long> arrayList = new ArrayList();

        arrayList.add(1L);

        Set<Post> list =  postServiceImpl.queryPostByList(arrayList);

        System.out.println(list);

    }
}
