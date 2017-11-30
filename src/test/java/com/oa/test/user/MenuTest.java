package com.oa.test.user;

import com.oa.base.domain.Menu;
import com.oa.base.service.IMenuService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author Q
 * @version V1.0
 * @Description: ${todo}
 * @date 2017-11-30 15:40
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring_dao/*.xml")
public class MenuTest {

    @Autowired
    private IMenuService menuServiceImpl;

    @Test
    public void testSave(){

        Menu menu = new Menu();

        menu.setIcon("css/zTreeStyle/img/diy/1_open.png");
        menu.setName("个人办公");
        menu.setIsParent(Menu.IS_PARENT_YES);
        menu.setParentId(0L);
        menuServiceImpl.save(menu);

    }

}
