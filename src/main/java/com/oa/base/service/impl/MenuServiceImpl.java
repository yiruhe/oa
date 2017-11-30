package com.oa.base.service.impl;

import com.oa.base.dao.impl.MenuDaoImpl;
import com.oa.base.domain.Menu;
import com.oa.base.service.IMenuService;
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
public class MenuServiceImpl implements IMenuService{

    @Autowired
    private MenuDaoImpl menuDaoImpl;


    @Override
    public void save(Menu p) {

        menuDaoImpl.save(p);

    }

    @Override
    public void update(Menu p) {

        menuDaoImpl.update(p);
    }

    @Override
    public void delete(Long i) {

        menuDaoImpl.delete(i);

    }

    @Override
    public Menu get(Long id) {

        return menuDaoImpl.get(id);
    }

    @Override
    public List<Menu> queryAll() {

        return menuDaoImpl.queryAll();
    }

    @Override
    public Set<Menu> queryMenuByParentId(Long id){


        return menuDaoImpl.queryMenuByParentId(id);
    }

    @Override
    public List<Menu> queryMenuByArray(Long[] ids) {


        return  menuDaoImpl.queryMenuByArray(ids);
    }

}
