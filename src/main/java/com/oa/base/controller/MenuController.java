package com.oa.base.controller;

import com.oa.base.domain.Menu;
import com.oa.base.service.IMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Set;

/**
 * @author Q
 * @version V1.0
 * @Description: ${todo}
 * @date 2017-11-26 23:47
 */
@Controller
@RequestMapping("/menu")
public class MenuController {

    @Autowired
    private IMenuService menuServiceImpl;


    /**
     *  加载所有的节点
     * @return 返回一个List<Menu>
     */
    @RequestMapping("/list")
    @ResponseBody
    public List<Menu> index(){

        List<Menu> list = menuServiceImpl.queryAll();

        return list;
    }

    @RequestMapping("/query/Menu/parent/id/?")
    @ResponseBody
    public Set<Menu> queryMenuByParentId(Long id){

       return menuServiceImpl.queryMenuByParentId(id);
    }



}
