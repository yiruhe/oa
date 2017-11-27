package com.oa.test.user;

import com.oa.base.dao.IDepartmentDao;
import com.oa.base.dao.impl.DepartmentDaoImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author Q
 * @version V1.0
 * @Description: ${todo}
 * @date 2017-11-26 21:57
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring_dao/*.xml")
public class UserTest {

    @Autowired
    private IDepartmentDao departmentDaoImpl;


    @Test
    public void testGet(){

        

    }

}
