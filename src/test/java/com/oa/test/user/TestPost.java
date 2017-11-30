package com.oa.test.user;

import com.oa.base.service.IPostService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;


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

//        Set<Post> list =  postServiceImpl.queryPostByList(arrayList);

//        System.out.println(list);

    }
}
